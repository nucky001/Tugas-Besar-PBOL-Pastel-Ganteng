/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "mobil")
@NamedQueries({
    @NamedQuery(name = "Mobil.findAll", query = "SELECT m FROM Mobil m")})
public class Mobil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodemobil")
    private String kodemobil;
    @Basic(optional = false)
    @Column(name = "platnomor")
    private String platnomor;
    @Basic(optional = false)
    @Column(name = "tipemobil")
    private String tipemobil;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "kodemobil")
    private Peminjamdanpengembalian peminjamdanpengembalian;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "kodemobil")
    private Kelolaresiko kelolaresiko;

    public Mobil() {
    }

    public Mobil(String kodemobil) {
        this.kodemobil = kodemobil;
    }

    public Mobil(String kodemobil, String platnomor, String tipemobil) {
        this.kodemobil = kodemobil;
        this.platnomor = platnomor;
        this.tipemobil = tipemobil;
    }

    public String getKodemobil() {
        return kodemobil;
    }

    public void setKodemobil(String kodemobil) {
        this.kodemobil = kodemobil;
    }

    public String getPlatnomor() {
        return platnomor;
    }

    public void setPlatnomor(String platnomor) {
        this.platnomor = platnomor;
    }

    public String getTipemobil() {
        return tipemobil;
    }

    public void setTipemobil(String tipemobil) {
        this.tipemobil = tipemobil;
    }

    public Peminjamdanpengembalian getPeminjamdanpengembalian() {
        return peminjamdanpengembalian;
    }

    public void setPeminjamdanpengembalian(Peminjamdanpengembalian peminjamdanpengembalian) {
        this.peminjamdanpengembalian = peminjamdanpengembalian;
    }

    public Kelolaresiko getKelolaresiko() {
        return kelolaresiko;
    }

    public void setKelolaresiko(Kelolaresiko kelolaresiko) {
        this.kelolaresiko = kelolaresiko;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodemobil != null ? kodemobil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobil)) {
            return false;
        }
        Mobil other = (Mobil) object;
        if ((this.kodemobil == null && other.kodemobil != null) || (this.kodemobil != null && !this.kodemobil.equals(other.kodemobil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Mobil[ kodemobil=" + kodemobil + " ]";
    }
    
}
