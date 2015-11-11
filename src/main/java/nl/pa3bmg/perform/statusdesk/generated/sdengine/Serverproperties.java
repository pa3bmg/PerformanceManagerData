//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.04 at 12:48:53 PM CEST 
//


package nl.pa3bmg.perform.statusdesk.generated.sdengine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverproperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverproperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status_range">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="cpu_green" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="cpu_red" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="disk_green" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="disk_red" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="mem_green" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="mem_red" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="temp_green" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="temp_red" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status_weight">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="cpu" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="disk" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="mem" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="temp" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "serverproperties", propOrder = {
    "collection",
    "statusRange",
    "statusWeight"
})
public class Serverproperties {

    @XmlElement(required = true)
    protected Serverproperties.Collection collection;
    @XmlElement(name = "status_range", required = true)
    protected Serverproperties.StatusRange statusRange;
    @XmlElement(name = "status_weight", required = true)
    protected Serverproperties.StatusWeight statusWeight;

    /**
     * Default no-arg constructor
     * 
     */
    public Serverproperties() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Serverproperties(final Serverproperties.Collection collection, final Serverproperties.StatusRange statusRange, final Serverproperties.StatusWeight statusWeight) {
        this.collection = collection;
        this.statusRange = statusRange;
        this.statusWeight = statusWeight;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link Serverproperties.Collection }
     *     
     */
    public Serverproperties.Collection getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Serverproperties.Collection }
     *     
     */
    public void setCollection(Serverproperties.Collection value) {
        this.collection = value;
    }

    /**
     * Gets the value of the statusRange property.
     * 
     * @return
     *     possible object is
     *     {@link Serverproperties.StatusRange }
     *     
     */
    public Serverproperties.StatusRange getStatusRange() {
        return statusRange;
    }

    /**
     * Sets the value of the statusRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Serverproperties.StatusRange }
     *     
     */
    public void setStatusRange(Serverproperties.StatusRange value) {
        this.statusRange = value;
    }

    /**
     * Gets the value of the statusWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Serverproperties.StatusWeight }
     *     
     */
    public Serverproperties.StatusWeight getStatusWeight() {
        return statusWeight;
    }

    /**
     * Sets the value of the statusWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Serverproperties.StatusWeight }
     *     
     */
    public void setStatusWeight(Serverproperties.StatusWeight value) {
        this.statusWeight = value;
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
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Collection {

        @XmlAttribute
        protected String name;

        /**
         * Default no-arg constructor
         * 
         */
        public Collection() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Collection(final String name) {
            this.name = name;
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
     *       &lt;attribute name="cpu_green" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="cpu_red" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="disk_green" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="disk_red" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="mem_green" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="mem_red" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="temp_green" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="temp_red" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StatusRange {

        @XmlAttribute(name = "cpu_green")
        protected Integer cpuGreen;
        @XmlAttribute(name = "cpu_red")
        protected Integer cpuRed;
        @XmlAttribute(name = "disk_green")
        protected Integer diskGreen;
        @XmlAttribute(name = "disk_red")
        protected Integer diskRed;
        @XmlAttribute(name = "mem_green")
        protected Integer memGreen;
        @XmlAttribute(name = "mem_red")
        protected Integer memRed;
        @XmlAttribute(name = "temp_green")
        protected Integer tempGreen;
        @XmlAttribute(name = "temp_red")
        protected Integer tempRed;

        /**
         * Default no-arg constructor
         * 
         */
        public StatusRange() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public StatusRange(final Integer cpuGreen, final Integer cpuRed, final Integer diskGreen, final Integer diskRed, final Integer memGreen, final Integer memRed, final Integer tempGreen, final Integer tempRed) {
            this.cpuGreen = cpuGreen;
            this.cpuRed = cpuRed;
            this.diskGreen = diskGreen;
            this.diskRed = diskRed;
            this.memGreen = memGreen;
            this.memRed = memRed;
            this.tempGreen = tempGreen;
            this.tempRed = tempRed;
        }

        /**
         * Gets the value of the cpuGreen property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCpuGreen() {
            return cpuGreen;
        }

        /**
         * Sets the value of the cpuGreen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCpuGreen(Integer value) {
            this.cpuGreen = value;
        }

        /**
         * Gets the value of the cpuRed property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCpuRed() {
            return cpuRed;
        }

        /**
         * Sets the value of the cpuRed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCpuRed(Integer value) {
            this.cpuRed = value;
        }

        /**
         * Gets the value of the diskGreen property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDiskGreen() {
            return diskGreen;
        }

        /**
         * Sets the value of the diskGreen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDiskGreen(Integer value) {
            this.diskGreen = value;
        }

        /**
         * Gets the value of the diskRed property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDiskRed() {
            return diskRed;
        }

        /**
         * Sets the value of the diskRed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDiskRed(Integer value) {
            this.diskRed = value;
        }

        /**
         * Gets the value of the memGreen property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMemGreen() {
            return memGreen;
        }

        /**
         * Sets the value of the memGreen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMemGreen(Integer value) {
            this.memGreen = value;
        }

        /**
         * Gets the value of the memRed property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMemRed() {
            return memRed;
        }

        /**
         * Sets the value of the memRed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMemRed(Integer value) {
            this.memRed = value;
        }

        /**
         * Gets the value of the tempGreen property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTempGreen() {
            return tempGreen;
        }

        /**
         * Sets the value of the tempGreen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTempGreen(Integer value) {
            this.tempGreen = value;
        }

        /**
         * Gets the value of the tempRed property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTempRed() {
            return tempRed;
        }

        /**
         * Sets the value of the tempRed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTempRed(Integer value) {
            this.tempRed = value;
        }

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
     *       &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="cpu" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="disk" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="mem" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="temp" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StatusWeight {

        @XmlAttribute
        protected Integer condition;
        @XmlAttribute
        protected Integer contact;
        @XmlAttribute
        protected Integer cpu;
        @XmlAttribute
        protected Integer disk;
        @XmlAttribute
        protected Integer mem;
        @XmlAttribute
        protected Integer temp;

        /**
         * Default no-arg constructor
         * 
         */
        public StatusWeight() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public StatusWeight(final Integer condition, final Integer contact, final Integer cpu, final Integer disk, final Integer mem, final Integer temp) {
            this.condition = condition;
            this.contact = contact;
            this.cpu = cpu;
            this.disk = disk;
            this.mem = mem;
            this.temp = temp;
        }

        /**
         * Gets the value of the condition property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCondition() {
            return condition;
        }

        /**
         * Sets the value of the condition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCondition(Integer value) {
            this.condition = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setContact(Integer value) {
            this.contact = value;
        }

        /**
         * Gets the value of the cpu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCpu() {
            return cpu;
        }

        /**
         * Sets the value of the cpu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCpu(Integer value) {
            this.cpu = value;
        }

        /**
         * Gets the value of the disk property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDisk() {
            return disk;
        }

        /**
         * Sets the value of the disk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDisk(Integer value) {
            this.disk = value;
        }

        /**
         * Gets the value of the mem property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMem() {
            return mem;
        }

        /**
         * Sets the value of the mem property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMem(Integer value) {
            this.mem = value;
        }

        /**
         * Gets the value of the temp property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTemp() {
            return temp;
        }

        /**
         * Sets the value of the temp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTemp(Integer value) {
            this.temp = value;
        }

    }

}
