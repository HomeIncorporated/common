//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 01:50:27 PM MSK 
//


package eu.nimble.service.model.ubl.commonaggregatecomponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.nimble.service.model.ubl.commonbasiccomponents.CodeType;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for DeclarationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclarationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationType", propOrder = {
    "name",
    "declarationTypeCode",
    "description"
})
@Entity(name = "DeclarationType")
@Table(name = "DECLARATION_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class DeclarationType
    implements Serializable, Equals
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected String name;
    @XmlElement(name = "DeclarationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CodeType declarationTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<String> description;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<DeclarationTypeDescriptionItem> descriptionItems;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_", length = 255)
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the declarationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    @ManyToOne(targetEntity = CodeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DECLARATION_TYPE_CODE_DECLAR_0")
    public CodeType getDeclarationTypeCode() {
        return declarationTypeCode;
    }

    /**
     * Sets the value of the declarationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDeclarationTypeCode(CodeType value) {
        this.declarationTypeCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Transient
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * 
     * 
     */
    public void setDescription(List<String> description) {
        this.description = description;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeclarationType that = ((DeclarationType) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            CodeType lhsDeclarationTypeCode;
            lhsDeclarationTypeCode = this.getDeclarationTypeCode();
            CodeType rhsDeclarationTypeCode;
            rhsDeclarationTypeCode = that.getDeclarationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declarationTypeCode", lhsDeclarationTypeCode), LocatorUtils.property(thatLocator, "declarationTypeCode", rhsDeclarationTypeCode), lhsDeclarationTypeCode, rhsDeclarationTypeCode)) {
                return false;
            }
        }
        {
            List<String> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<String> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @OneToMany(targetEntity = DeclarationTypeDescriptionItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_ITEMS_DECLARATIO_0")
    public List<DeclarationTypeDescriptionItem> getDescriptionItems() {
        if (this.descriptionItems == null) {
            this.descriptionItems = new ArrayList<DeclarationTypeDescriptionItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.description)) {
            this.description = ItemUtils.wrap(this.description, this.descriptionItems, DeclarationTypeDescriptionItem.class);
        }
        return this.descriptionItems;
    }

    public void setDescriptionItems(List<DeclarationTypeDescriptionItem> value) {
        this.description = null;
        this.descriptionItems = null;
        this.descriptionItems = value;
        if (this.descriptionItems == null) {
            this.descriptionItems = new ArrayList<DeclarationTypeDescriptionItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.description)) {
            this.description = ItemUtils.wrap(this.description, this.descriptionItems, DeclarationTypeDescriptionItem.class);
        }
    }

}
