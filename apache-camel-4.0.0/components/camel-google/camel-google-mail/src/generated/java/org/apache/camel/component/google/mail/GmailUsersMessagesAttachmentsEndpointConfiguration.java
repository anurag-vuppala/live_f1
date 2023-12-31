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
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail.Users.Messages.Attachments}.
 */
@ApiParams(apiName = "attachments", 
           description = "The attachments collection of methods",
           apiMethods = {@ApiMethod(methodName = "get", description="Gets the specified message attachment", signatures={"com.google.api.services.gmail.Gmail$Users$Messages$Attachments$Get get(String userId, String messageId, String id)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class GmailUsersMessagesAttachmentsEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "get", description="The ID of the attachment")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "get", description="The ID of the message containing the attachment")})
    private String messageId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "get", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me")})
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
