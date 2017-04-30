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
@Table(name = "peminjam")
@NamedQueries({
    @NamedQuery(name = "Peminjam.findAll", query = "SELECT p FROM Peminjam p")})
public class Peminjam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nomoridentitas")
    private String nomoridentitas;
    @Basic(optional = false)
    @Column(name = "jenisidentitas")
    private String jenisidentitas;
    @Basic(optional = false)
    @Column(name = "namalengkap")
    private String namalengkap;
    @Basic(optional = false)
    @Column(name = "alamatpeminjam")
    private String alamatpeminjam;
    @Basic(optional = false)
    @Column(name = "nomorteleponpeminjam")
    private String nomorteleponpeminjam;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "nomoridentitas")
    private Peminjamdanpengembalian peminjamdanpengembalian;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "nomoridentitas")
    private Kelolaresiko kelolaresiko;

    public Peminjam() {
    }

    public Peminjam(String nomoridentitas) {
        this.nomoridentitas = nomoridentitas;
    }

    public Peminjam(String nomoridentitas, String jenisidentitas, String namalengkap, String alamatpeminjam, String nomorteleponpeminjam) {
        this.nomoridentitas = nomoridentitas;
        this.jenisidentitas = jenisidentitas;
        this.namalengkap = namalengkap;
        this.alamatpeminjam = alamatpeminjam;
        this.nomorteleponpeminjam = nomorteleponpeminjam;
    }

    public String getNomoridentitas() {
        return nomoridentitas;
    }

    public void setNomoridentitas(String nomoridentitas) {
        this.nomoridentitas = nomoridentitas;
    }

    public String getJenisidentitas() {
        return jenisidentitas;
    }

    public void setJenisidentitas(String jenisidentitas) {
        this.jenisidentitas = jenisidentitas;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getAlamatpeminjam() {
        return alamatpeminjam;
    }

    public void setAlamatpeminjam(String alamatpeminjam) {
        this.alamatpeminjam = alamatpeminjam;
    }

    public String getNomorteleponpeminjam() {
        return nomorteleponpeminjam;
    }

    public void setNomorteleponpeminjam(String nomorteleponpeminjam) {
        this.nomorteleponpeminjam = nomorteleponpeminjam;
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
        hash += (nomoridentitas != null ? nomoridentitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjam)) {
            return false;
        }
        Peminjam other = (Peminjam) object;
        if ((this.nomoridentitas == null && other.nomoridentitas != null) || (this.nomoridentitas != null && !this.nomoridentitas.equals(other.nomoridentitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Peminjam[ nomoridentitas=" + nomoridentitas + " ]";
    }
    
}
