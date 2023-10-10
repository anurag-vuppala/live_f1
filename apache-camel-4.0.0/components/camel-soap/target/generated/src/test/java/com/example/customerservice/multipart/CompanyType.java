
package com.example.customerservice.multipart;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="companyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIVATE"/&gt;
 *     &lt;enumeration value="PUBLIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "companyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-22T11:51:11+01:00")
public enum CompanyType {

    PRIVATE,
    PUBLIC;

    public String value() {
        return name();
    }

    public static CompanyType fromValue(String v) {
        return valueOf(v);
    }

}
