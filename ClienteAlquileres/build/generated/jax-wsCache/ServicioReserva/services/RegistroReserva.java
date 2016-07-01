
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistroReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroReserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codcl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroReserva", propOrder = {
    "placa",
    "fechar",
    "codcl"
})
public class RegistroReserva {

    protected String placa;
    protected String fechar;
    protected int codcl;

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechar() {
        return fechar;
    }

    /**
     * Define el valor de la propiedad fechar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechar(String value) {
        this.fechar = value;
    }

    /**
     * Obtiene el valor de la propiedad codcl.
     * 
     */
    public int getCodcl() {
        return codcl;
    }

    /**
     * Define el valor de la propiedad codcl.
     * 
     */
    public void setCodcl(int value) {
        this.codcl = value;
    }

}
