// Generated by camel-yaml-dsl-maven-plugin - do NOT edit this file!
package org.apache.camel.dsl.yaml.deserializers;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.apache.camel.dsl.yaml.common.YamlDeserializationContext;
import org.apache.camel.dsl.yaml.common.YamlDeserializerSupport;
import org.apache.camel.model.language.ExpressionDefinition;
import org.apache.camel.spi.annotations.YamlProperty;
import org.apache.camel.spi.annotations.YamlType;
import org.snakeyaml.engine.v2.api.ConstructNode;
import org.snakeyaml.engine.v2.nodes.MappingNode;
import org.snakeyaml.engine.v2.nodes.Node;
import org.snakeyaml.engine.v2.nodes.NodeTuple;

@SuppressWarnings("PMD.UnnecessaryFullyQualifiedName")
public final class ExpressionDeserializers extends YamlDeserializerSupport {
    private ExpressionDeserializers() {
    }

    public static ExpressionDefinition constructExpressionType(Node node) {
        MappingNode mn = asMappingNode(node);
        if (mn.getValue().size() != 1) {
            return null;
        }
        NodeTuple nt = mn.getValue().get(0);
        YamlDeserializationContext dc = getDeserializationContext(node);
        String key = asText(nt.getKeyNode());
        Node val = setDeserializationContext(nt.getValueNode(), dc);
        ExpressionDefinition answer = constructExpressionType(key, val);
        if (answer == null) {
            throw new org.apache.camel.dsl.yaml.common.exception.InvalidExpressionException(node, "Unknown expression with id: " + key);
        }
        return answer;
    }

    public static ExpressionDefinition constructExpressionType(String id, Node node) {
        switch(id) {
            case "constant": {
                return asType(node, org.apache.camel.model.language.ConstantExpression.class);
            }
            case "csimple": {
                return asType(node, org.apache.camel.model.language.CSimpleExpression.class);
            }
            case "datasonnet": {
                return asType(node, org.apache.camel.model.language.DatasonnetExpression.class);
            }
            case "exchangeProperty": {
                return asType(node, org.apache.camel.model.language.ExchangePropertyExpression.class);
            }
            case "exchange-property": {
                return asType(node, org.apache.camel.model.language.ExchangePropertyExpression.class);
            }
            case "groovy": {
                return asType(node, org.apache.camel.model.language.GroovyExpression.class);
            }
            case "header": {
                return asType(node, org.apache.camel.model.language.HeaderExpression.class);
            }
            case "hl7terser": {
                return asType(node, org.apache.camel.model.language.Hl7TerserExpression.class);
            }
            case "joor": {
                return asType(node, org.apache.camel.model.language.JoorExpression.class);
            }
            case "jq": {
                return asType(node, org.apache.camel.model.language.JqExpression.class);
            }
            case "js": {
                return asType(node, org.apache.camel.model.language.JavaScriptExpression.class);
            }
            case "jsonpath": {
                return asType(node, org.apache.camel.model.language.JsonPathExpression.class);
            }
            case "language": {
                return asType(node, org.apache.camel.model.language.LanguageExpression.class);
            }
            case "method": {
                return asType(node, org.apache.camel.model.language.MethodCallExpression.class);
            }
            case "mvel": {
                return asType(node, org.apache.camel.model.language.MvelExpression.class);
            }
            case "ognl": {
                return asType(node, org.apache.camel.model.language.OgnlExpression.class);
            }
            case "python": {
                return asType(node, org.apache.camel.model.language.PythonExpression.class);
            }
            case "ref": {
                return asType(node, org.apache.camel.model.language.RefExpression.class);
            }
            case "simple": {
                return asType(node, org.apache.camel.model.language.SimpleExpression.class);
            }
            case "spel": {
                return asType(node, org.apache.camel.model.language.SpELExpression.class);
            }
            case "tokenize": {
                return asType(node, org.apache.camel.model.language.TokenizerExpression.class);
            }
            case "xpath": {
                return asType(node, org.apache.camel.model.language.XPathExpression.class);
            }
            case "xquery": {
                return asType(node, org.apache.camel.model.language.XQueryExpression.class);
            }
            case "xtokenize": {
                return asType(node, org.apache.camel.model.language.XMLTokenizerExpression.class);
            }
            case "expression": {
                return constructExpressionType(node);
            }
            case "expression-type": {
                return constructExpressionType(node);
            }
            case "expressionType": {
                return constructExpressionType(node);
            }
        }
        return null;
    }

    @YamlType(
            types = org.apache.camel.model.language.ExpressionDefinition.class,
            order = org.apache.camel.dsl.yaml.common.YamlDeserializerResolver.ORDER_LOWEST - 1,
            properties = {
                    @YamlProperty(name = "constant", type = "object:org.apache.camel.model.language.ConstantExpression"),
                    @YamlProperty(name = "csimple", type = "object:org.apache.camel.model.language.CSimpleExpression"),
                    @YamlProperty(name = "datasonnet", type = "object:org.apache.camel.model.language.DatasonnetExpression"),
                    @YamlProperty(name = "exchangeProperty", type = "object:org.apache.camel.model.language.ExchangePropertyExpression"),
                    @YamlProperty(name = "exchange-property", type = "object:org.apache.camel.model.language.ExchangePropertyExpression"),
                    @YamlProperty(name = "groovy", type = "object:org.apache.camel.model.language.GroovyExpression"),
                    @YamlProperty(name = "header", type = "object:org.apache.camel.model.language.HeaderExpression"),
                    @YamlProperty(name = "hl7terser", type = "object:org.apache.camel.model.language.Hl7TerserExpression"),
                    @YamlProperty(name = "joor", type = "object:org.apache.camel.model.language.JoorExpression"),
                    @YamlProperty(name = "jq", type = "object:org.apache.camel.model.language.JqExpression"),
                    @YamlProperty(name = "js", type = "object:org.apache.camel.model.language.JavaScriptExpression"),
                    @YamlProperty(name = "jsonpath", type = "object:org.apache.camel.model.language.JsonPathExpression"),
                    @YamlProperty(name = "language", type = "object:org.apache.camel.model.language.LanguageExpression"),
                    @YamlProperty(name = "method", type = "object:org.apache.camel.model.language.MethodCallExpression"),
                    @YamlProperty(name = "mvel", type = "object:org.apache.camel.model.language.MvelExpression"),
                    @YamlProperty(name = "ognl", type = "object:org.apache.camel.model.language.OgnlExpression"),
                    @YamlProperty(name = "python", type = "object:org.apache.camel.model.language.PythonExpression"),
                    @YamlProperty(name = "ref", type = "object:org.apache.camel.model.language.RefExpression"),
                    @YamlProperty(name = "simple", type = "object:org.apache.camel.model.language.SimpleExpression"),
                    @YamlProperty(name = "spel", type = "object:org.apache.camel.model.language.SpELExpression"),
                    @YamlProperty(name = "tokenize", type = "object:org.apache.camel.model.language.TokenizerExpression"),
                    @YamlProperty(name = "xpath", type = "object:org.apache.camel.model.language.XPathExpression"),
                    @YamlProperty(name = "xquery", type = "object:org.apache.camel.model.language.XQueryExpression"),
                    @YamlProperty(name = "xtokenize", type = "object:org.apache.camel.model.language.XMLTokenizerExpression")
            }
    )
    public static class ExpressionDefinitionDeserializers implements ConstructNode {
        @Override
        public Object construct(Node node) {
            return constructExpressionType(node);
        }
    }

    @YamlType(
            types = org.apache.camel.model.ExpressionSubElementDefinition.class,
            order = org.apache.camel.dsl.yaml.common.YamlDeserializerResolver.ORDER_LOWEST - 1,
            properties = {
                    @YamlProperty(name = "constant", type = "object:org.apache.camel.model.language.ConstantExpression"),
                    @YamlProperty(name = "csimple", type = "object:org.apache.camel.model.language.CSimpleExpression"),
                    @YamlProperty(name = "datasonnet", type = "object:org.apache.camel.model.language.DatasonnetExpression"),
                    @YamlProperty(name = "exchangeProperty", type = "object:org.apache.camel.model.language.ExchangePropertyExpression"),
                    @YamlProperty(name = "exchange-property", type = "object:org.apache.camel.model.language.ExchangePropertyExpression"),
                    @YamlProperty(name = "groovy", type = "object:org.apache.camel.model.language.GroovyExpression"),
                    @YamlProperty(name = "header", type = "object:org.apache.camel.model.language.HeaderExpression"),
                    @YamlProperty(name = "hl7terser", type = "object:org.apache.camel.model.language.Hl7TerserExpression"),
                    @YamlProperty(name = "joor", type = "object:org.apache.camel.model.language.JoorExpression"),
                    @YamlProperty(name = "jq", type = "object:org.apache.camel.model.language.JqExpression"),
                    @YamlProperty(name = "js", type = "object:org.apache.camel.model.language.JavaScriptExpression"),
                    @YamlProperty(name = "jsonpath", type = "object:org.apache.camel.model.language.JsonPathExpression"),
                    @YamlProperty(name = "language", type = "object:org.apache.camel.model.language.LanguageExpression"),
                    @YamlProperty(name = "method", type = "object:org.apache.camel.model.language.MethodCallExpression"),
                    @YamlProperty(name = "mvel", type = "object:org.apache.camel.model.language.MvelExpression"),
                    @YamlProperty(name = "ognl", type = "object:org.apache.camel.model.language.OgnlExpression"),
                    @YamlProperty(name = "python", type = "object:org.apache.camel.model.language.PythonExpression"),
                    @YamlProperty(name = "ref", type = "object:org.apache.camel.model.language.RefExpression"),
                    @YamlProperty(name = "simple", type = "object:org.apache.camel.model.language.SimpleExpression"),
                    @YamlProperty(name = "spel", type = "object:org.apache.camel.model.language.SpELExpression"),
                    @YamlProperty(name = "tokenize", type = "object:org.apache.camel.model.language.TokenizerExpression"),
                    @YamlProperty(name = "xpath", type = "object:org.apache.camel.model.language.XPathExpression"),
                    @YamlProperty(name = "xquery", type = "object:org.apache.camel.model.language.XQueryExpression"),
                    @YamlProperty(name = "xtokenize", type = "object:org.apache.camel.model.language.XMLTokenizerExpression")
            }
    )
    public static class ExpressionSubElementDefinitionDeserializers implements ConstructNode {
        @Override
        public Object construct(Node node) {
            ExpressionDefinition val = constructExpressionType(node);
            return new org.apache.camel.model.ExpressionSubElementDefinition(val);
        }
    }
}
