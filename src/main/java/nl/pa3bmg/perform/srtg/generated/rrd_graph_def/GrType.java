//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.04 at 12:48:53 PM CEST 
//


package nl.pa3bmg.perform.srtg.generated.rrd_graph_def;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rigid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grType", propOrder = {
    "lower",
    "upper",
    "rigid"
})
public class GrType {

    protected int lower;
    protected int upper;
    protected boolean rigid;

    /**
     * Default no-arg constructor
     * 
     */
    public GrType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GrType(final int lower, final int upper, final boolean rigid) {
        this.lower = lower;
        this.upper = upper;
        this.rigid = rigid;
    }

    /**
     * Gets the value of the lower property.
     * 
     */
    public int getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     */
    public void setLower(int value) {
        this.lower = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     */
    public int getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     */
    public void setUpper(int value) {
        this.upper = value;
    }

    /**
     * Gets the value of the rigid property.
     * 
     */
    public boolean isRigid() {
        return rigid;
    }

    /**
     * Sets the value of the rigid property.
     * 
     */
    public void setRigid(boolean value) {
        this.rigid = value;
    }

}