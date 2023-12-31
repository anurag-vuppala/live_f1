/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.CustomerGateway}.
 */
@ApiParams(apiName = "customer", 
           description = "Provides methods to create, delete, find, and update Customer objects",
           apiMethods = {@ApiMethod(methodName = "all", description="Finds all Customers and returns a ResourceCollection", signatures={"com.braintreegateway.ResourceCollection<com.braintreegateway.Customer> all()"}), @ApiMethod(methodName = "create", description="Creates a Customer", signatures={"com.braintreegateway.Result<com.braintreegateway.Customer> create(com.braintreegateway.CustomerRequest request)"}), @ApiMethod(methodName = "delete", description="Deletes a Customer by id", signatures={"com.braintreegateway.Result<com.braintreegateway.Customer> delete(String id)"}), @ApiMethod(methodName = "find", description="Finds a Customer by id", signatures={"com.braintreegateway.Customer find(String id)", "com.braintreegateway.Customer find(String id, String associationFilterId)"}), @ApiMethod(methodName = "search", description="Finds all Transactions that match the query and returns a ResourceCollection", signatures={"com.braintreegateway.ResourceCollection<com.braintreegateway.Customer> search(com.braintreegateway.CustomerSearchRequest query)"}), @ApiMethod(methodName = "update", description="Updates a Customer", signatures={"com.braintreegateway.Result<com.braintreegateway.Customer> update(String id, com.braintreegateway.CustomerRequest request)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class CustomerGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "find", description="The id of the association filter to use")})
    private String associationFilterId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The id of the Customer"), @ApiMethod(methodName = "find", description="The id of the Customer"), @ApiMethod(methodName = "update", description="The id of the Customer")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "search", description="The request query to use for search")})
    private com.braintreegateway.CustomerSearchRequest query;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create", description="The request"), @ApiMethod(methodName = "update", description="The request")})
    private com.braintreegateway.CustomerRequest request;

    public String getAssociationFilterId() {
        return associationFilterId;
    }

    public void setAssociationFilterId(String associationFilterId) {
        this.associationFilterId = associationFilterId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.CustomerSearchRequest getQuery() {
        return query;
    }

    public void setQuery(com.braintreegateway.CustomerSearchRequest query) {
        this.query = query;
    }

    public com.braintreegateway.CustomerRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.CustomerRequest request) {
        this.request = request;
    }
}
