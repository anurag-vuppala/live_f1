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
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.camel.avro.generated;

@SuppressWarnings("all")
public interface KeyValueProtocol {
    org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse(
            "{\"protocol\":\"KeyValueProtocol\",\"namespace\":\"org.apache.camel.avro.generated\",\"types\":[{\"type\":\"record\",\"name\":\"Key\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Value\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"}]}],\"messages\":{\"put\":{\"request\":[{\"name\":\"key\",\"type\":\"Key\"},{\"name\":\"value\",\"type\":\"Value\"}],\"response\":\"null\"},\"get\":{\"request\":[{\"name\":\"key\",\"type\":\"Key\"}],\"response\":\"Value\"}}}");

    java.lang.Void put(org.apache.camel.avro.generated.Key key, org.apache.camel.avro.generated.Value value)
            throws org.apache.avro.AvroRemoteException;

    org.apache.camel.avro.generated.Value get(org.apache.camel.avro.generated.Key key)
            throws org.apache.avro.AvroRemoteException;

    @SuppressWarnings("all")
    public interface Callback extends KeyValueProtocol {
        org.apache.avro.Protocol PROTOCOL = org.apache.camel.avro.generated.KeyValueProtocol.PROTOCOL;

        void put(
                org.apache.camel.avro.generated.Key key, org.apache.camel.avro.generated.Value value,
                org.apache.avro.ipc.Callback<java.lang.Void> callback)
                throws java.io.IOException;

        void get(
                org.apache.camel.avro.generated.Key key,
                org.apache.avro.ipc.Callback<org.apache.camel.avro.generated.Value> callback)
                throws java.io.IOException;
    }
}
