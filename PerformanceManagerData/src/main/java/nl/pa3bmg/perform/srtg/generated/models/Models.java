//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.04 at 12:48:53 PM CEST 
//


package nl.pa3bmg.perform.srtg.generated.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Minfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Nameid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Typeid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Mactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Menable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "minfo"
})
@XmlRootElement(name = "Models")
public class Models {

    @XmlElement(name = "Minfo", required = true)
    protected List<Models.Minfo> minfo;

    /**
     * Default no-arg constructor
     * 
     */
    public Models() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Models(final List<Models.Minfo> minfo) {
        this.minfo = minfo;
    }

    /**
     * Gets the value of the minfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Models.Minfo }
     * 
     * 
     */
    public List<Models.Minfo> getMinfo() {
        if (minfo == null) {
            minfo = new ArrayList<Models.Minfo>();
        }
        return this.minfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Nameid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Typeid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Mactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Menable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "nameid",
        "type",
        "typeid",
        "mactive",
        "menable"
    })
    public static class Minfo {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Nameid", required = true)
        protected String nameid;
        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "Typeid", required = true)
        protected String typeid;
        @XmlElement(name = "Mactive")
        protected Boolean mactive;
        @XmlElement(name = "Menable")
        protected Boolean menable;

        /**
         * Default no-arg constructor
         * 
         */
        public Minfo() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Minfo(final String name, final String nameid, final String type, final String typeid, final Boolean mactive, final Boolean menable) {
            this.name = name;
            this.nameid = nameid;
            this.type = type;
            this.typeid = typeid;
            this.mactive = mactive;
            this.menable = menable;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
         * Gets the value of the nameid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameid() {
            return nameid;
        }

        /**
         * Sets the value of the nameid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameid(String value) {
            this.nameid = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the typeid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeid() {
            return typeid;
        }

        /**
         * Sets the value of the typeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeid(String value) {
            this.typeid = value;
        }

        /**
         * Gets the value of the mactive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMactive() {
            return mactive;
        }

        /**
         * Sets the value of the mactive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMactive(Boolean value) {
            this.mactive = value;
        }

        /**
         * Gets the value of the menable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMenable() {
            return menable;
        }

        /**
         * Sets the value of the menable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMenable(Boolean value) {
            this.menable = value;
        }

    }

}
