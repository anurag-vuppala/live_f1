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
package org.apache.camel.component.jetty;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HttpClientRouteEnableChunkedTest extends BaseJettyTest {

    private static final Logger LOG = LoggerFactory.getLogger(HttpClientRouteEnableChunkedTest.class);

    @Test
    public void testHttpRouteWithOption() throws Exception {
        testHttpClient("direct:start2");
    }

    private void testHttpClient(String uri) throws Exception {
        System.setProperty("HTTPClient.dontChunkRequests", "yes");

        MockEndpoint mockEndpoint = getMockEndpoint("mock:a");
        mockEndpoint.expectedBodiesReceived("<b>Hello World</b>");

        template.requestBodyAndHeader(uri, new ByteArrayInputStream("This is a test".getBytes()), "Content-Type",
                "application/xml");

        mockEndpoint.assertIsSatisfied();
        List<Exchange> list = mockEndpoint.getReceivedExchanges();
        Exchange exchange = list.get(0);
        assertNotNull(exchange, "exchange");

        Message in = exchange.getIn();
        assertNotNull(in, "in");

        Map<String, Object> headers = in.getHeaders();

        LOG.info("Headers: {}", headers);

        assertTrue(headers.size() > 0, "Should be more than one header but was: " + headers);

        // should get the Content-Length
        assertEquals("chunked", headers.get("Transfer-Encoding"), "Should get the transfer-encoding as chunked");
        // remove the system property
        System.clearProperty("HTTPClient.dontChunkRequests");
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                errorHandler(noErrorHandler());

                from("direct:start2").to("http://localhost:{{port}}/hello").to("mock:a");

                Processor proc = new Processor() {
                    public void process(Exchange exchange) {
                        ByteArrayInputStream bis = new ByteArrayInputStream("<b>Hello World</b>".getBytes());
                        exchange.getMessage().setBody(bis);
                    }
                };

                from("jetty:http://localhost:{{port}}/hello").process(proc);
            }
        };
    }

}
