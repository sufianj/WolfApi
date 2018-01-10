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
    "synset"
})
@XmlRootElement(name = "WN")
public class WN {

    @XmlElement(name = "SYNSET", required = true)
    protected List<SYNSET> synset;

    /**
     * Gets the value of the synset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSYNSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SYNSET }
     * 
     * 
     */
    public List<SYNSET> getSYNSET() {
        if (synset == null) {
            synset = new ArrayList<SYNSET>();
        }
        return this.synset;
    }

}
