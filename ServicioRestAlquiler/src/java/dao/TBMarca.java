/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "TBMarca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TBMarca.findAll", query = "SELECT t FROM TBMarca t"),
    @NamedQuery(name = "TBMarca.findByCodMarca", query = "SELECT t FROM TBMarca t WHERE t.codMarca = :codMarca"),
    @NamedQuery(name = "TBMarca.findByDescripcionMarca", query = "SELECT t FROM TBMarca t WHERE t.descripcionMarca = :descripcionMarca")})
public class TBMarca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CodMarca")
    private Integer codMarca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Descripcion_Marca")
    private String descripcionMarca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codMarca")
    private Collection<TBModelo> tBModeloCollection;

    public TBMarca() {
    }

    public TBMarca(Integer codMarca) {
        this.codMarca = codMarca;
    }

    public TBMarca(Integer codMarca, String descripcionMarca) {
        this.codMarca = codMarca;
        this.descripcionMarca = descripcionMarca;
    }

    public Integer getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(Integer codMarca) {
        this.codMarca = codMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }

    @XmlTransient
    public Collection<TBModelo> getTBModeloCollection() {
        return tBModeloCollection;
    }

    public void setTBModeloCollection(Collection<TBModelo> tBModeloCollection) {
        this.tBModeloCollection = tBModeloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMarca != null ? codMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBMarca)) {
            return false;
        }
        TBMarca other = (TBMarca) object;
        if ((this.codMarca == null && other.codMarca != null) || (this.codMarca != null && !this.codMarca.equals(other.codMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.TBMarca[ codMarca=" + codMarca + " ]";
    }
    
}
