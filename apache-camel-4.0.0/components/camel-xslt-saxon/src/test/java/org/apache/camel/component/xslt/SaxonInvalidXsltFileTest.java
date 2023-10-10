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
package org.apache.camel.component.xslt;

import javax.xml.transform.TransformerException;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.jupiter.api.Test;

import static org.apache.camel.test.junit5.TestSupport.assertIsInstanceOf;
import static org.junit.jupiter.api.Assertions.fail;

public class SaxonInvalidXsltFileTest {

    @Test
    public void testInvalidStylesheet() {
        try {
            RouteBuilder builder = createRouteBuilder();
            try (CamelContext context = new DefaultCamelContext()) {
                context.addRoutes(builder);
                context.start();

                fail("Should have thrown an exception due XSL compilation error");
            }
        } catch (Exception e) {
            // expected
            assertIsInstanceOf(TransformerException.class, e.getCause().getCause().getCause());
        }
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("seda:a").to(
                        "xslt-saxon:org/apache/camel/component/xslt/notfound.xsl?transformerFactoryClass=net.sf.saxon.TransformerFactoryImpl");
            }
        };
    }

}
