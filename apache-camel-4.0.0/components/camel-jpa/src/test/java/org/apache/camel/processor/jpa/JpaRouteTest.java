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
package org.apache.camel.processor.jpa;

import java.util.HashMap;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jpa.JpaComponent;
import org.apache.camel.component.jpa.JpaConstants;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.examples.SendEmail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JpaRouteTest extends AbstractJpaTest {
    protected static final String SELECT_ALL_STRING = "select x from " + SendEmail.class.getName() + " x";

    @Test
    public void testRouteJpa() throws Exception {
        // should auto setup transaction manager and entity factory
        JpaComponent jpa = context.getComponent("jpa", JpaComponent.class);
        assertNotNull(jpa.getEntityManagerFactory(), "Should have been auto assigned");
        assertNotNull(jpa.getTransactionStrategy(), "Should have been auto assigned");

        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);
        mock.message(0).exchangeProperty(JpaConstants.ENTITY_MANAGER).isNotNull();
        mock.message(0).exchangeProperty(JpaConstants.ENTITY_MANAGER).isInstanceOf(HashMap.class);

        template.sendBody("direct:start", new SendEmail("someone@somewhere.org"));

        MockEndpoint.assertIsSatisfied(context);
        assertEntityInDB(1);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start").to("jpa://" + SendEmail.class.getName()).to("mock:result");
            }
        };
    }

    @Override
    protected String routeXml() {
        return "org/apache/camel/processor/jpa/springJpaRouteTest.xml";
    }

    @Override
    protected String selectAllString() {
        return SELECT_ALL_STRING;
    }
}
