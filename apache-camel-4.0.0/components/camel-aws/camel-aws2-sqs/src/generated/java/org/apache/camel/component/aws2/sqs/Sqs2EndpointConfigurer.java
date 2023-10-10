/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sqs;

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
public class Sqs2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sqs2Endpoint target = (Sqs2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonawshost":
        case "amazonAWSHost": target.getConfiguration().setAmazonAWSHost(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsqsclient":
        case "amazonSQSClient": target.getConfiguration().setAmazonSQSClient(property(camelContext, software.amazon.awssdk.services.sqs.SqsClient.class, value)); return true;
        case "attributenames":
        case "attributeNames": target.getConfiguration().setAttributeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreatequeue":
        case "autoCreateQueue": target.getConfiguration().setAutoCreateQueue(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "batchseparator":
        case "batchSeparator": target.getConfiguration().setBatchSeparator(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "defaultvisibilitytimeout":
        case "defaultVisibilityTimeout": target.getConfiguration().setDefaultVisibilityTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "delayqueue":
        case "delayQueue": target.getConfiguration().setDelayQueue(property(camelContext, boolean.class, value)); return true;
        case "delayseconds":
        case "delaySeconds": target.getConfiguration().setDelaySeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteiffiltered":
        case "deleteIfFiltered": target.getConfiguration().setDeleteIfFiltered(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "extendmessagevisibility":
        case "extendMessageVisibility": target.getConfiguration().setExtendMessageVisibility(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "kmsdatakeyreuseperiodseconds":
        case "kmsDataKeyReusePeriodSeconds": target.getConfiguration().setKmsDataKeyReusePeriodSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": target.getConfiguration().setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "maximummessagesize":
        case "maximumMessageSize": target.getConfiguration().setMaximumMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "messageattributenames":
        case "messageAttributeNames": target.getConfiguration().setMessageAttributeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "messagededuplicationidstrategy":
        case "messageDeduplicationIdStrategy": target.getConfiguration().setMessageDeduplicationIdStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "messagegroupidstrategy":
        case "messageGroupIdStrategy": target.getConfiguration().setMessageGroupIdStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "messageheaderexceededlimit":
        case "messageHeaderExceededLimit": target.getConfiguration().setMessageHeaderExceededLimit(property(camelContext, java.lang.String.class, value)); return true;
        case "messageretentionperiod":
        case "messageRetentionPeriod": target.getConfiguration().setMessageRetentionPeriod(property(camelContext, java.lang.Integer.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.sqs.Sqs2Operations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": target.getConfiguration().setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "profilecredentialsname":
        case "profileCredentialsName": target.getConfiguration().setProfileCredentialsName(property(camelContext, java.lang.String.class, value)); return true;
        case "protocol": target.getConfiguration().setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueownerawsaccountid":
        case "queueOwnerAWSAccountId": target.getConfiguration().setQueueOwnerAWSAccountId(property(camelContext, java.lang.String.class, value)); return true;
        case "queueurl":
        case "queueUrl": target.getConfiguration().setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "receivemessagewaittimeseconds":
        case "receiveMessageWaitTimeSeconds": target.getConfiguration().setReceiveMessageWaitTimeSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "redrivepolicy":
        case "redrivePolicy": target.getConfiguration().setRedrivePolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": target.getConfiguration().setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": target.getConfiguration().setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": target.getConfiguration().setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": target.getConfiguration().setUseDefaultCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": target.getConfiguration().setUseProfileCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "visibilitytimeout":
        case "visibilityTimeout": target.getConfiguration().setVisibilityTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "waittimeseconds":
        case "waitTimeSeconds": target.getConfiguration().setWaitTimeSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"amazonSQSClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazonawshost":
        case "amazonAWSHost": return java.lang.String.class;
        case "amazonsqsclient":
        case "amazonSQSClient": return software.amazon.awssdk.services.sqs.SqsClient.class;
        case "attributenames":
        case "attributeNames": return java.lang.String.class;
        case "autocreatequeue":
        case "autoCreateQueue": return boolean.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "batchseparator":
        case "batchSeparator": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return int.class;
        case "defaultvisibilitytimeout":
        case "defaultVisibilityTimeout": return java.lang.Integer.class;
        case "delay": return long.class;
        case "delayqueue":
        case "delayQueue": return boolean.class;
        case "delayseconds":
        case "delaySeconds": return java.lang.Integer.class;
        case "deleteafterread":
        case "deleteAfterRead": return boolean.class;
        case "deleteiffiltered":
        case "deleteIfFiltered": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "extendmessagevisibility":
        case "extendMessageVisibility": return boolean.class;
        case "greedy": return boolean.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "kmsdatakeyreuseperiodseconds":
        case "kmsDataKeyReusePeriodSeconds": return java.lang.Integer.class;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return int.class;
        case "maximummessagesize":
        case "maximumMessageSize": return java.lang.Integer.class;
        case "messageattributenames":
        case "messageAttributeNames": return java.lang.String.class;
        case "messagededuplicationidstrategy":
        case "messageDeduplicationIdStrategy": return java.lang.String.class;
        case "messagegroupidstrategy":
        case "messageGroupIdStrategy": return java.lang.String.class;
        case "messageheaderexceededlimit":
        case "messageHeaderExceededLimit": return java.lang.String.class;
        case "messageretentionperiod":
        case "messageRetentionPeriod": return java.lang.Integer.class;
        case "operation": return org.apache.camel.component.aws2.sqs.Sqs2Operations.class;
        case "overrideendpoint":
        case "overrideEndpoint": return boolean.class;
        case "policy": return java.lang.String.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "profilecredentialsname":
        case "profileCredentialsName": return java.lang.String.class;
        case "protocol": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "queueownerawsaccountid":
        case "queueOwnerAWSAccountId": return java.lang.String.class;
        case "queueurl":
        case "queueUrl": return java.lang.String.class;
        case "receivemessagewaittimeseconds":
        case "receiveMessageWaitTimeSeconds": return java.lang.Integer.class;
        case "redrivepolicy":
        case "redrivePolicy": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": return boolean.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        case "uriendpointoverride":
        case "uriEndpointOverride": return java.lang.String.class;
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": return boolean.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": return boolean.class;
        case "visibilitytimeout":
        case "visibilityTimeout": return java.lang.Integer.class;
        case "waittimeseconds":
        case "waitTimeSeconds": return java.lang.Integer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Sqs2Endpoint target = (Sqs2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazonawshost":
        case "amazonAWSHost": return target.getConfiguration().getAmazonAWSHost();
        case "amazonsqsclient":
        case "amazonSQSClient": return target.getConfiguration().getAmazonSQSClient();
        case "attributenames":
        case "attributeNames": return target.getConfiguration().getAttributeNames();
        case "autocreatequeue":
        case "autoCreateQueue": return target.getConfiguration().isAutoCreateQueue();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "batchseparator":
        case "batchSeparator": return target.getConfiguration().getBatchSeparator();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConfiguration().getConcurrentConsumers();
        case "defaultvisibilitytimeout":
        case "defaultVisibilityTimeout": return target.getConfiguration().getDefaultVisibilityTimeout();
        case "delay": return target.getDelay();
        case "delayqueue":
        case "delayQueue": return target.getConfiguration().isDelayQueue();
        case "delayseconds":
        case "delaySeconds": return target.getConfiguration().getDelaySeconds();
        case "deleteafterread":
        case "deleteAfterRead": return target.getConfiguration().isDeleteAfterRead();
        case "deleteiffiltered":
        case "deleteIfFiltered": return target.getConfiguration().isDeleteIfFiltered();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "extendmessagevisibility":
        case "extendMessageVisibility": return target.getConfiguration().isExtendMessageVisibility();
        case "greedy": return target.isGreedy();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "kmsdatakeyreuseperiodseconds":
        case "kmsDataKeyReusePeriodSeconds": return target.getConfiguration().getKmsDataKeyReusePeriodSeconds();
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": return target.getConfiguration().getKmsMasterKeyId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "maximummessagesize":
        case "maximumMessageSize": return target.getConfiguration().getMaximumMessageSize();
        case "messageattributenames":
        case "messageAttributeNames": return target.getConfiguration().getMessageAttributeNames();
        case "messagededuplicationidstrategy":
        case "messageDeduplicationIdStrategy": return target.getConfiguration().getMessageDeduplicationIdStrategy();
        case "messagegroupidstrategy":
        case "messageGroupIdStrategy": return target.getConfiguration().getMessageGroupIdStrategy();
        case "messageheaderexceededlimit":
        case "messageHeaderExceededLimit": return target.getConfiguration().getMessageHeaderExceededLimit();
        case "messageretentionperiod":
        case "messageRetentionPeriod": return target.getConfiguration().getMessageRetentionPeriod();
        case "operation": return target.getConfiguration().getOperation();
        case "overrideendpoint":
        case "overrideEndpoint": return target.getConfiguration().isOverrideEndpoint();
        case "policy": return target.getConfiguration().getPolicy();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "profilecredentialsname":
        case "profileCredentialsName": return target.getConfiguration().getProfileCredentialsName();
        case "protocol": return target.getConfiguration().getProtocol();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "queueownerawsaccountid":
        case "queueOwnerAWSAccountId": return target.getConfiguration().getQueueOwnerAWSAccountId();
        case "queueurl":
        case "queueUrl": return target.getConfiguration().getQueueUrl();
        case "receivemessagewaittimeseconds":
        case "receiveMessageWaitTimeSeconds": return target.getConfiguration().getReceiveMessageWaitTimeSeconds();
        case "redrivepolicy":
        case "redrivePolicy": return target.getConfiguration().getRedrivePolicy();
        case "region": return target.getConfiguration().getRegion();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": return target.getConfiguration().isServerSideEncryptionEnabled();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        case "uriendpointoverride":
        case "uriEndpointOverride": return target.getConfiguration().getUriEndpointOverride();
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": return target.getConfiguration().isUseDefaultCredentialsProvider();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": return target.getConfiguration().isUseProfileCredentialsProvider();
        case "visibilitytimeout":
        case "visibilityTimeout": return target.getConfiguration().getVisibilityTimeout();
        case "waittimeseconds":
        case "waitTimeSeconds": return target.getConfiguration().getWaitTimeSeconds();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}
