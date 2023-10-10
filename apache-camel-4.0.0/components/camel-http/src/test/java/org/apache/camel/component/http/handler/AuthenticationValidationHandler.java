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
package org.apache.camel.component.http.handler;

import java.io.IOException;

import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.protocol.HttpContext;

public class AuthenticationValidationHandler extends BasicValidationHandler {

    protected String user;
    protected String password;

    public AuthenticationValidationHandler(String expectedMethod,
                                           String expectedQuery, Object expectedContent,
                                           String responseContent, String user, String password) {
        super(expectedMethod, expectedQuery, expectedContent, responseContent);

        this.user = user;
        this.password = password;
    }

    @Override
    public void handle(
            final ClassicHttpRequest request, final ClassicHttpResponse response,
            final HttpContext context)
            throws HttpException, IOException {
        if (!getExpectedCredential().equals(context.getAttribute("creds"))) {
            response.setCode(HttpStatus.SC_UNAUTHORIZED);
            return;
        }

        super.handle(request, response, context);
    }

    private String getExpectedCredential() {
        return user + ":" + password;
    }
}