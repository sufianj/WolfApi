//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.04 à 10:58:48 AM CEST 
//


package wolfapi.WNModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "LITERAL")
public class LITERAL {

    @XmlAttribute(name = "lnote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lnote;
    @XmlAttribute(name = "sense")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sense;
    @XmlValue
    protected String value;

    /**
     * Obtient la valeur de la propriété lnote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnote() {
        return lnote;
    }

    /**
     * Définit la valeur de la propriété lnote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnote(String value) {
        this.lnote = value;
    }

    /**
     * Obtient la valeur de la propriété sense.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSense() {
        return sense;
    }

    /**
     * Définit la valeur de la propriété sense.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSense(String value) {
        this.sense = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getvalue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setvalue(String value) {
        this.value = value;
    }

	@Override
	public String toString() {
		return "LITERAL [lnote=" + lnote + ", sense=" + sense + ", value=" + value + "]";
	}

}
