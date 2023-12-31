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
package org.apache.camel.component.hazelcast.set;

import java.util.Map;

import com.hazelcast.core.HazelcastInstance;
import org.apache.camel.CamelContext;
import org.apache.camel.component.hazelcast.HazelcastDefaultComponent;
import org.apache.camel.component.hazelcast.HazelcastDefaultEndpoint;
import org.apache.camel.spi.annotations.Component;

@Component("hazelcast-set")
public class HazelcastSetComponent extends HazelcastDefaultComponent {

    public HazelcastSetComponent() {
    }

    public HazelcastSetComponent(final CamelContext context) {
        super(context);
    }

    @Override
    protected HazelcastDefaultEndpoint doCreateEndpoint(
            String uri, String remaining, Map<String, Object> parameters, HazelcastInstance hzInstance)
            throws Exception {
        return new HazelcastSetEndpoint(hzInstance, uri, this, remaining);
    }

}
