/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hdfs;

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
public class HdfsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":hostName:port/path";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(48);
        props.add("append");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("blockSize");
        props.add("bridgeErrorHandler");
        props.add("bufferSize");
        props.add("checkIdleInterval");
        props.add("chunkSize");
        props.add("compressionCodec");
        props.add("compressionType");
        props.add("connectOnStartup");
        props.add("delay");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("fileSystemType");
        props.add("fileType");
        props.add("greedy");
        props.add("hostName");
        props.add("initialDelay");
        props.add("kerberosConfigFileLocation");
        props.add("kerberosKeytabLocation");
        props.add("kerberosUsername");
        props.add("keyType");
        props.add("lazyStartProducer");
        props.add("maxMessagesPerPoll");
        props.add("namedNodes");
        props.add("openedSuffix");
        props.add("overwrite");
        props.add("owner");
        props.add("path");
        props.add("pattern");
        props.add("pollStrategy");
        props.add("port");
        props.add("readSuffix");
        props.add("repeatCount");
        props.add("replication");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("splitStrategy");
        props.add("startScheduler");
        props.add("streamDownload");
        props.add("timeUnit");
        props.add("useFixedDelay");
        props.add("valueType");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "hdfs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "hostName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", 8020, false, copy);
        uri = buildPathParameter(syntax, uri, "path", null, true, copy);
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
