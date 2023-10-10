/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.couchdb;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CouchDbEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":protocol:hostname:port/database";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(15);
        props.add("bridgeErrorHandler");
        props.add("createDatabase");
        props.add("database");
        props.add("deletes");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("heartbeat");
        props.add("hostname");
        props.add("lazyStartProducer");
        props.add("password");
        props.add("port");
        props.add("protocol");
        props.add("style");
        props.add("updates");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "couchdb".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "protocol", null, true, copy);
        uri = buildPathParameter(syntax, uri, "hostname", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", 5984, false, copy);
        uri = buildPathParameter(syntax, uri, "database", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

