## ------------------------------------------------------------------------
## Licensed to the Apache Software Foundation (ASF) under one or more
## contributor license agreements.  See the NOTICE file distributed with
## this work for additional information regarding copyright ownership.
## The ASF licenses this file to You under the Apache License, Version 2.0
## (the "License"); you may not use this file except in compliance with
## the License.  You may obtain a copy of the License at
##
## http://www.apache.org/licenses/LICENSE-2.0
##
## Unless required by applicable law or agreed to in writing, software
## distributed under the License is distributed on an "AS IS" BASIS,
## WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
## See the License for the specific language governing permissions and
## limitations under the License.
## ------------------------------------------------------------------------
package ${package};

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.TestInstance;

/**
 * Abstract base class for ${name} Integration tests generated by Camel API component maven plugin.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class Abstract${name}TestSupport extends CamelTestSupport {

    @Override
    protected CamelContext createCamelContext() throws Exception {

        final CamelContext context = super.createCamelContext();

        final ${name}Configuration configuration = new ${name}Configuration();
        // set configuration properties here

        // add ${name}Component to Camel context
        final ${name}Component component = new ${name}Component(context);
        component.setConfiguration(configuration);
        context.addComponent("${scheme}", component);

        return context;
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBodyAndHeaders(String endpointUri, Object body, Map<String, Object> headers)
        throws CamelExecutionException {
        return (T) template().requestBodyAndHeaders(endpointUri, body, headers);
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBody(String endpoint, Object body) throws CamelExecutionException {
        return (T) template().requestBody(endpoint, body);
    }
}