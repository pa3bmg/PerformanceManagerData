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
 *         &lt;element name="status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="change" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="specserver">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="server">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serverproperties" type="{http://perform.pa3bmg.nl/statusdesk/generated/sdengine}serverproperties"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infra">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infraproperties" type="{http://perform.pa3bmg.nl/statusdesk/generated/sdengine}infraproperties"/>
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
    "status",
    "specserver",
    "server",
    "infra"
})
@XmlRootElement(name = "sdenginge")
public class Sdenginge {

    @XmlElement(required = true)
    protected Sdenginge.Status status;
    @XmlElement(required = true)
    protected Sdenginge.Specserver specserver;
    @XmlElement(required = true)
    protected Sdenginge.Server server;
    @XmlElement(required = true)
    protected Sdenginge.Infra infra;

    /**
     * Default no-arg constructor
     * 
     */
    public Sdenginge() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Sdenginge(final Sdenginge.Status status, final Sdenginge.Specserver specserver, final Sdenginge.Server server, final Sdenginge.Infra infra) {
        this.status = status;
        this.specserver = specserver;
        this.server = server;
        this.infra = infra;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Sdenginge.Status }
     *     
     */
    public Sdenginge.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sdenginge.Status }
     *     
     */
    public void setStatus(Sdenginge.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the specserver property.
     * 
     * @return
     *     possible object is
     *     {@link Sdenginge.Specserver }
     *     
     */
    public Sdenginge.Specserver getSpecserver() {
        return specserver;
    }

    /**
     * Sets the value of the specserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sdenginge.Specserver }
     *     
     */
    public void setSpecserver(Sdenginge.Specserver value) {
        this.specserver = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link Sdenginge.Server }
     *     
     */
    public Sdenginge.Server getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sdenginge.Server }
     *     
     */
    public void setServer(Sdenginge.Server value) {
        this.server = value;
    }

    /**
     * Gets the value of the infra property.
     * 
     * @return
     *     possible object is
     *     {@link Sdenginge.Infra }
     *     
     */
    public Sdenginge.Infra getInfra() {
        return infra;
    }

    /**
     * Sets the value of the infra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sdenginge.Infra }
     *     
     */
    public void setInfra(Sdenginge.Infra value) {
        this.infra = value;
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
     *         &lt;element name="infraproperties" type="{http://perform.pa3bmg.nl/statusdesk/generated/sdengine}infraproperties"/>
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
        "infraproperties"
    })
    public static class Infra {

        @XmlElement(required = true)
        protected Infraproperties infraproperties;

        /**
         * Default no-arg constructor
         * 
         */
        public Infra() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Infra(final Infraproperties infraproperties) {
            this.infraproperties = infraproperties;
        }

        /**
         * Gets the value of the infraproperties property.
         * 
         * @return
         *     possible object is
         *     {@link Infraproperties }
         *     
         */
        public Infraproperties getInfraproperties() {
            return infraproperties;
        }

        /**
         * Sets the value of the infraproperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link Infraproperties }
         *     
         */
        public void setInfraproperties(Infraproperties value) {
            this.infraproperties = value;
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
     *       &lt;sequence>
     *         &lt;element name="serverproperties" type="{http://perform.pa3bmg.nl/statusdesk/generated/sdengine}serverproperties"/>
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
        "serverproperties"
    })
    public static class Server {

        @XmlElement(required = true)
        protected Serverproperties serverproperties;

        /**
         * Default no-arg constructor
         * 
         */
        public Server() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Server(final Serverproperties serverproperties) {
            this.serverproperties = serverproperties;
        }

        /**
         * Gets the value of the serverproperties property.
         * 
         * @return
         *     possible object is
         *     {@link Serverproperties }
         *     
         */
        public Serverproperties getServerproperties() {
            return serverproperties;
        }

        /**
         * Sets the value of the serverproperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link Serverproperties }
         *     
         */
        public void setServerproperties(Serverproperties value) {
            this.serverproperties = value;
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
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Specserver {

        @XmlAttribute
        protected String name;
        @XmlAttribute
        protected String password;
        @XmlAttribute
        protected String server;

        /**
         * Default no-arg constructor
         * 
         */
        public Specserver() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Specserver(final String name, final String password, final String server) {
            this.name = name;
            this.password = password;
            this.server = server;
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
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the server property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer() {
            return server;
        }

        /**
         * Sets the value of the server property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer(String value) {
            this.server = value;
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
     *       &lt;attribute name="change" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Status {

        @XmlAttribute
        protected String change;
        @XmlAttribute
        protected Boolean status;

        /**
         * Default no-arg constructor
         * 
         */
        public Status() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Status(final String change, final Boolean status) {
            this.change = change;
            this.status = status;
        }

        /**
         * Gets the value of the change property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChange() {
            return change;
        }

        /**
         * Sets the value of the change property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChange(String value) {
            this.change = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStatus(Boolean value) {
            this.status = value;
        }

    }

}