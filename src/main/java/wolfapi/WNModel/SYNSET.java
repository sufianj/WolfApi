//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.04 à 10:58:48 AM CEST 
//


package wolfapi.WNModel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "pos",
    "synonym",
    "ilr",
    "bcs",
    "def",
    "usage",
    "domain",
    "sumo"
})
@XmlRootElement(name = "SYNSET")
public class SYNSET {
	@XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "POS", required = true)
    protected String pos;
    @XmlElement(name = "SYNONYM", required = true)
    protected SYNONYM synonym;
    @Override
	public String toString() {
		return "SYNSET [id=" + id + ", pos=" + pos + ", synonym=" + synonym + ", bcs=" + bcs + ", def="
				+ def + ", domain=" + domain + "]";
	}

	@XmlElement(name = "ILR")
    protected List<ILR> ilr;
    @XmlElement(name = "BCS")
    protected String bcs;
    @XmlElement(name = "DEF")
    protected String def;
    @XmlElement(name = "USAGE")
    protected List<USAGE> usage;
    @XmlElement(name = "DOMAIN")
    protected DOMAIN domain;
    @XmlElement(name = "SUMO")
    protected List<SUMO> sumo;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété pos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOS() {
        return pos;
    }

    /**
     * Définit la valeur de la propriété pos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOS(String value) {
        this.pos = value;
    }

    /**
     * Obtient la valeur de la propriété synonym.
     * 
     * @return
     *     possible object is
     *     {@link SYNONYM }
     *     
     */
    public SYNONYM getSYNONYM() {
        return synonym;
    }

    /**
     * Définit la valeur de la propriété synonym.
     * 
     * @param value
     *     allowed object is
     *     {@link SYNONYM }
     *     
     */
    public void setSYNONYM(SYNONYM value) {
        this.synonym = value;
    }

    /**
     * Gets the value of the ilr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ilr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getILR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ILR }
     * 
     * 
     */
    public List<ILR> getILR() {
        if (ilr == null) {
            ilr = new ArrayList<ILR>();
        }
        return this.ilr;
    }

    /**
     * Obtient la valeur de la propriété bcs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCS() {
        return bcs;
    }

    /**
     * Définit la valeur de la propriété bcs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCS(String value) {
        this.bcs = value;
    }

    /**
     * Obtient la valeur de la propriété def.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEF() {
        return def;
    }

    /**
     * Définit la valeur de la propriété def.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEF(String value) {
        this.def = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USAGE }
     * 
     * 
     */
    public List<USAGE> getUSAGE() {
        if (usage == null) {
            usage = new ArrayList<USAGE>();
        }
        return this.usage;
    }

    /**
     * Obtient la valeur de la propriété domain.
     * 
     * @return
     *     possible object is
     *     {@link DOMAIN }
     *     
     */
    public DOMAIN getDOMAIN() {
        return domain;
    }

    /**
     * Définit la valeur de la propriété domain.
     * 
     * @param value
     *     allowed object is
     *     {@link DOMAIN }
     *     
     */
    public void setDOMAIN(DOMAIN value) {
        this.domain = value;
    }

    /**
     * Gets the value of the sumo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sumo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUMO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUMO }
     * 
     * 
     */
    public List<SUMO> getSUMO() {
        if (sumo == null) {
            sumo = new ArrayList<SUMO>();
        }
        return this.sumo;
    }

}
