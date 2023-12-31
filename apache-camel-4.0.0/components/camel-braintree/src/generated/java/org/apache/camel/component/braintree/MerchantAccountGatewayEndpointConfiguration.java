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
 * Camel endpoint configuration for {@link com.braintreegateway.MerchantAccountGateway}.
 */
@ApiParams(apiName = "merchantAccount", 
           description = "Provides methods to create, find, and update MerchantAccount objects",
           apiMethods = {@ApiMethod(methodName = "all", signatures={"com.braintreegateway.PaginatedCollection<com.braintreegateway.MerchantAccount> all()"}), @ApiMethod(methodName = "create", signatures={"com.braintreegateway.Result<com.braintreegateway.MerchantAccount> create(com.braintreegateway.MerchantAccountRequest request)"}), @ApiMethod(methodName = "createForCurrency", signatures={"com.braintreegateway.Result<com.braintreegateway.MerchantAccount> createForCurrency(com.braintreegateway.MerchantAccountCreateForCurrencyRequest request)"}), @ApiMethod(methodName = "fetchMerchantAccounts", signatures={"com.braintreegateway.PaginatedResult<com.braintreegateway.MerchantAccount> fetchMerchantAccounts(int page)"}), @ApiMethod(methodName = "find", signatures={"com.braintreegateway.MerchantAccount find(String id)"}), @ApiMethod(methodName = "update", signatures={"com.braintreegateway.Result<com.braintreegateway.MerchantAccount> update(String id, com.braintreegateway.MerchantAccountRequest request)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class MerchantAccountGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "createForCurrency")})
    private com.braintreegateway.MerchantAccountCreateForCurrencyRequest currencyRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "find"), @ApiMethod(methodName = "update")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetchMerchantAccounts")})
    private Integer page;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create"), @ApiMethod(methodName = "update")})
    private com.braintreegateway.MerchantAccountRequest request;

    public com.braintreegateway.MerchantAccountCreateForCurrencyRequest getCurrencyRequest() {
        return currencyRequest;
    }

    public void setCurrencyRequest(com.braintreegateway.MerchantAccountCreateForCurrencyRequest currencyRequest) {
        this.currencyRequest = currencyRequest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public com.braintreegateway.MerchantAccountRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.MerchantAccountRequest request) {
        this.request = request;
    }
}
