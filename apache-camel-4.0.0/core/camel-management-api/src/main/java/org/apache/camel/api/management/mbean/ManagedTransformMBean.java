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
package org.apache.camel.api.management.mbean;

import org.apache.camel.api.management.ManagedAttribute;

public interface ManagedTransformMBean extends ManagedProcessorMBean {

    @ManagedAttribute(description = "The language for the expression")
    String getExpressionLanguage();

    @ManagedAttribute(description = "Expression to return the transformed message body (the new message body to use)")
    String getExpression();

    @ManagedAttribute(description = "Data type used as defined input for the message transformation")
    String getFromType();

    @ManagedAttribute(description = "Data type representing the defined outcome of a data type transformation (the new message body to use)")
    String getToType();

}
