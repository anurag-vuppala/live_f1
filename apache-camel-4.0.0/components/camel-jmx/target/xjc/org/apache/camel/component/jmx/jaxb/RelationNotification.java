
package org.apache.camel.component.jmx.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{urn:org.apache.camel.component:jmx}notificationEventType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="relationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="relationTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MBeansToUnregister" type="{urn:org.apache.camel.component:jmx}objectNamesType" minOccurs="0"/&gt;
 *         &lt;element name="newRoleValue" type="{urn:org.apache.camel.component:jmx}objectNamesType" minOccurs="0"/&gt;
 *         &lt;element name="oldRoleValue" type="{urn:org.apache.camel.component:jmx}objectNamesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objectName",
    "relationId",
    "relationTypeName",
    "roleName",
    "mBeansToUnregister",
    "newRoleValue",
    "oldRoleValue"
})
@XmlRootElement(name = "RelationNotification")
public class RelationNotification
    extends NotificationEventType
{

    @XmlElement(required = true)
    protected String objectName;
    @XmlElement(required = true)
    protected String relationId;
    @XmlElement(required = true)
    protected String relationTypeName;
    protected String roleName;
    @XmlElement(name = "MBeansToUnregister")
    protected ObjectNamesType mBeansToUnregister;
    protected ObjectNamesType newRoleValue;
    protected ObjectNamesType oldRoleValue;

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the relationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * Sets the value of the relationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationId(String value) {
        this.relationId = value;
    }

    /**
     * Gets the value of the relationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationTypeName() {
        return relationTypeName;
    }

    /**
     * Sets the value of the relationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationTypeName(String value) {
        this.relationTypeName = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the mBeansToUnregister property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectNamesType }
     *     
     */
    public ObjectNamesType getMBeansToUnregister() {
        return mBeansToUnregister;
    }

    /**
     * Sets the value of the mBeansToUnregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectNamesType }
     *     
     */
    public void setMBeansToUnregister(ObjectNamesType value) {
        this.mBeansToUnregister = value;
    }

    /**
     * Gets the value of the newRoleValue property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectNamesType }
     *     
     */
    public ObjectNamesType getNewRoleValue() {
        return newRoleValue;
    }

    /**
     * Sets the value of the newRoleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectNamesType }
     *     
     */
    public void setNewRoleValue(ObjectNamesType value) {
        this.newRoleValue = value;
    }

    /**
     * Gets the value of the oldRoleValue property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectNamesType }
     *     
     */
    public ObjectNamesType getOldRoleValue() {
        return oldRoleValue;
    }

    /**
     * Sets the value of the oldRoleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectNamesType }
     *     
     */
    public void setOldRoleValue(ObjectNamesType value) {
        this.oldRoleValue = value;
    }

    public RelationNotification withObjectName(String value) {
        setObjectName(value);
        return this;
    }

    public RelationNotification withRelationId(String value) {
        setRelationId(value);
        return this;
    }

    public RelationNotification withRelationTypeName(String value) {
        setRelationTypeName(value);
        return this;
    }

    public RelationNotification withRoleName(String value) {
        setRoleName(value);
        return this;
    }

    public RelationNotification withMBeansToUnregister(ObjectNamesType value) {
        setMBeansToUnregister(value);
        return this;
    }

    public RelationNotification withNewRoleValue(ObjectNamesType value) {
        setNewRoleValue(value);
        return this;
    }

    public RelationNotification withOldRoleValue(ObjectNamesType value) {
        setOldRoleValue(value);
        return this;
    }

    @Override
    public RelationNotification withSource(String value) {
        setSource(value);
        return this;
    }

    @Override
    public RelationNotification withMessage(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public RelationNotification withSequence(long value) {
        setSequence(value);
        return this;
    }

    @Override
    public RelationNotification withTimestamp(long value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public RelationNotification withDateTime(XMLGregorianCalendar value) {
        setDateTime(value);
        return this;
    }

    @Override
    public RelationNotification withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public RelationNotification withUserData(String value) {
        setUserData(value);
        return this;
    }

}
