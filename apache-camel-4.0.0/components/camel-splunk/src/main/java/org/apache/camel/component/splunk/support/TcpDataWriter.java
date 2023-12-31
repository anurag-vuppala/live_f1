/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.splunk.support;

import java.io.IOException;
import java.net.Socket;
import java.util.Optional;

import com.splunk.Args;
import com.splunk.Service;
import com.splunk.TcpInput;
import org.apache.camel.component.splunk.SplunkEndpoint;

public class TcpDataWriter extends SplunkDataWriter {
    private int port;
    private Optional<Integer> localPort;
    private String host;

    public TcpDataWriter(SplunkEndpoint endpoint, Args args) {
        super(endpoint, args);
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setLocalPort(Optional<Integer> localPort) {
        this.localPort = localPort;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    protected Socket createSocket(Service service) throws IOException {
        int p = localPort.orElseGet(() -> port);
        TcpInput input = (TcpInput) service.getInputs().get(String.valueOf(p));
        if (input == null) {
            throw new RuntimeException("no input defined for port " + port);
        }
        if (input.isDisabled()) {
            throw new RuntimeException(String.format("input on port %d is disabled", port));
        }
        return getSocket(input, service);
    }

    Socket getSocket(TcpInput tcpInput, Service service) throws IOException {
        if (localPort.isPresent() || host != null && !host.equals(tcpInput.getHost())) {
            String h = host == null ? service.getHost() : host;
            return new Socket(h, port);
        }

        return tcpInput.attach();
    }

}
