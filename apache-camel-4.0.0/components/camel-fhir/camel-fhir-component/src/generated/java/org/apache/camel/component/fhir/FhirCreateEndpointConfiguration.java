/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirCreate}.
 */
@ApiParams(apiName = "create", 
           description = "API for the create operation, which creates a new resource instance on the server",
           apiMethods = {@ApiMethod(methodName = "resource", description="Creates a IBaseResource on the server", signatures={"ca.uhn.fhir.rest.api.MethodOutcome resource(org.hl7.fhir.instance.model.api.IBaseResource resource, String url, ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)", "ca.uhn.fhir.rest.api.MethodOutcome resource(String resourceAsString, String url, ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), }, aliases = {})
@UriParams
@Configurer(extended = true)
public final class FhirCreateEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "resource", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource", description="Add a Prefer header to the request, which requests that the server include or suppress the resource body as a part of the result. If a resource is returned by the server it will be parsed an accessible to the client via MethodOutcome#getResource() , may be null"), @ApiMethod(methodName = "resource", description="Add a Prefer header to the request, which requests that the server include or suppress the resource body as a part of the result. If a resource is returned by the server it will be parsed an accessible to the client via MethodOutcome#getResource() , may be null")})
    private ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resource", description="The resource to create")})
    private org.hl7.fhir.instance.model.api.IBaseResource resource;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resource", description="The resource to create")})
    private String resourceAsString;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource", description="The search URL to use. The format of this URL should be of the form ResourceTypeParameters, for example: Patientname=Smith&amp;identifier=13.2.4.11.4%7C847366, may be null"), @ApiMethod(methodName = "resource", description="The search URL to use. The format of this URL should be of the form ResourceTypeParameters, for example: Patientname=Smith&amp;identifier=13.2.4.11.4%7C847366, may be null")})
    private String url;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public ca.uhn.fhir.rest.api.PreferReturnEnum getPreferReturn() {
        return preferReturn;
    }

    public void setPreferReturn(ca.uhn.fhir.rest.api.PreferReturnEnum preferReturn) {
        this.preferReturn = preferReturn;
    }

    public org.hl7.fhir.instance.model.api.IBaseResource getResource() {
        return resource;
    }

    public void setResource(org.hl7.fhir.instance.model.api.IBaseResource resource) {
        this.resource = resource;
    }

    public String getResourceAsString() {
        return resourceAsString;
    }

    public void setResourceAsString(String resourceAsString) {
        this.resourceAsString = resourceAsString;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
