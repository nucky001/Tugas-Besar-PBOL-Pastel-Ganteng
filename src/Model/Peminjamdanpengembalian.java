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
@Table(name = "peminjamdanpengembalian")
@NamedQueries({
    @NamedQuery(name = "Peminjamdanpengembalian.findAll", query = "SELECT p FROM Peminjamdanpengembalian p")})
public class Peminjamdanpengembalian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kodepeminjaman")
    private Integer kodepeminjaman;
    @Basic(optional = false)
    @Column(name = "tanggalpeminjaman")
    @Temporal(TemporalType.DATE)
    private Date tanggalpeminjaman;
    @Basic(optional = false)
    @Column(name = "tanggalpengembalian")
    @Temporal(TemporalType.DATE)
    private Date tanggalpengembalian;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Column(name = "lamaterlambat")
    private String lamaterlambat;
    @Column(name = "dendaterlambat")
    private String dendaterlambat;
    @JoinColumn(name = "kodepegawai", referencedColumnName = "kodepegawai")
    @OneToOne
    private Karyawan kodepegawai;
    @JoinColumn(name = "kodemobil", referencedColumnName = "kodemobil")
    @OneToOne(optional = false)
    private Mobil kodemobil;
    @JoinColumn(name = "nomoridentitas", referencedColumnName = "nomoridentitas")
    @OneToOne(optional = false)
    private Peminjam nomoridentitas;

    public Peminjamdanpengembalian() {
    }

    public Peminjamdanpengembalian(Integer kodepeminjaman) {
        this.kodepeminjaman = kodepeminjaman;
    }

    public Peminjamdanpengembalian(Integer kodepeminjaman, Date tanggalpeminjaman, Date tanggalpengembalian, String status) {
        this.kodepeminjaman = kodepeminjaman;
        this.tanggalpeminjaman = tanggalpeminjaman;
        this.tanggalpengembalian = tanggalpengembalian;
        this.status = status;
    }

    public Integer getKodepeminjaman() {
        return kodepeminjaman;
    }

    public void setKodepeminjaman(Integer kodepeminjaman) {
        this.kodepeminjaman = kodepeminjaman;
    }

    public Date getTanggalpeminjaman() {
        return tanggalpeminjaman;
    }

    public void setTanggalpeminjaman(Date tanggalpeminjaman) {
        this.tanggalpeminjaman = tanggalpeminjaman;
    }

    public Date getTanggalpengembalian() {
        return tanggalpengembalian;
    }

    public void setTanggalpengembalian(Date tanggalpengembalian) {
        this.tanggalpengembalian = tanggalpengembalian;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLamaterlambat() {
        return lamaterlambat;
    }

    public void setLamaterlambat(String lamaterlambat) {
        this.lamaterlambat = lamaterlambat;
    }

    public String getDendaterlambat() {
        return dendaterlambat;
    }

    public void setDendaterlambat(String dendaterlambat) {
        this.dendaterlambat = dendaterlambat;
    }

    public Karyawan getKodepegawai() {
        return kodepegawai;
    }

    public void setKodepegawai(Karyawan kodepegawai) {
        this.kodepegawai = kodepegawai;
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
        hash += (kodepeminjaman != null ? kodepeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjamdanpengembalian)) {
            return false;
        }
        Peminjamdanpengembalian other = (Peminjamdanpengembalian) object;
        if ((this.kodepeminjaman == null && other.kodepeminjaman != null) || (this.kodepeminjaman != null && !this.kodepeminjaman.equals(other.kodepeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Peminjamdanpengembalian[ kodepeminjaman=" + kodepeminjaman + " ]";
    }
    
}
