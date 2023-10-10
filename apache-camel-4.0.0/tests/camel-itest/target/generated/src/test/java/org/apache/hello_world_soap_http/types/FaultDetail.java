
package org.apache.hello_world_soap_http.types;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "minor",
    "major"
})
@XmlRootElement(name = "faultDetail")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
public class FaultDetail {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
    protected short minor;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
    protected short major;

    /**
     * Gets the value of the minor property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
    public short getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
    public void setMinor(short value) {
        this.minor = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
    public short getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2023-09-27T14:01:29+01:00")
    public void setMajor(short value) {
        this.major = value;
    }

}
