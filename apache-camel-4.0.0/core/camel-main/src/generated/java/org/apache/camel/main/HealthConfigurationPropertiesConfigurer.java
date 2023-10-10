/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HealthConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HealthConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HealthConfigurationProperties target = (org.apache.camel.main.HealthConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "consumersenabled":
        case "ConsumersEnabled": target.setConsumersEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "enabled":
        case "Enabled": target.setEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "excludepattern":
        case "ExcludePattern": target.setExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "exposurelevel":
        case "ExposureLevel": target.setExposureLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "initialstate":
        case "InitialState": target.setInitialState(property(camelContext, java.lang.String.class, value)); return true;
        case "producersenabled":
        case "ProducersEnabled": target.setProducersEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "registryenabled":
        case "RegistryEnabled": target.setRegistryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "routesenabled":
        case "RoutesEnabled": target.setRoutesEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "consumersenabled":
        case "ConsumersEnabled": return java.lang.Boolean.class;
        case "enabled":
        case "Enabled": return java.lang.Boolean.class;
        case "excludepattern":
        case "ExcludePattern": return java.lang.String.class;
        case "exposurelevel":
        case "ExposureLevel": return java.lang.String.class;
        case "initialstate":
        case "InitialState": return java.lang.String.class;
        case "producersenabled":
        case "ProducersEnabled": return java.lang.Boolean.class;
        case "registryenabled":
        case "RegistryEnabled": return java.lang.Boolean.class;
        case "routesenabled":
        case "RoutesEnabled": return java.lang.Boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HealthConfigurationProperties target = (org.apache.camel.main.HealthConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "consumersenabled":
        case "ConsumersEnabled": return target.getConsumersEnabled();
        case "enabled":
        case "Enabled": return target.getEnabled();
        case "excludepattern":
        case "ExcludePattern": return target.getExcludePattern();
        case "exposurelevel":
        case "ExposureLevel": return target.getExposureLevel();
        case "initialstate":
        case "InitialState": return target.getInitialState();
        case "producersenabled":
        case "ProducersEnabled": return target.getProducersEnabled();
        case "registryenabled":
        case "RegistryEnabled": return target.getRegistryEnabled();
        case "routesenabled":
        case "RoutesEnabled": return target.getRoutesEnabled();
        default: return null;
        }
    }
}
