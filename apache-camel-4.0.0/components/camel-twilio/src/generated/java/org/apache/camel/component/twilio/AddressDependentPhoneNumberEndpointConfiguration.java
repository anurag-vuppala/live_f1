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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.address.DependentPhoneNumber}.
 */
@ApiParams(apiName = "address-dependent-phone-number", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.address.DependentPhoneNumberReader reader(String pathAddressSid)", "com.twilio.rest.api.v2010.account.address.DependentPhoneNumberReader reader(String pathAccountSid, String pathAddressSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class AddressDependentPhoneNumberEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "reader")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "reader"), @ApiMethod(methodName = "reader")})
    private String pathAddressSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathAddressSid() {
        return pathAddressSid;
    }

    public void setPathAddressSid(String pathAddressSid) {
        this.pathAddressSid = pathAddressSid;
    }
}