/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import org.apache.camel.BeanScope;
import org.apache.camel.spi.Metadata;
import org.apache.camel.util.ObjectHelper;

/**
 * Calls a Java bean
 */
@Metadata(label = "eip,endpoint")
@XmlRootElement(name = "bean")
@XmlAccessorType(XmlAccessType.FIELD)
public class BeanDefinition extends NoOutputDefinition<BeanDefinition> {

    @XmlTransient
    private Class<?> beanClass;
    @XmlTransient
    private Object bean;

    @XmlAttribute
    private String ref;
    @XmlAttribute
    private String method;
    @XmlAttribute
    private String beanType;
    @XmlAttribute
    @Metadata(label = "advanced", defaultValue = "Singleton", enums = "Singleton,Request,Prototype")
    private String scope;

    public BeanDefinition() {
    }

    public BeanDefinition(String ref) {
        this.ref = ref;
    }

    public BeanDefinition(String ref, String method) {
        this.ref = ref;
        this.method = method;
    }

    @Override
    public String toString() {
        return "Bean[" + description() + "]";
    }

    public String description() {
        if (ref != null) {
            String methodText = "";
            if (method != null) {
                methodText = " method:" + method;
            }
            return "ref:" + ref + methodText;
        } else if (bean != null) {
            return ObjectHelper.className(bean);
        } else if (beanClass != null) {
            return beanClass.getName();
        } else if (beanType != null) {
            return beanType;
        } else {
            return "";
        }
    }

    @Override
    public String getShortName() {
        return "bean";
    }

    @Override
    public String getLabel() {
        return "bean[" + description() + "]";
    }

    public String getRef() {
        return ref;
    }

    /**
     * Sets a reference to an exiting bean to use, which is looked up from the registry
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMethod() {
        return method;
    }

    /**
     * Sets the method name on the bean to use
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Sets an existing instance of the bean to use
     */
    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public String getBeanType() {
        return beanType;
    }

    /**
     * Sets the class name (fully qualified) of the bean to use
     */
    public void setBeanType(String beanType) {
        this.beanType = beanType;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    /**
     * Sets the class name (fully qualified) of the bean to use
     */
    public void setBeanType(Class<?> beanType) {
        this.beanClass = beanType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Scope of bean.
     *
     * When using singleton scope (default) the bean is created or looked up only once and reused for the lifetime of
     * the endpoint. The bean should be thread-safe in case concurrent threads is calling the bean at the same time.
     * When using request scope the bean is created or looked up once per request (exchange). This can be used if you
     * want to store state on a bean while processing a request and you want to call the same bean instance multiple
     * times while processing the request. The bean does not have to be thread-safe as the instance is only called from
     * the same request. When using prototype scope, then the bean will be looked up or created per call. However in
     * case of lookup then this is delegated to the bean registry such as Spring or CDI (if in use), which depends on
     * their configuration can act as either singleton or prototype scope. So when using prototype scope then this
     * depends on the bean registry implementation.
     */
    public void setScope(BeanScope scope) {
        this.scope = scope.name();
    }

}
