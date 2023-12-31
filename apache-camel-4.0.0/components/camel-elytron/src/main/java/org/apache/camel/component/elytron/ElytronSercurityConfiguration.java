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
package org.apache.camel.component.elytron;

import org.wildfly.security.WildFlyElytronBaseProvider;
import org.wildfly.security.auth.server.SecurityDomain;

/**
 * Instance of this interface has to be provided as `securityConfiguration` parameter into camel-undertow.
 */
@Deprecated
public interface ElytronSercurityConfiguration {

    /**
     * Elytron security provider, has to support mechanism from parameter mechanismName.
     */
    WildFlyElytronBaseProvider getElytronProvider();

    /**
     * Name of the mechanism, which will be used for selection of authentication mechanism.
     */
    String getMechanismName();

    /**
     * Definition of Builder, which will be used for creation of security domain.
     */
    SecurityDomain.Builder getDomainBuilder();
}
