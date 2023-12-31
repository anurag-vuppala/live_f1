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
public class Key extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse(
            "{\"type\":\"record\",\"name\":\"Key\",\"namespace\":\"org.apache.camel.avro.generated\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"}]}");
    @Deprecated
    public java.lang.CharSequence key;

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return key;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                key = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'key' field.
     */
    public java.lang.CharSequence getKey() {
        return key;
    }

    /**
     * Sets the value of the 'key' field.
     *
     * @param value the value to set.
     */
    public void setKey(java.lang.CharSequence value) {
        this.key = value;
    }

    /** Creates a new Key RecordBuilder */
    public static org.apache.camel.avro.generated.Key.Builder newBuilder() {
        return new org.apache.camel.avro.generated.Key.Builder();
    }

    /** Creates a new Key RecordBuilder by copying an existing Builder */
    public static org.apache.camel.avro.generated.Key.Builder newBuilder(org.apache.camel.avro.generated.Key.Builder other) {
        return new org.apache.camel.avro.generated.Key.Builder(other);
    }

    /** Creates a new Key RecordBuilder by copying an existing Key instance */
    public static org.apache.camel.avro.generated.Key.Builder newBuilder(org.apache.camel.avro.generated.Key other) {
        return new org.apache.camel.avro.generated.Key.Builder(other);
    }

    /**
     * RecordBuilder for Key instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Key>
            implements org.apache.avro.data.RecordBuilder<Key> {

        private java.lang.CharSequence key;

        /** Creates a new Builder */
        private Builder() {
            super(org.apache.camel.avro.generated.Key.SCHEMA$);
        }

        /** Creates a Builder by copying an existing Builder */
        private Builder(org.apache.camel.avro.generated.Key.Builder other) {
            super(other);
        }

        /** Creates a Builder by copying an existing Key instance */
        private Builder(org.apache.camel.avro.generated.Key other) {
            super(org.apache.camel.avro.generated.Key.SCHEMA$);
            if (isValidValue(fields()[0], other.key)) {
                this.key = data().deepCopy(fields()[0].schema(), other.key);
                fieldSetFlags()[0] = true;
            }
        }

        /** Gets the value of the 'key' field */
        public java.lang.CharSequence getKey() {
            return key;
        }

        /** Sets the value of the 'key' field */
        public org.apache.camel.avro.generated.Key.Builder setKey(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.key = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /** Checks whether the 'key' field has been set */
        public boolean hasKey() {
            return fieldSetFlags()[0];
        }

        /** Clears the value of the 'key' field */
        public org.apache.camel.avro.generated.Key.Builder clearKey() {
            key = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        @Override
        public Key build() {
            try {
                Key record = new Key();
                record.key = fieldSetFlags()[0] ? this.key : (java.lang.CharSequence) defaultValue(fields()[0]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}
