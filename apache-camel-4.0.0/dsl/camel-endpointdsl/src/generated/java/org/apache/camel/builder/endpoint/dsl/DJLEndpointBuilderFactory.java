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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Infer Deep Learning models from message exchanges data using Deep Java
 * Library (DJL).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DJLEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Deep Java Library component.
     */
    public interface DJLEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDJLEndpointBuilder advanced() {
            return (AdvancedDJLEndpointBuilder) this;
        }
        /**
         * Model Artifact.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param artifactId the value to set
         * @return the dsl builder
         */
        default DJLEndpointBuilder artifactId(String artifactId) {
            doSetProperty("artifactId", artifactId);
            return this;
        }
        /**
         * Model.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param model the value to set
         * @return the dsl builder
         */
        default DJLEndpointBuilder model(String model) {
            doSetProperty("model", model);
            return this;
        }
        /**
         * Translator.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param translator the value to set
         * @return the dsl builder
         */
        default DJLEndpointBuilder translator(String translator) {
            doSetProperty("translator", translator);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Deep Java Library component.
     */
    public interface AdvancedDJLEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DJLEndpointBuilder basic() {
            return (DJLEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDJLEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDJLEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface DJLBuilders {
        /**
         * Deep Java Library (camel-djl)
         * Infer Deep Learning models from message exchanges data using Deep
         * Java Library (DJL).
         * 
         * Category: ai
         * Since: 3.3
         * Maven coordinates: org.apache.camel:camel-djl
         * 
         * Syntax: <code>djl:application</code>
         * 
         * Path parameter: application (required)
         * Application name
         * 
         * @param path application
         * @return the dsl builder
         */
        default DJLEndpointBuilder djl(String path) {
            return DJLEndpointBuilderFactory.endpointBuilder("djl", path);
        }
        /**
         * Deep Java Library (camel-djl)
         * Infer Deep Learning models from message exchanges data using Deep
         * Java Library (DJL).
         * 
         * Category: ai
         * Since: 3.3
         * Maven coordinates: org.apache.camel:camel-djl
         * 
         * Syntax: <code>djl:application</code>
         * 
         * Path parameter: application (required)
         * Application name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path application
         * @return the dsl builder
         */
        default DJLEndpointBuilder djl(String componentName, String path) {
            return DJLEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DJLEndpointBuilder endpointBuilder(String componentName, String path) {
        class DJLEndpointBuilderImpl extends AbstractEndpointBuilder implements DJLEndpointBuilder, AdvancedDJLEndpointBuilder {
            public DJLEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DJLEndpointBuilderImpl(path);
    }
}