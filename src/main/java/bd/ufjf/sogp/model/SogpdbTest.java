/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bd.ufjf.sogp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luis Augusto
 */
@Entity
@Table(name = "sogpdbtest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SogpdbTest.findAll", query = "SELECT s FROM SogpdbTest s"),
    @NamedQuery(name = "SogpdbTest.findById", query = "SELECT s FROM SogpdbTest s WHERE s.id = :id"),
    @NamedQuery(name = "SogpdbTest.findByDescription", query = "SELECT s FROM SogpdbTest s WHERE s.description = :description")})
public class SogpdbTest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Description")
    private String description;

    public SogpdbTest() {
    }

    public SogpdbTest(Integer id) {
        this.id = id;
    }

    public SogpdbTest(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SogpdbTest)) {
            return false;
        }
        SogpdbTest other = (SogpdbTest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bd.ufjf.sogp.model.SogpdbTest[ id=" + id + " ]";
    }

}
