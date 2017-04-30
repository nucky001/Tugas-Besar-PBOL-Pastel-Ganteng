/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "kelolaresiko")
@NamedQueries({
    @NamedQuery(name = "Kelolaresiko.findAll", query = "SELECT k FROM Kelolaresiko k")})
public class Kelolaresiko implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kodeasuransi")
    private Integer kodeasuransi;
    @Basic(optional = false)
    @Column(name = "namaasuransi")
    private String namaasuransi;
    @Basic(optional = false)
    @Column(name = "tanggalkecelakaan")
    @Temporal(TemporalType.DATE)
    private Date tanggalkecelakaan;
    @Basic(optional = false)
    @Column(name = "keterangan")
    private String keterangan;
    @JoinColumn(name = "kodemobil", referencedColumnName = "kodemobil")
    @OneToOne(optional = false)
    private Mobil kodemobil;
    @JoinColumn(name = "nomoridentitas", referencedColumnName = "nomoridentitas")
    @OneToOne(optional = false)
    private Peminjam nomoridentitas;

    public Kelolaresiko() {
    }

    public Kelolaresiko(Integer kodeasuransi) {
        this.kodeasuransi = kodeasuransi;
    }

    public Kelolaresiko(Integer kodeasuransi, String namaasuransi, Date tanggalkecelakaan, String keterangan) {
        this.kodeasuransi = kodeasuransi;
        this.namaasuransi = namaasuransi;
        this.tanggalkecelakaan = tanggalkecelakaan;
        this.keterangan = keterangan;
    }

    public Integer getKodeasuransi() {
        return kodeasuransi;
    }

    public void setKodeasuransi(Integer kodeasuransi) {
        this.kodeasuransi = kodeasuransi;
    }

    public String getNamaasuransi() {
        return namaasuransi;
    }

    public void setNamaasuransi(String namaasuransi) {
        this.namaasuransi = namaasuransi;
    }

    public Date getTanggalkecelakaan() {
        return tanggalkecelakaan;
    }

    public void setTanggalkecelakaan(Date tanggalkecelakaan) {
        this.tanggalkecelakaan = tanggalkecelakaan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Mobil getKodemobil() {
        return kodemobil;
    }

    public void setKodemobil(Mobil kodemobil) {
        this.kodemobil = kodemobil;
    }

    public Peminjam getNomoridentitas() {
        return nomoridentitas;
    }

    public void setNomoridentitas(Peminjam nomoridentitas) {
        this.nomoridentitas = nomoridentitas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeasuransi != null ? kodeasuransi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kelolaresiko)) {
            return false;
        }
        Kelolaresiko other = (Kelolaresiko) object;
        if ((this.kodeasuransi == null && other.kodeasuransi != null) || (this.kodeasuransi != null && !this.kodeasuransi.equals(other.kodeasuransi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Kelolaresiko[ kodeasuransi=" + kodeasuransi + " ]";
    }
    
}
