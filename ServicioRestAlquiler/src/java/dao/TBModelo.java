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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TBModelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TBModelo.findAll", query = "SELECT t FROM TBModelo t"),
    @NamedQuery(name = "TBModelo.findByCodModelo", query = "SELECT t FROM TBModelo t WHERE t.codModelo = :codModelo"),
    @NamedQuery(name = "TBModelo.findByDescripcion", query = "SELECT t FROM TBModelo t WHERE t.descripcion = :descripcion")})
public class TBModelo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CodModelo")
    private Integer codModelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codModelo")
    private Collection<TBAuto> tBAutoCollection;
    @JoinColumn(name = "CodMarca", referencedColumnName = "CodMarca")
    @ManyToOne(optional = false)
    private TBMarca codMarca;

    public TBModelo() {
    }

    public TBModelo(Integer codModelo) {
        this.codModelo = codModelo;
    }

    public TBModelo(Integer codModelo, String descripcion) {
        this.codModelo = codModelo;
        this.descripcion = descripcion;
    }

    public Integer getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(Integer codModelo) {
        this.codModelo = codModelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<TBAuto> getTBAutoCollection() {
        return tBAutoCollection;
    }

    public void setTBAutoCollection(Collection<TBAuto> tBAutoCollection) {
        this.tBAutoCollection = tBAutoCollection;
    }

    public TBMarca getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(TBMarca codMarca) {
        this.codMarca = codMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codModelo != null ? codModelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBModelo)) {
            return false;
        }
        TBModelo other = (TBModelo) object;
        if ((this.codModelo == null && other.codModelo != null) || (this.codModelo != null && !this.codModelo.equals(other.codModelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.TBModelo[ codModelo=" + codModelo + " ]";
    }
    
}
