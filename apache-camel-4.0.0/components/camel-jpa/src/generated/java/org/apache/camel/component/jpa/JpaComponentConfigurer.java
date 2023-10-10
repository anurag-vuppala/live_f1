/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jpa;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JpaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JpaComponent target = (JpaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aliases": target.setAliases(property(camelContext, java.util.Map.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "entitymanagerfactory":
        case "entityManagerFactory": target.setEntityManagerFactory(property(camelContext, jakarta.persistence.EntityManagerFactory.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "jointransaction":
        case "joinTransaction": target.setJoinTransaction(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sharedentitymanager":
        case "sharedEntityManager": target.setSharedEntityManager(property(camelContext, boolean.class, value)); return true;
        case "transactionstrategy":
        case "transactionStrategy": target.setTransactionStrategy(property(camelContext, org.apache.camel.component.jpa.TransactionStrategy.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aliases": return java.util.Map.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "entitymanagerfactory":
        case "entityManagerFactory": return jakarta.persistence.EntityManagerFactory.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "jointransaction":
        case "joinTransaction": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "sharedentitymanager":
        case "sharedEntityManager": return boolean.class;
        case "transactionstrategy":
        case "transactionStrategy": return org.apache.camel.component.jpa.TransactionStrategy.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JpaComponent target = (JpaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aliases": return target.getAliases();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "entitymanagerfactory":
        case "entityManagerFactory": return target.getEntityManagerFactory();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "jointransaction":
        case "joinTransaction": return target.isJoinTransaction();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sharedentitymanager":
        case "sharedEntityManager": return target.isSharedEntityManager();
        case "transactionstrategy":
        case "transactionStrategy": return target.getTransactionStrategy();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aliases": return java.lang.Class.class;
        default: return null;
        }
    }
}
