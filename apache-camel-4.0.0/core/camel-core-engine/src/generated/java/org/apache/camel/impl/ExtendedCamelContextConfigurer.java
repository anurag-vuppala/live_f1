/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.ExtendedCamelContext;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ExtendedCamelContextConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepackagescan":
        case "BasePackageScan": target.setBasePackageScan(property(camelContext, java.lang.String.class, value)); return true;
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": target.setBootstrapFactoryFinder(property(camelContext, org.apache.camel.spi.FactoryFinder.class, value)); return true;
        case "defaultfactoryfinder":
        case "DefaultFactoryFinder": target.setDefaultFactoryFinder(property(camelContext, org.apache.camel.spi.FactoryFinder.class, value)); return true;
        case "description":
        case "Description": target.setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": target.setErrorHandlerFactory(property(camelContext, org.apache.camel.ErrorHandlerFactory.class, value)); return true;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": target.setEventNotificationApplicable(property(camelContext, boolean.class, value)); return true;
        case "exchangefactory":
        case "ExchangeFactory": target.setExchangeFactory(property(camelContext, org.apache.camel.spi.ExchangeFactory.class, value)); return true;
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": target.setExchangeFactoryManager(property(camelContext, org.apache.camel.spi.ExchangeFactoryManager.class, value)); return true;
        case "headersmapfactory":
        case "HeadersMapFactory": target.setHeadersMapFactory(property(camelContext, org.apache.camel.spi.HeadersMapFactory.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "processorexchangefactory":
        case "ProcessorExchangeFactory": target.setProcessorExchangeFactory(property(camelContext, org.apache.camel.spi.ProcessorExchangeFactory.class, value)); return true;
        case "reactiveexecutor":
        case "ReactiveExecutor": target.setReactiveExecutor(property(camelContext, org.apache.camel.spi.ReactiveExecutor.class, value)); return true;
        case "registry":
        case "Registry": target.setRegistry(property(camelContext, org.apache.camel.spi.Registry.class, value)); return true;
        case "startupsteprecorder":
        case "StartupStepRecorder": target.setStartupStepRecorder(property(camelContext, org.apache.camel.spi.StartupStepRecorder.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepackagescan":
        case "BasePackageScan": return java.lang.String.class;
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": return org.apache.camel.spi.FactoryFinder.class;
        case "defaultfactoryfinder":
        case "DefaultFactoryFinder": return org.apache.camel.spi.FactoryFinder.class;
        case "description":
        case "Description": return java.lang.String.class;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return org.apache.camel.ErrorHandlerFactory.class;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return boolean.class;
        case "exchangefactory":
        case "ExchangeFactory": return org.apache.camel.spi.ExchangeFactory.class;
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": return org.apache.camel.spi.ExchangeFactoryManager.class;
        case "headersmapfactory":
        case "HeadersMapFactory": return org.apache.camel.spi.HeadersMapFactory.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "processorexchangefactory":
        case "ProcessorExchangeFactory": return org.apache.camel.spi.ProcessorExchangeFactory.class;
        case "reactiveexecutor":
        case "ReactiveExecutor": return org.apache.camel.spi.ReactiveExecutor.class;
        case "registry":
        case "Registry": return org.apache.camel.spi.Registry.class;
        case "startupsteprecorder":
        case "StartupStepRecorder": return org.apache.camel.spi.StartupStepRecorder.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basepackagescan":
        case "BasePackageScan": return target.getBasePackageScan();
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": return target.getBootstrapFactoryFinder();
        case "defaultfactoryfinder":
        case "DefaultFactoryFinder": return target.getDefaultFactoryFinder();
        case "description":
        case "Description": return target.getDescription();
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return target.getErrorHandlerFactory();
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return target.isEventNotificationApplicable();
        case "exchangefactory":
        case "ExchangeFactory": return target.getExchangeFactory();
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": return target.getExchangeFactoryManager();
        case "headersmapfactory":
        case "HeadersMapFactory": return target.getHeadersMapFactory();
        case "name":
        case "Name": return target.getName();
        case "processorexchangefactory":
        case "ProcessorExchangeFactory": return target.getProcessorExchangeFactory();
        case "reactiveexecutor":
        case "ReactiveExecutor": return target.getReactiveExecutor();
        case "registry":
        case "Registry": return target.getRegistry();
        case "startupsteprecorder":
        case "StartupStepRecorder": return target.getStartupStepRecorder();
        default: return null;
        }
    }
}
