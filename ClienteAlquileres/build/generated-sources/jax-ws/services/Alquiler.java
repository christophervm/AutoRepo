
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alquiler complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alquiler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clie" type="{http://services/}cliente" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechalim" type="{http://services/}date" minOccurs="0"/>
 *         &lt;element name="fechares" type="{http://services/}date" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://services/}auto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alquiler", propOrder = {
    "clie",
    "codigo",
    "fechalim",
    "fechares",
    "placa"
})
public class Alquiler {

    protected Cliente clie;
    protected int codigo;
    protected Date fechalim;
    protected Date fechares;
    protected Auto placa;

    /**
     * Obtiene el valor de la propiedad clie.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getClie() {
        return clie;
    }

    /**
     * Define el valor de la propiedad clie.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setClie(Cliente value) {
        this.clie = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechalim.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechalim() {
        return fechalim;
    }

    /**
     * Define el valor de la propiedad fechalim.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechalim(Date value) {
        this.fechalim = value;
    }

    /**
     * Obtiene el valor de la propiedad fechares.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechares() {
        return fechares;
    }

    /**
     * Define el valor de la propiedad fechares.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechares(Date value) {
        this.fechares = value;
    }

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link Auto }
     *     
     */
    public Auto getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link Auto }
     *     
     */
    public void setPlaca(Auto value) {
        this.placa = value;
    }

}
