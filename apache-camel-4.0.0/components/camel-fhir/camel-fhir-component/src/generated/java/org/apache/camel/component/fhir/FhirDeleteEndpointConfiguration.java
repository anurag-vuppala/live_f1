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
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirDelete}.
 */
@ApiParams(apiName = "delete", 
           description = "API for the delete operation, which performs a logical delete on a server resource",
           apiMethods = {@ApiMethod(methodName = "resource", description="Deletes the given resource", signatures={"ca.uhn.fhir.rest.api.MethodOutcome resource(org.hl7.fhir.instance.model.api.IBaseResource resource, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "resourceById", description="Deletes the resource by resource type e", signatures={"ca.uhn.fhir.rest.api.MethodOutcome resourceById(org.hl7.fhir.instance.model.api.IIdType id, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)", "ca.uhn.fhir.rest.api.MethodOutcome resourceById(String type, String stringId, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "resourceConditionalByUrl", description="Specifies deleting should be performed as a conditional delete against a given search URL", signatures={"ca.uhn.fhir.rest.api.MethodOutcome resourceConditionalByUrl(String url, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class FhirDeleteEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "resourceById", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "resourceById", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "resourceConditionalByUrl", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resourceById", description="The IIdType referencing the resource")})
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resource", description="The IBaseResource to delete")})
    private org.hl7.fhir.instance.model.api.IBaseResource resource;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resourceById", description="It's id")})
    private String stringId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resourceById", description="The resource type e.g Patient")})
    private String type;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resourceConditionalByUrl", description="The search URL to use. The format of this URL should be of the form ResourceTypeParameters, for example: Patientname=Smith&amp;identifier=13.2.4.11.4%7C847366")})
    private String url;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public org.hl7.fhir.instance.model.api.IBaseResource getResource() {
        return resource;
    }

    public void setResource(org.hl7.fhir.instance.model.api.IBaseResource resource) {
        this.resource = resource;
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
