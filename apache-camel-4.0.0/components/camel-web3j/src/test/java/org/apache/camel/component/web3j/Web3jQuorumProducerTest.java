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
package org.apache.camel.component.web3j;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.quorum.Quorum;
import org.web3j.quorum.methods.response.PrivatePayload;

import static org.apache.camel.component.web3j.Web3jConstants.OPERATION;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

public class Web3jQuorumProducerTest extends Web3jMockTestSupport {

    @Mock
    @BindToRegistry("mockQuorum")
    protected Quorum mockQuorum;

    @Produce("direct:start")
    protected ProducerTemplate template;

    @Mock
    protected Request request;

    @Override
    protected String getUrl() {
        return "web3j://http://127.0.0.1:8545?web3j=#mockQuorum&quorumAPI=true&";
    }

    @Override
    public boolean isUseAdviceWith() {
        return false;
    }

    @Test
    public void quorumGetPrivatePayloadTest() throws Exception {
        PrivatePayload response = Mockito.mock(PrivatePayload.class);
        Mockito.when(mockQuorum.quorumGetPrivatePayload(any())).thenReturn(request);
        Mockito.when(request.send()).thenReturn(response);
        Mockito.when(response.getPrivatePayload()).thenReturn("secret");

        Exchange exchange = createExchangeWithBodyAndHeader("foo", OPERATION, Web3jConstants.QUORUM_GET_PRIVATE_PAYLOAD);
        template.send(exchange);
        String body = exchange.getIn().getBody(String.class);
        assertEquals("secret", body);
    }

    @Test
    public void quorumEthSendTransactionTest() throws Exception {
        EthSendTransaction response = Mockito.mock(EthSendTransaction.class);
        Mockito.when(mockQuorum.ethSendTransaction(any())).thenReturn(request);
        Mockito.when(request.send()).thenReturn(response);
        Mockito.when(response.getTransactionHash()).thenReturn("test");

        Exchange exchange = createExchangeWithBodyAndHeader(null, OPERATION, Web3jConstants.QUORUM_ETH_SEND_TRANSACTION);
        template.send(exchange);
        String body = exchange.getIn().getBody(String.class);
        assertEquals("test", body);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start")
                        .to(getUrl() + OPERATION.toLowerCase() + "=" + Web3jConstants.WEB3_CLIENT_VERSION);
            }
        };
    }
}
