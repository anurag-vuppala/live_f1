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
package org.apache.camel.component.netty;

import java.io.FileInputStream;
import java.io.InputStream;

import io.netty.channel.ChannelHandler;
import org.apache.camel.BindToRegistry;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.converter.IOConverter;
import org.apache.camel.util.IOHelper;
import org.junit.jupiter.api.Test;

public class NettyTCPAsyncTest extends BaseNettyTest {

    @EndpointInject("mock:result")
    protected MockEndpoint resultEndpoint;

    private void sendFile(String uri) {
        template.send(uri, new Processor() {
            public void process(Exchange exchange) throws Exception {
                // Read from an input stream
                InputStream is = IOHelper.buffered(new FileInputStream("src/test/resources/test.txt"));

                byte buffer[] = IOConverter.toBytes(is);
                is.close();

                // Set the property of the charset encoding
                exchange.setProperty(Exchange.CHARSET_NAME, "UTF-8");
                Message in = exchange.getIn();
                in.setBody(buffer);
            }
        });
    }

    @BindToRegistry("encoder")
    public ChannelHandler getEncoder() {
        return ChannelHandlerFactories.newByteArrayEncoder("tcp");
    }

    @BindToRegistry("decoder")
    public ChannelHandler getDecoder() {
        return ChannelHandlerFactories.newByteArrayDecoder("tcp");
    }

    @Test
    public void testTCPInOnlyWithNettyConsumer() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);
        sendFile("netty:tcp://localhost:{{port}}?sync=false&encoders=#encoder");

        mock.assertIsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("netty:tcp://localhost:{{port}}?sync=false&decoders=#decoder")
                        .to("log:result")
                        .to("mock:result");
            }
        };
    }

}
