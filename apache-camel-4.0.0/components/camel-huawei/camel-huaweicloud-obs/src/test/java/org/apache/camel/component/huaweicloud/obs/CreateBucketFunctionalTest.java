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
package org.apache.camel.component.huaweicloud.obs;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.huaweicloud.common.models.ServiceKeys;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateBucketFunctionalTest extends CamelTestSupport {

    private static final String ACCESS_KEY = "replace_this_with_access_key";
    private static final String SECRET_KEY = "replace_this_with_secret_key";
    private static final String REGION = "replace_this_with_region";
    private static final String BUCKET_NAME = "replace_this_with_bucket_name";
    private static final String BUCKET_LOCATION = "replace_this_with_bucket_location";

    @BindToRegistry("serviceKeys")
    ServiceKeys serviceKeys = new ServiceKeys(ACCESS_KEY, SECRET_KEY);

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:create_bucket")
                        .to("hwcloud-obs:createBucket?" +
                            "serviceKeys=#serviceKeys" +
                            "&bucketName=" + BUCKET_NAME +
                            "&bucketLocation=" + BUCKET_LOCATION +
                            "&region=" + REGION +
                            "&ignoreSslVerification=true")
                        .log("Create bucket successful")
                        .to("log:LOG?showAll=true")
                        .to("mock:create_bucket_result");
            }
        };
    }

    /**
     * The following test cases should be manually enabled to perform test against the actual HuaweiCloud OBS server
     * with real user credentials. To perform this test, manually comment out the @Ignore annotation and enter relevant
     * service parameters in the placeholders above (static variables of this test class)
     *
     * @throws Exception
     */
    @Disabled("Manually enable this once you configure the parameters in the placeholders above")
    @Test
    public void testCreateBucket() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:create_bucket_result");
        mock.expectedMinimumMessageCount(1);
        template.sendBody("direct:create_bucket", "sampleBody");
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        assertNotNull(responseExchange.getIn().getBody(String.class));
        assertTrue(responseExchange.getIn().getBody(String.class).length() > 0);
    }
}
