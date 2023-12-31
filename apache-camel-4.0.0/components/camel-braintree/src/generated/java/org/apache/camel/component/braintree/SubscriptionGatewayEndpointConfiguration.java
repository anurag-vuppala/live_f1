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
 * Camel endpoint configuration for {@link com.braintreegateway.SubscriptionGateway}.
 */
@ApiParams(apiName = "subscription", 
           description = "Provides methods to interact with Subscriptions",
           apiMethods = {@ApiMethod(methodName = "cancel", description="Cancels the Subscription with the given id", signatures={"com.braintreegateway.Result<com.braintreegateway.Subscription> cancel(String id)"}), @ApiMethod(methodName = "create", description="Creates a Subscription", signatures={"com.braintreegateway.Result<com.braintreegateway.Subscription> create(com.braintreegateway.SubscriptionRequest request)"}), @ApiMethod(methodName = "delete", signatures={"com.braintreegateway.Result<com.braintreegateway.Subscription> delete(String customerId, String id)"}), @ApiMethod(methodName = "find", description="Finds a Subscription by id", signatures={"com.braintreegateway.Subscription find(String id)"}), @ApiMethod(methodName = "retryCharge", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> retryCharge(String subscriptionId)", "com.braintreegateway.Result<com.braintreegateway.Transaction> retryCharge(String subscriptionId, java.math.BigDecimal amount)", "com.braintreegateway.Result<com.braintreegateway.Transaction> retryCharge(String subscriptionId, Boolean submitForSettlement)", "com.braintreegateway.Result<com.braintreegateway.Transaction> retryCharge(String subscriptionId, java.math.BigDecimal amount, Boolean submitForSettlement)"}), @ApiMethod(methodName = "search", description="Search for a Subscription", signatures={"com.braintreegateway.ResourceCollection<com.braintreegateway.Subscription> search(com.braintreegateway.SubscriptionSearchRequest searchRequest)"}), @ApiMethod(methodName = "update", description="Updates a Subscription", signatures={"com.braintreegateway.Result<com.braintreegateway.Subscription> update(String id, com.braintreegateway.SubscriptionRequest request)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class SubscriptionGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "retryCharge")})
    private java.math.BigDecimal amount;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete")})
    private String customerId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "cancel", description="Of the Subscription to cancel"), @ApiMethod(methodName = "delete"), @ApiMethod(methodName = "find", description="The id of the Subscription"), @ApiMethod(methodName = "update", description="The id of the Subscription")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create", description="The request"), @ApiMethod(methodName = "update", description="The request")})
    private com.braintreegateway.SubscriptionRequest request;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "search", description="The SubscriptionSearchRequest")})
    private com.braintreegateway.SubscriptionSearchRequest searchRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "retryCharge")})
    private Boolean submitForSettlement;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "retryCharge")})
    private String subscriptionId;

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.SubscriptionRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.SubscriptionRequest request) {
        this.request = request;
    }

    public com.braintreegateway.SubscriptionSearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(com.braintreegateway.SubscriptionSearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public Boolean getSubmitForSettlement() {
        return submitForSettlement;
    }

    public void setSubmitForSettlement(Boolean submitForSettlement) {
        this.submitForSettlement = submitForSettlement;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
}
