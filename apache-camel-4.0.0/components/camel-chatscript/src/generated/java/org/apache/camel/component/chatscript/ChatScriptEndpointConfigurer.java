/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.chatscript;

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
public class ChatScriptEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ChatScriptEndpoint target = (ChatScriptEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "chatusername":
        case "chatUserName": target.setChatUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "resetchat":
        case "resetChat": target.setResetChat(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "chatusername":
        case "chatUserName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "resetchat":
        case "resetChat": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ChatScriptEndpoint target = (ChatScriptEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "chatusername":
        case "chatUserName": return target.getChatUserName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "resetchat":
        case "resetChat": return target.isResetChat();
        default: return null;
        }
    }
}

