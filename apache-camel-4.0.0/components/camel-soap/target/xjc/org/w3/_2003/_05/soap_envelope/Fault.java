//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.22 at 11:51:08 AM BST 
//


package org.w3._2003._05.soap_envelope;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 	    Fault reporting structure
 * 	  
 * 
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2003/05/soap-envelope}faultcode"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2003/05/soap-envelope}faultreason"/&gt;
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{http://www.w3.org/2003/05/soap-envelope}detail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {
    "code",
    "reason",
    "node",
    "role",
    "detail"
})
public class Fault {

    @XmlElement(name = "Code", required = true)
    protected Faultcode code;
    @XmlElement(name = "Reason", required = true)
    protected Faultreason reason;
    @XmlElement(name = "Node")
    @XmlSchemaType(name = "anyURI")
    protected String node;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlElement(name = "Detail")
    protected Detail detail;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Faultcode }
     *     
     */
    public Faultcode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultcode }
     *     
     */
    public void setCode(Faultcode value) {
        this.code = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link Faultreason }
     *     
     */
    public Faultreason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultreason }
     *     
     */
    public void setReason(Faultreason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Detail }
     *     
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detail }
     *     
     */
    public void setDetail(Detail value) {
        this.detail = value;
    }

    public Fault withCode(Faultcode value) {
        setCode(value);
        return this;
    }

    public Fault withReason(Faultreason value) {
        setReason(value);
        return this;
    }

    public Fault withNode(String value) {
        setNode(value);
        return this;
    }

    public Fault withRole(String value) {
        setRole(value);
        return this;
    }

    public Fault withDetail(Detail value) {
        setDetail(value);
        return this;
    }

}
