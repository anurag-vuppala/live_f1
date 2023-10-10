
package org.apache.camel.component.jmx.jaxb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 List of object names used in RelationNotification
 *             
 * 
 * <p>Java class for objectNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectNamesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectNamesType", propOrder = {
    "objectName"
})
public class ObjectNamesType {

    @XmlElement(required = true)
    protected List<String> objectName;

    /**
     * Gets the value of the objectName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the objectName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectName() {
        if (objectName == null) {
            objectName = new ArrayList<String>();
        }
        return this.objectName;
    }

    public ObjectNamesType withObjectName(String... values) {
        if (values!= null) {
            for (String value: values) {
                getObjectName().add(value);
            }
        }
        return this;
    }

    public ObjectNamesType withObjectName(Collection<String> values) {
        if (values!= null) {
            getObjectName().addAll(values);
        }
        return this;
    }

}
