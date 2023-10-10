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
 * Perform cache operations on an Ignite cache or consume changes from a
 * continuous query.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteCacheEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Ignite Cache component.
     */
    public interface IgniteCacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedIgniteCacheEndpointConsumerBuilder advanced() {
            return (AdvancedIgniteCacheEndpointConsumerBuilder) this;
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
        default IgniteCacheEndpointConsumerBuilder propagateIncomingBodyIfNoReturnValue(
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
        default IgniteCacheEndpointConsumerBuilder propagateIncomingBodyIfNoReturnValue(
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
        default IgniteCacheEndpointConsumerBuilder treatCollectionsAsCacheObjects(
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
        default IgniteCacheEndpointConsumerBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Whether auto unsubscribe is enabled in the Continuous Query Consumer.
         * Default value notice: ContinuousQuery.DFLT_AUTO_UNSUBSCRIBE.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param autoUnsubscribe the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder autoUnsubscribe(
                boolean autoUnsubscribe) {
            doSetProperty("autoUnsubscribe", autoUnsubscribe);
            return this;
        }
        /**
         * Whether auto unsubscribe is enabled in the Continuous Query Consumer.
         * Default value notice: ContinuousQuery.DFLT_AUTO_UNSUBSCRIBE.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param autoUnsubscribe the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder autoUnsubscribe(
                String autoUnsubscribe) {
            doSetProperty("autoUnsubscribe", autoUnsubscribe);
            return this;
        }
        /**
         * Whether to process existing results that match the query. Used on
         * initialization of the Continuous Query Consumer.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param fireExistingQueryResults the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder fireExistingQueryResults(
                boolean fireExistingQueryResults) {
            doSetProperty("fireExistingQueryResults", fireExistingQueryResults);
            return this;
        }
        /**
         * Whether to process existing results that match the query. Used on
         * initialization of the Continuous Query Consumer.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param fireExistingQueryResults the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder fireExistingQueryResults(
                String fireExistingQueryResults) {
            doSetProperty("fireExistingQueryResults", fireExistingQueryResults);
            return this;
        }
        /**
         * Whether to pack each update in an individual Exchange, even if
         * multiple updates are received in one batch. Only used by the
         * Continuous Query Consumer.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param oneExchangePerUpdate the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder oneExchangePerUpdate(
                boolean oneExchangePerUpdate) {
            doSetProperty("oneExchangePerUpdate", oneExchangePerUpdate);
            return this;
        }
        /**
         * Whether to pack each update in an individual Exchange, even if
         * multiple updates are received in one batch. Only used by the
         * Continuous Query Consumer.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param oneExchangePerUpdate the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder oneExchangePerUpdate(
                String oneExchangePerUpdate) {
            doSetProperty("oneExchangePerUpdate", oneExchangePerUpdate);
            return this;
        }
        /**
         * The page size. Only used by the Continuous Query Consumer. Default
         * value notice: ContinuousQuery.DFLT_PAGE_SIZE.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param pageSize the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder pageSize(int pageSize) {
            doSetProperty("pageSize", pageSize);
            return this;
        }
        /**
         * The page size. Only used by the Continuous Query Consumer. Default
         * value notice: ContinuousQuery.DFLT_PAGE_SIZE.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param pageSize the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder pageSize(String pageSize) {
            doSetProperty("pageSize", pageSize);
            return this;
        }
        /**
         * The remote filter, only used by the Continuous Query Consumer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ignite.cache.CacheEntryEventSerializableFilter&amp;lt;java.lang.Object, java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param remoteFilter the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder remoteFilter(
                org.apache.ignite.cache.CacheEntryEventSerializableFilter<java.lang.Object, java.lang.Object> remoteFilter) {
            doSetProperty("remoteFilter", remoteFilter);
            return this;
        }
        /**
         * The remote filter, only used by the Continuous Query Consumer.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.ignite.cache.CacheEntryEventSerializableFilter&amp;lt;java.lang.Object, java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param remoteFilter the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder remoteFilter(
                String remoteFilter) {
            doSetProperty("remoteFilter", remoteFilter);
            return this;
        }
        /**
         * The time interval for the Continuous Query Consumer. Default value
         * notice: ContinuousQuery.DFLT_TIME_INTERVAL.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param timeInterval the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder timeInterval(
                long timeInterval) {
            doSetProperty("timeInterval", timeInterval);
            return this;
        }
        /**
         * The time interval for the Continuous Query Consumer. Default value
         * notice: ContinuousQuery.DFLT_TIME_INTERVAL.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param timeInterval the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointConsumerBuilder timeInterval(
                String timeInterval) {
            doSetProperty("timeInterval", timeInterval);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Ignite Cache component.
     */
    public interface AdvancedIgniteCacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default IgniteCacheEndpointConsumerBuilder basic() {
            return (IgniteCacheEndpointConsumerBuilder) this;
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
        default AdvancedIgniteCacheEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedIgniteCacheEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedIgniteCacheEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedIgniteCacheEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedIgniteCacheEndpointConsumerBuilder exchangePattern(
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
        default AdvancedIgniteCacheEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Ignite Cache component.
     */
    public interface IgniteCacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteCacheEndpointProducerBuilder advanced() {
            return (AdvancedIgniteCacheEndpointProducerBuilder) this;
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
        default IgniteCacheEndpointProducerBuilder propagateIncomingBodyIfNoReturnValue(
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
        default IgniteCacheEndpointProducerBuilder propagateIncomingBodyIfNoReturnValue(
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
        default IgniteCacheEndpointProducerBuilder treatCollectionsAsCacheObjects(
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
        default IgniteCacheEndpointProducerBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * The Query to execute, only needed for operations that require it, and
         * for the Continuous Query Consumer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ignite.cache.query.Query&amp;lt;javax.cache.Cache.Entry&amp;lt;java.lang.Object, java.lang.Object&amp;gt;&amp;gt;&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder query(
                org.apache.ignite.cache.query.Query<javax.cache.Cache.Entry<java.lang.Object, java.lang.Object>> query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * The Query to execute, only needed for operations that require it, and
         * for the Continuous Query Consumer.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.ignite.cache.query.Query&amp;lt;javax.cache.Cache.Entry&amp;lt;java.lang.Object, java.lang.Object&amp;gt;&amp;gt;&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * The CachePeekMode, only needed for operations that require it
         * (IgniteCacheOperation#SIZE).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ignite.cache.CachePeekMode&lt;/code&gt; type.
         * 
         * Default: ALL
         * Group: producer
         * 
         * @param cachePeekMode the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder cachePeekMode(
                org.apache.ignite.cache.CachePeekMode cachePeekMode) {
            doSetProperty("cachePeekMode", cachePeekMode);
            return this;
        }
        /**
         * The CachePeekMode, only needed for operations that require it
         * (IgniteCacheOperation#SIZE).
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.ignite.cache.CachePeekMode&lt;/code&gt; type.
         * 
         * Default: ALL
         * Group: producer
         * 
         * @param cachePeekMode the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder cachePeekMode(
                String cachePeekMode) {
            doSetProperty("cachePeekMode", cachePeekMode);
            return this;
        }
        /**
         * Whether to fail the initialization if the cache doesn't exist.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param failIfInexistentCache the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder failIfInexistentCache(
                boolean failIfInexistentCache) {
            doSetProperty("failIfInexistentCache", failIfInexistentCache);
            return this;
        }
        /**
         * Whether to fail the initialization if the cache doesn't exist.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param failIfInexistentCache the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder failIfInexistentCache(
                String failIfInexistentCache) {
            doSetProperty("failIfInexistentCache", failIfInexistentCache);
            return this;
        }
        /**
         * The cache operation to invoke. Possible values: GET, PUT, REMOVE,
         * SIZE, REBALANCE, QUERY, CLEAR.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.cache.IgniteCacheOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder operation(
                org.apache.camel.component.ignite.cache.IgniteCacheOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The cache operation to invoke. Possible values: GET, PUT, REMOVE,
         * SIZE, REBALANCE, QUERY, CLEAR.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.cache.IgniteCacheOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default IgniteCacheEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Ignite Cache component.
     */
    public interface AdvancedIgniteCacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default IgniteCacheEndpointProducerBuilder basic() {
            return (IgniteCacheEndpointProducerBuilder) this;
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
        default AdvancedIgniteCacheEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedIgniteCacheEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Ignite Cache component.
     */
    public interface IgniteCacheEndpointBuilder
            extends
                IgniteCacheEndpointConsumerBuilder,
                IgniteCacheEndpointProducerBuilder {
        default AdvancedIgniteCacheEndpointBuilder advanced() {
            return (AdvancedIgniteCacheEndpointBuilder) this;
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
        default IgniteCacheEndpointBuilder propagateIncomingBodyIfNoReturnValue(
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
        default IgniteCacheEndpointBuilder propagateIncomingBodyIfNoReturnValue(
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
        default IgniteCacheEndpointBuilder treatCollectionsAsCacheObjects(
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
        default IgniteCacheEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Cache component.
     */
    public interface AdvancedIgniteCacheEndpointBuilder
            extends
                AdvancedIgniteCacheEndpointConsumerBuilder,
                AdvancedIgniteCacheEndpointProducerBuilder {
        default IgniteCacheEndpointBuilder basic() {
            return (IgniteCacheEndpointBuilder) this;
        }
    }

    public interface IgniteCacheBuilders {
        /**
         * Ignite Cache (camel-ignite)
         * Perform cache operations on an Ignite cache or consume changes from a
         * continuous query.
         * 
         * Category: cache,clustering
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * @return the dsl builder for the headers' name.
         */
        default IgniteCacheHeaderNameBuilder igniteCache() {
            return IgniteCacheHeaderNameBuilder.INSTANCE;
        }
        /**
         * Ignite Cache (camel-ignite)
         * Perform cache operations on an Ignite cache or consume changes from a
         * continuous query.
         * 
         * Category: cache,clustering
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-cache:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The cache name.
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default IgniteCacheEndpointBuilder igniteCache(String path) {
            return IgniteCacheEndpointBuilderFactory.endpointBuilder("ignite-cache", path);
        }
        /**
         * Ignite Cache (camel-ignite)
         * Perform cache operations on an Ignite cache or consume changes from a
         * continuous query.
         * 
         * Category: cache,clustering
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-cache:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The cache name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default IgniteCacheEndpointBuilder igniteCache(
                String componentName,
                String path) {
            return IgniteCacheEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Ignite Cache component.
     */
    public static class IgniteCacheHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final IgniteCacheHeaderNameBuilder INSTANCE = new IgniteCacheHeaderNameBuilder();

        /**
         * The cache key for the entry value in the message body.
         * 
         * The option is a: {@code Object} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code IgniteCacheKey}.
         */
        public String igniteCacheKey() {
            return "IgniteCacheKey";
        }

        /**
         * The query to run when invoking the QUERY operation.
         * 
         * The option is a: {@code org.apache.ignite.cache.query.Query} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteCacheQuery}.
         */
        public String igniteCacheQuery() {
            return "IgniteCacheQuery";
        }

        /**
         * Allows you to dynamically change the cache operation to execute.
         * 
         * The option is a: {@code
         * org.apache.camel.component.ignite.cache.IgniteCacheOperation} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteCacheOperation}.
         */
        public String igniteCacheOperation() {
            return "IgniteCacheOperation";
        }

        /**
         * Allows you to dynamically change the cache peek mode when running the
         * SIZE operation.
         * 
         * The option is a: {@code org.apache.ignite.cache.CachePeekMode} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteCachePeekMode}.
         */
        public String igniteCachePeekMode() {
            return "IgniteCachePeekMode";
        }

        /**
         * This header carries the received event type when using the continuous
         * query consumer.
         * 
         * The option is a: {@code javax.cache.event.EventType} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code IgniteCacheEventType}.
         */
        public String igniteCacheEventType() {
            return "IgniteCacheEventType";
        }

        /**
         * This header carries the cache name for which a continuous query event
         * was received (consumer). It does not allow you to dynamically change
         * the cache against which a producer operation is performed. Use EIPs
         * for that (e.g. recipient list, dynamic router).
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code IgniteCacheName}.
         */
        public String igniteCacheName() {
            return "IgniteCacheName";
        }

        /**
         * (producer) The old cache value to be replaced when invoking the
         * REPLACE operation. (consumer) This header carries the old cache value
         * when passed in the incoming cache event.
         * 
         * The option is a: {@code Object} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code IgniteCacheOldValue}.
         */
        public String igniteCacheOldValue() {
            return "IgniteCacheOldValue";
        }
    }
    static IgniteCacheEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteCacheEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteCacheEndpointBuilder, AdvancedIgniteCacheEndpointBuilder {
            public IgniteCacheEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteCacheEndpointBuilderImpl(path);
    }
}