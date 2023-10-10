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
import org.apache.camel.component.micrometer.MicrometerComponent;

/**
 * Collect various metrics directly from Camel routes using the Micrometer
 * library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MicrometerComponentBuilderFactory {

    /**
     * Micrometer (camel-micrometer)
     * Collect various metrics directly from Camel routes using the Micrometer
     * library.
     * 
     * Category: monitoring
     * Since: 2.22
     * Maven coordinates: org.apache.camel:camel-micrometer
     * 
     * @return the dsl builder
     */
    static MicrometerComponentBuilder micrometer() {
        return new MicrometerComponentBuilderImpl();
    }

    /**
     * Builder for the Micrometer component.
     */
    interface MicrometerComponentBuilder
            extends
                ComponentBuilder<MicrometerComponent> {
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
        default MicrometerComponentBuilder lazyStartProducer(
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
        default MicrometerComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a custom configured MetricRegistry.
         * 
         * The option is a:
         * &lt;code&gt;io.micrometer.core.instrument.MeterRegistry&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param metricsRegistry the value to set
         * @return the dsl builder
         */
        default MicrometerComponentBuilder metricsRegistry(
                io.micrometer.core.instrument.MeterRegistry metricsRegistry) {
            doSetProperty("metricsRegistry", metricsRegistry);
            return this;
        }
    }

    class MicrometerComponentBuilderImpl
            extends
                AbstractComponentBuilder<MicrometerComponent>
            implements
                MicrometerComponentBuilder {
        @Override
        protected MicrometerComponent buildConcreteComponent() {
            return new MicrometerComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((MicrometerComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((MicrometerComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "metricsRegistry": ((MicrometerComponent) component).setMetricsRegistry((io.micrometer.core.instrument.MeterRegistry) value); return true;
            default: return false;
            }
        }
    }
}