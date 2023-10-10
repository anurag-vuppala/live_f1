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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.hazelcast.map.HazelcastMapComponent;

/**
 * Perform operations on Hazelcast distributed map.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface HazelcastMapComponentBuilderFactory {

    /**
     * Hazelcast Map (camel-hazelcast)
     * Perform operations on Hazelcast distributed map.
     * 
     * Category: cache,clustering
     * Since: 2.7
     * Maven coordinates: org.apache.camel:camel-hazelcast
     * 
     * @return the dsl builder
     */
    static HazelcastMapComponentBuilder hazelcastMap() {
        return new HazelcastMapComponentBuilderImpl();
    }

    /**
     * Builder for the Hazelcast Map component.
     */
    interface HazelcastMapComponentBuilder
            extends
                ComponentBuilder<HazelcastMapComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default HazelcastMapComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default HazelcastMapComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default HazelcastMapComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastMapComponentBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast mode reference which kind of instance should be used.
         * If you don't specify the mode, then the node mode will be the
         * default.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: node
         * Group: advanced
         * 
         * @param hazelcastMode the value to set
         * @return the dsl builder
         */
        default HazelcastMapComponentBuilder hazelcastMode(
                java.lang.String hazelcastMode) {
            doSetProperty("hazelcastMode", hazelcastMode);
            return this;
        }
    }

    class HazelcastMapComponentBuilderImpl
            extends
                AbstractComponentBuilder<HazelcastMapComponent>
            implements
                HazelcastMapComponentBuilder {
        @Override
        protected HazelcastMapComponent buildConcreteComponent() {
            return new HazelcastMapComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((HazelcastMapComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((HazelcastMapComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((HazelcastMapComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "hazelcastInstance": ((HazelcastMapComponent) component).setHazelcastInstance((com.hazelcast.core.HazelcastInstance) value); return true;
            case "hazelcastMode": ((HazelcastMapComponent) component).setHazelcastMode((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}