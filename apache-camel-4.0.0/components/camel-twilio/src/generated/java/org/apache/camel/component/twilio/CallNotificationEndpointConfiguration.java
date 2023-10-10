/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.Notification}.
 */
@ApiParams(apiName = "call-notification", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.call.NotificationFetcher fetcher(String pathCallSid, String pathSid)", "com.twilio.rest.api.v2010.account.call.NotificationFetcher fetcher(String pathAccountSid, String pathCallSid, String pathSid)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.call.NotificationReader reader(String pathCallSid)", "com.twilio.rest.api.v2010.account.call.NotificationReader reader(String pathAccountSid, String pathCallSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class CallNotificationEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "reader")})
    private String pathCallSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}