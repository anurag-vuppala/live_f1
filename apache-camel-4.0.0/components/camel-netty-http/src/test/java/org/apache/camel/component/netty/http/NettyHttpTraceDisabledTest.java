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
package org.apache.camel.component.netty.http;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.hc.client5.http.classic.methods.HttpTrace;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NettyHttpTraceDisabledTest extends BaseNettyTest {

    @RegisterExtension
    AvailablePortFinder.Port portTraceOn = AvailablePortFinder.find();
    @RegisterExtension
    AvailablePortFinder.Port portTraceOff = AvailablePortFinder.find();

    @Test
    public void testTraceDisabled() throws Exception {
        HttpTrace trace = new HttpTrace("http://localhost:" + portTraceOff + "/myservice");
        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(trace)) {
            // TRACE shouldn't be allowed by default
            assertEquals(405, response.getCode());
        }
    }

    @Test
    public void testTraceEnabled() throws Exception {
        HttpTrace trace = new HttpTrace("http://localhost:" + portTraceOn + "/myservice");
        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(trace)) {
            // TRACE is allowed
            assertEquals(200, response.getCode());
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("netty-http:http://localhost:" + portTraceOff + "/myservice").to("log:foo");
                from("netty-http:http://localhost:" + portTraceOn + "/myservice?traceEnabled=true").to("log:bar");
            }
        };
    }

}
