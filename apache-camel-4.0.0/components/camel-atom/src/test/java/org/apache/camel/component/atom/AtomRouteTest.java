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
package org.apache.camel.component.atom;

import java.util.List;

import com.apptasticsoftware.rssreader.Item;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisabledOnOs(OS.AIX)
public class AtomRouteTest extends CamelTestSupport {
    private static final Logger LOG = LoggerFactory.getLogger(AtomRouteTest.class);

    @Test
    void testFeedGetsUpdatedEvents() throws Exception {
        MockEndpoint endpoint = getMockEndpoint("mock:results");
        endpoint.expectedMessageCount(7);

        MockEndpoint.assertIsSatisfied(context);

        List<Exchange> list = endpoint.getReceivedExchanges();
        String[] expectedTitles = {
                "Speaking at the Irish Java Technology Conference on Thursday and Friday",
                "a great presentation on REST, JAX-WS and JSR 311",
                "my slides on ActiveMQ and Camel from last weeks Dublin Conference",
                "webcast today on Apache ActiveMQ",
                "Feedback on my Camel talk at the IJTC conference",
                "More thoughts on RESTful Message Queues",
                "ActiveMQ webinar archive available" };
        int counter = 0;
        for (Exchange exchange : list) {
            Item entry = exchange.getIn().getBody(Item.class);
            assertNotNull(entry, "No entry found for exchange: " + exchange);

            String expectedTitle = expectedTitles[counter];
            String title = entry.getTitle().get();
            assertEquals(expectedTitle, title, "Title of message " + counter);

            LOG.debug("<<<< {}", entry);

            counter++;
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("atom:file:src/test/data/feed.atom?delay=500").to("mock:results");
            }
        };
    }
}
