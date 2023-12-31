/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail.Users.Labels}.
 */
@ApiParams(apiName = "labels", 
           description = "The labels collection of methods",
           apiMethods = {@ApiMethod(methodName = "create", description="Creates a new label", signatures={"com.google.api.services.gmail.Gmail$Users$Labels$Create create(String userId, com.google.api.services.gmail.model.Label content)"}), @ApiMethod(methodName = "delete", description="Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to", signatures={"com.google.api.services.gmail.Gmail$Users$Labels$Delete delete(String userId, String id)"}), @ApiMethod(methodName = "get", description="Gets the specified label", signatures={"com.google.api.services.gmail.Gmail$Users$Labels$Get get(String userId, String id)"}), @ApiMethod(methodName = "list", description="Lists all labels in the user's mailbox", signatures={"com.google.api.services.gmail.Gmail$Users$Labels$List list(String userId)"}), @ApiMethod(methodName = "patch", description="Patch the specified label", signatures={"com.google.api.services.gmail.Gmail$Users$Labels$Patch patch(String userId, String id, com.google.api.services.gmail.model.Label content)"}), @ApiMethod(methodName = "update", description="Updates the specified label", signatures={"com.google.api.services.gmail.Gmail$Users$Labels$Update update(String userId, String id, com.google.api.services.gmail.model.Label content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class GmailUsersLabelsEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create", description="The com.google.api.services.gmail.model.Label"), @ApiMethod(methodName = "patch", description="The com.google.api.services.gmail.model.Label"), @ApiMethod(methodName = "update", description="The com.google.api.services.gmail.model.Label")})
    private com.google.api.services.gmail.model.Label content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the label to delete"), @ApiMethod(methodName = "get", description="The ID of the label to retrieve"), @ApiMethod(methodName = "patch", description="The ID of the label to update"), @ApiMethod(methodName = "update", description="The ID of the label to update")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "delete", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "get", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "list", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "patch", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me"), @ApiMethod(methodName = "update", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me")})
    private String userId;

    public com.google.api.services.gmail.model.Label getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.Label content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
