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
package org.apache.camel.component.google.drive;

import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.PermissionList;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.google.drive.internal.DrivePermissionsApiMethod;
import org.apache.camel.component.google.drive.internal.GoogleDriveApiCollection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class for com.google.api.services.drive.Drive$Permissions APIs.
 */
@EnabledIf(value = "org.apache.camel.component.google.drive.AbstractGoogleDriveTestSupport#hasCredentials",
           disabledReason = "Google Drive credentials were not provided")
public class DrivePermissionsIT extends AbstractGoogleDriveTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(DrivePermissionsIT.class);
    private static final String PATH_PREFIX
            = GoogleDriveApiCollection.getCollection().getApiName(DrivePermissionsApiMethod.class).getName();

    @Test
    public void testList() {
        File testFile = uploadTestFile();
        String fileId = testFile.getId();

        // using String message body for single parameter "fileId"
        final com.google.api.services.drive.model.PermissionList result = requestBody("direct://LIST", fileId);

        assertNotNull(result, "list result");
        LOG.debug("list: {}", result);
    }

    private void assertNotNull(PermissionList result, String listResult) {
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                // test route for delete
                from("direct://DELETE")
                        .to("google-drive://" + PATH_PREFIX + "/delete");

                // test route for get
                from("direct://GET")
                        .to("google-drive://" + PATH_PREFIX + "/get");

                // test route for getIdForEmail
                from("direct://GETIDFOREMAIL")
                        .to("google-drive://" + PATH_PREFIX + "/getIdForEmail?inBody=email");

                // test route for insert
                from("direct://INSERT")
                        .to("google-drive://" + PATH_PREFIX + "/insert");

                // test route for list
                from("direct://LIST")
                        .to("google-drive://" + PATH_PREFIX + "/list?inBody=fileId");

                // test route for patch
                from("direct://PATCH")
                        .to("google-drive://" + PATH_PREFIX + "/patch");

                // test route for update
                from("direct://UPDATE")
                        .to("google-drive://" + PATH_PREFIX + "/update");

                // just used to upload file for test
                from("direct://INSERT_1")
                        .to("google-drive://drive-files/insert");

            }
        };
    }
}
