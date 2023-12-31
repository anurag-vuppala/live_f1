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
package org.apache.camel.component.telegram;

/**
 * A collection of supported media type for outgoing messages (produced). It is meant to be put in the message headers
 * using key {@link TelegramConstants#TELEGRAM_MEDIA_TYPE}.
 */
public enum TelegramMediaType {

    TEXT("txt"),
    PHOTO_PNG("png"),
    PHOTO_JPG("jpg"),
    AUDIO("mp3"),
    VIDEO("mp4"),
    DOCUMENT("-");

    private final String fileExtension;

    TelegramMediaType(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
