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
 * Send and receive messages from an Ignite topic.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteMessagingEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Ignite Messaging component.
     */
    public interface IgniteMessagingEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedIgniteMessagingEndpointConsumerBuilder advanced() {
            return (AdvancedIgniteMessagingEndpointConsumerBuilder) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointConsumerBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointConsumerBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointConsumerBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointConsumerBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Ignite Messaging
     * component.
     */
    public interface AdvancedIgniteMessagingEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default IgniteMessagingEndpointConsumerBuilder basic() {
            return (IgniteMessagingEndpointConsumerBuilder) this;
        }
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
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteMessagingEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteMessagingEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteMessagingEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteMessagingEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteMessagingEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteMessagingEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Ignite Messaging component.
     */
    public interface IgniteMessagingEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteMessagingEndpointProducerBuilder advanced() {
            return (AdvancedIgniteMessagingEndpointProducerBuilder) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * The cluster group expression.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.ClusterGroupExpression&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clusterGroupExpression the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder clusterGroupExpression(
                org.apache.camel.component.ignite.ClusterGroupExpression clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * The cluster group expression.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.ClusterGroupExpression&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clusterGroupExpression the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder clusterGroupExpression(
                String clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * The send mode to use. Possible values: UNORDERED, ORDERED.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.messaging.IgniteMessagingSendMode&lt;/code&gt; type.
         * 
         * Default: UNORDERED
         * Group: producer
         * 
         * @param sendMode the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder sendMode(
                org.apache.camel.component.ignite.messaging.IgniteMessagingSendMode sendMode) {
            doSetProperty("sendMode", sendMode);
            return this;
        }
        /**
         * The send mode to use. Possible values: UNORDERED, ORDERED.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.messaging.IgniteMessagingSendMode&lt;/code&gt; type.
         * 
         * Default: UNORDERED
         * Group: producer
         * 
         * @param sendMode the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder sendMode(String sendMode) {
            doSetProperty("sendMode", sendMode);
            return this;
        }
        /**
         * The timeout for the send operation when using ordered messages.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder timeout(Long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The timeout for the send operation when using ordered messages.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Ignite Messaging
     * component.
     */
    public interface AdvancedIgniteMessagingEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default IgniteMessagingEndpointProducerBuilder basic() {
            return (IgniteMessagingEndpointProducerBuilder) this;
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
        default AdvancedIgniteMessagingEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedIgniteMessagingEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Ignite Messaging component.
     */
    public interface IgniteMessagingEndpointBuilder
            extends
                IgniteMessagingEndpointConsumerBuilder,
                IgniteMessagingEndpointProducerBuilder {
        default AdvancedIgniteMessagingEndpointBuilder advanced() {
            return (AdvancedIgniteMessagingEndpointBuilder) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteMessagingEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Messaging component.
     */
    public interface AdvancedIgniteMessagingEndpointBuilder
            extends
                AdvancedIgniteMessagingEndpointConsumerBuilder,
                AdvancedIgniteMessagingEndpointProducerBuilder {
        default IgniteMessagingEndpointBuilder basic() {
            return (IgniteMessagingEndpointBuilder) this;
        }
    }

    public interface IgniteMessagingBuilders {
        /**
         * Ignite Messaging (camel-ignite)
         * Send and receive messages from an Ignite topic.
         * 
         * Category: messaging
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * @return the dsl builder for the headers' name.
         */
        default IgniteMessagingHeaderNameBuilder igniteMessaging() {
            return IgniteMessagingHeaderNameBuilder.INSTANCE;
        }
        /**
         * Ignite Messaging (camel-ignite)
         * Send and receive messages from an Ignite topic.
         * 
         * Category: messaging
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-messaging:topic</code>
         * 
         * Path parameter: topic (required)
         * The topic name.
         * 
         * @param path topic
         * @return the dsl builder
         */
        default IgniteMessagingEndpointBuilder igniteMessaging(String path) {
            return IgniteMessagingEndpointBuilderFactory.endpointBuilder("ignite-messaging", path);
        }
        /**
         * Ignite Messaging (camel-ignite)
         * Send and receive messages from an Ignite topic.
         * 
         * Category: messaging
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-messaging:topic</code>
         * 
         * Path parameter: topic (required)
         * The topic name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path topic
         * @return the dsl builder
         */
        default IgniteMessagingEndpointBuilder igniteMessaging(
                String componentName,
                String path) {
            return IgniteMessagingEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Ignite Messaging component.
     */
    public static class IgniteMessagingHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final IgniteMessagingHeaderNameBuilder INSTANCE = new IgniteMessagingHeaderNameBuilder();

        /**
         * (producer) Allows you to dynamically change the topic to send
         * messages to. (consumer) It also carries the topic on which a message
         * was received.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code IgniteMessagingTopic}.
         */
        public String igniteMessagingTopic() {
            return "IgniteMessagingTopic";
        }

        /**
         * This header is filled in with the UUID of the subscription when a
         * message arrives.
         * 
         * The option is a: {@code java.util.UUID} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code IgniteMessagingUUID}.
         */
        public String igniteMessagingUUID() {
            return "IgniteMessagingUUID";
        }
    }
    static IgniteMessagingEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteMessagingEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteMessagingEndpointBuilder, AdvancedIgniteMessagingEndpointBuilder {
            public IgniteMessagingEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteMessagingEndpointBuilderImpl(path);
    }
}