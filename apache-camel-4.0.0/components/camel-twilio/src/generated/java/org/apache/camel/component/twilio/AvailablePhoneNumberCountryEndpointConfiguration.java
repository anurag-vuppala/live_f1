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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountry}.
 */
@ApiParams(apiName = "available-phone-number-country", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountryFetcher fetcher(String pathCountryCode)", "com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountryFetcher fetcher(String pathAccountSid, String pathCountryCode)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountryReader reader()", "com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountryReader reader(String pathAccountSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class AvailablePhoneNumberCountryEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher")})
    private String pathCountryCode;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCountryCode() {
        return pathCountryCode;
    }

    public void setPathCountryCode(String pathCountryCode) {
        this.pathCountryCode = pathCountryCode;
    }
}
