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
package org.apache.camel.model.cloud;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.Metadata;

@Metadata(label = "routing,cloud,service-filter")
@XmlRootElement(name = "passThroughServiceFilter")
@XmlAccessorType(XmlAccessType.FIELD)
@Configurer(extended = true)
@Deprecated
public class PassThroughServiceCallServiceFilterConfiguration extends ServiceCallServiceFilterConfiguration {
    public PassThroughServiceCallServiceFilterConfiguration() {
        this(null);
    }

    public PassThroughServiceCallServiceFilterConfiguration(ServiceCallDefinition parent) {
        super(parent, "pass-through-service-filter");
    }
}