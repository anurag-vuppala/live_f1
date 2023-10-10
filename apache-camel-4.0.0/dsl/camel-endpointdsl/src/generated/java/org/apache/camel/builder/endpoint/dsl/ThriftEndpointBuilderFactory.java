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
 * Call and expose remote procedures (RPC) with Apache Thrift data format and
 * serialization mechanism.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ThriftEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Thrift component.
     */
    public interface ThriftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedThriftEndpointConsumerBuilder advanced() {
            return (AdvancedThriftEndpointConsumerBuilder) this;
        }
        /**
         * Protocol compression mechanism type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftCompressionType&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: common
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder compressionType(
                org.apache.camel.component.thrift.ThriftCompressionType compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftCompressionType&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: common
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder compressionType(
                String compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftExchangeProtocol&lt;/code&gt; type.
         * 
         * Default: BINARY
         * Group: common
         * 
         * @param exchangeProtocol the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder exchangeProtocol(
                org.apache.camel.component.thrift.ThriftExchangeProtocol exchangeProtocol) {
            doSetProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftExchangeProtocol&lt;/code&gt; type.
         * 
         * Default: BINARY
         * Group: common
         * 
         * @param exchangeProtocol the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder exchangeProtocol(
                String exchangeProtocol) {
            doSetProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Client timeout for consumers.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param clientTimeout the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder clientTimeout(int clientTimeout) {
            doSetProperty("clientTimeout", clientTimeout);
            return this;
        }
        /**
         * Client timeout for consumers.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param clientTimeout the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder clientTimeout(String clientTimeout) {
            doSetProperty("clientTimeout", clientTimeout);
            return this;
        }
        /**
         * The Thrift server consumer max thread pool size.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param maxPoolSize the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder maxPoolSize(int maxPoolSize) {
            doSetProperty("maxPoolSize", maxPoolSize);
            return this;
        }
        /**
         * The Thrift server consumer max thread pool size.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param maxPoolSize the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder maxPoolSize(String maxPoolSize) {
            doSetProperty("maxPoolSize", maxPoolSize);
            return this;
        }
        /**
         * The Thrift server consumer initial thread pool size.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param poolSize the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder poolSize(int poolSize) {
            doSetProperty("poolSize", poolSize);
            return this;
        }
        /**
         * The Thrift server consumer initial thread pool size.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param poolSize the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder poolSize(String poolSize) {
            doSetProperty("poolSize", poolSize);
            return this;
        }
        /**
         * Security negotiation type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftNegotiationType&lt;/code&gt; type.
         * 
         * Default: PLAINTEXT
         * Group: security
         * 
         * @param negotiationType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder negotiationType(
                org.apache.camel.component.thrift.ThriftNegotiationType negotiationType) {
            doSetProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Security negotiation type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftNegotiationType&lt;/code&gt; type.
         * 
         * Default: PLAINTEXT
         * Group: security
         * 
         * @param negotiationType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder negotiationType(
                String negotiationType) {
            doSetProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslParameters the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder sslParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslParameters) {
            doSetProperty("sslParameters", sslParameters);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslParameters the value to set
         * @return the dsl builder
         */
        default ThriftEndpointConsumerBuilder sslParameters(String sslParameters) {
            doSetProperty("sslParameters", sslParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Thrift component.
     */
    public interface AdvancedThriftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ThriftEndpointConsumerBuilder basic() {
            return (ThriftEndpointConsumerBuilder) this;
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
        default AdvancedThriftEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedThriftEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedThriftEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedThriftEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedThriftEndpointConsumerBuilder exchangePattern(
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
        default AdvancedThriftEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedThriftEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedThriftEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Thrift component.
     */
    public interface ThriftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedThriftEndpointProducerBuilder advanced() {
            return (AdvancedThriftEndpointProducerBuilder) this;
        }
        /**
         * Protocol compression mechanism type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftCompressionType&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: common
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder compressionType(
                org.apache.camel.component.thrift.ThriftCompressionType compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftCompressionType&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: common
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder compressionType(
                String compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftExchangeProtocol&lt;/code&gt; type.
         * 
         * Default: BINARY
         * Group: common
         * 
         * @param exchangeProtocol the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder exchangeProtocol(
                org.apache.camel.component.thrift.ThriftExchangeProtocol exchangeProtocol) {
            doSetProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftExchangeProtocol&lt;/code&gt; type.
         * 
         * Default: BINARY
         * Group: common
         * 
         * @param exchangeProtocol the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder exchangeProtocol(
                String exchangeProtocol) {
            doSetProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * The Thrift invoked method name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param method the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder method(String method) {
            doSetProperty("method", method);
            return this;
        }
        /**
         * Security negotiation type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftNegotiationType&lt;/code&gt; type.
         * 
         * Default: PLAINTEXT
         * Group: security
         * 
         * @param negotiationType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder negotiationType(
                org.apache.camel.component.thrift.ThriftNegotiationType negotiationType) {
            doSetProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Security negotiation type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftNegotiationType&lt;/code&gt; type.
         * 
         * Default: PLAINTEXT
         * Group: security
         * 
         * @param negotiationType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder negotiationType(
                String negotiationType) {
            doSetProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslParameters the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder sslParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslParameters) {
            doSetProperty("sslParameters", sslParameters);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslParameters the value to set
         * @return the dsl builder
         */
        default ThriftEndpointProducerBuilder sslParameters(String sslParameters) {
            doSetProperty("sslParameters", sslParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Thrift component.
     */
    public interface AdvancedThriftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ThriftEndpointProducerBuilder basic() {
            return (ThriftEndpointProducerBuilder) this;
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
        default AdvancedThriftEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedThriftEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedThriftEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedThriftEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Thrift component.
     */
    public interface ThriftEndpointBuilder
            extends
                ThriftEndpointConsumerBuilder,
                ThriftEndpointProducerBuilder {
        default AdvancedThriftEndpointBuilder advanced() {
            return (AdvancedThriftEndpointBuilder) this;
        }
        /**
         * Protocol compression mechanism type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftCompressionType&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: common
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder compressionType(
                org.apache.camel.component.thrift.ThriftCompressionType compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Protocol compression mechanism type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftCompressionType&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: common
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder compressionType(String compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftExchangeProtocol&lt;/code&gt; type.
         * 
         * Default: BINARY
         * Group: common
         * 
         * @param exchangeProtocol the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder exchangeProtocol(
                org.apache.camel.component.thrift.ThriftExchangeProtocol exchangeProtocol) {
            doSetProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Exchange protocol serialization type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftExchangeProtocol&lt;/code&gt; type.
         * 
         * Default: BINARY
         * Group: common
         * 
         * @param exchangeProtocol the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder exchangeProtocol(String exchangeProtocol) {
            doSetProperty("exchangeProtocol", exchangeProtocol);
            return this;
        }
        /**
         * Security negotiation type.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftNegotiationType&lt;/code&gt; type.
         * 
         * Default: PLAINTEXT
         * Group: security
         * 
         * @param negotiationType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder negotiationType(
                org.apache.camel.component.thrift.ThriftNegotiationType negotiationType) {
            doSetProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Security negotiation type.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.thrift.ThriftNegotiationType&lt;/code&gt; type.
         * 
         * Default: PLAINTEXT
         * Group: security
         * 
         * @param negotiationType the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder negotiationType(String negotiationType) {
            doSetProperty("negotiationType", negotiationType);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslParameters the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder sslParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslParameters) {
            doSetProperty("sslParameters", sslParameters);
            return this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslParameters the value to set
         * @return the dsl builder
         */
        default ThriftEndpointBuilder sslParameters(String sslParameters) {
            doSetProperty("sslParameters", sslParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Thrift component.
     */
    public interface AdvancedThriftEndpointBuilder
            extends
                AdvancedThriftEndpointConsumerBuilder,
                AdvancedThriftEndpointProducerBuilder {
        default ThriftEndpointBuilder basic() {
            return (ThriftEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedThriftEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedThriftEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface ThriftBuilders {
        /**
         * Thrift (camel-thrift)
         * Call and expose remote procedures (RPC) with Apache Thrift data
         * format and serialization mechanism.
         * 
         * Category: rpc,transformation
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-thrift
         * 
         * @return the dsl builder for the headers' name.
         */
        default ThriftHeaderNameBuilder thrift() {
            return ThriftHeaderNameBuilder.INSTANCE;
        }
        /**
         * Thrift (camel-thrift)
         * Call and expose remote procedures (RPC) with Apache Thrift data
         * format and serialization mechanism.
         * 
         * Category: rpc,transformation
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-thrift
         * 
         * Syntax: <code>thrift:host:port/service</code>
         * 
         * Path parameter: host
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer.
         * 
         * Path parameter: port (required)
         * The Thrift server port
         * 
         * Path parameter: service (required)
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name)
         * 
         * @param path host:port/service
         * @return the dsl builder
         */
        default ThriftEndpointBuilder thrift(String path) {
            return ThriftEndpointBuilderFactory.endpointBuilder("thrift", path);
        }
        /**
         * Thrift (camel-thrift)
         * Call and expose remote procedures (RPC) with Apache Thrift data
         * format and serialization mechanism.
         * 
         * Category: rpc,transformation
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-thrift
         * 
         * Syntax: <code>thrift:host:port/service</code>
         * 
         * Path parameter: host
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer.
         * 
         * Path parameter: port (required)
         * The Thrift server port
         * 
         * Path parameter: service (required)
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name)
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port/service
         * @return the dsl builder
         */
        default ThriftEndpointBuilder thrift(String componentName, String path) {
            return ThriftEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Thrift component.
     */
    public static class ThriftHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final ThriftHeaderNameBuilder INSTANCE = new ThriftHeaderNameBuilder();

        /**
         * Method name handled by the consumer service.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code ThriftMethodName}.
         */
        public String thriftMethodName() {
            return "ThriftMethodName";
        }
    }
    static ThriftEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ThriftEndpointBuilderImpl extends AbstractEndpointBuilder implements ThriftEndpointBuilder, AdvancedThriftEndpointBuilder {
            public ThriftEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ThriftEndpointBuilderImpl(path);
    }
}