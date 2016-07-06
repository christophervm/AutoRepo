/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "TBAuto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TBAuto.findAll", query = "SELECT t FROM TBAuto t"),
    @NamedQuery(name = "TBAuto.findByPlaca", query = "SELECT t FROM TBAuto t WHERE t.placa = :placa"),
    @NamedQuery(name = "TBAuto.findByNombre", query = "SELECT t FROM TBAuto t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TBAuto.findByPrecio", query = "SELECT t FROM TBAuto t WHERE t.precio = :precio"),
    @NamedQuery(name = "TBAuto.findByEstado", query = "SELECT t FROM TBAuto t WHERE t.estado = :estado")})
public class TBAuto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "Placa")
    private String placa;
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Estado")
    private String estado;
    @JoinColumn(name = "CodModelo", referencedColumnName = "CodModelo")
    @ManyToOne(optional = false)
    private TBModelo codModelo;

    public TBAuto() {
    }

    public TBAuto(String placa) {
        this.placa = placa;
    }

    public TBAuto(String placa, BigDecimal precio, String estado) {
        this.placa = placa;
        this.precio = precio;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TBModelo getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(TBModelo codModelo) {
        this.codModelo = codModelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBAuto)) {
            return false;
        }
        TBAuto other = (TBAuto) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.TBAuto[ placa=" + placa + " ]";
    }
    
}
