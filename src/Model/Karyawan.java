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
@Table(name = "karyawan")
@NamedQueries({
    @NamedQuery(name = "Karyawan.findAll", query = "SELECT k FROM Karyawan k")})
public class Karyawan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodepegawai")
    private String kodepegawai;
    @Basic(optional = false)
    @Column(name = "jabatan")
    private String jabatan;
    @Basic(optional = false)
    @Column(name = "nomoridentitasktp")
    private String nomoridentitasktp;
    @Basic(optional = false)
    @Column(name = "namakaryawan")
    private String namakaryawan;
    @Basic(optional = false)
    @Column(name = "alamatkaryawan")
    private String alamatkaryawan;
    @Basic(optional = false)
    @Column(name = "notelpkaryawan")
    private String notelpkaryawan;
    @Basic(optional = false)
    @Column(name = "nomoridentitassim")
    private String nomoridentitassim;
    @OneToOne(mappedBy = "kodepegawai")
    private Peminjamdanpengembalian peminjamdanpengembalian;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "kodepegawai")
    private Penggajian penggajian;

    public Karyawan() {
    }

    public Karyawan(String kodepegawai) {
        this.kodepegawai = kodepegawai;
    }

    public Karyawan(String kodepegawai, String jabatan, String nomoridentitasktp, String namakaryawan, String alamatkaryawan, String notelpkaryawan, String nomoridentitassim) {
        this.kodepegawai = kodepegawai;
        this.jabatan = jabatan;
        this.nomoridentitasktp = nomoridentitasktp;
        this.namakaryawan = namakaryawan;
        this.alamatkaryawan = alamatkaryawan;
        this.notelpkaryawan = notelpkaryawan;
        this.nomoridentitassim = nomoridentitassim;
    }

    public String getKodepegawai() {
        return kodepegawai;
    }

    public void setKodepegawai(String kodepegawai) {
        this.kodepegawai = kodepegawai;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNomoridentitasktp() {
        return nomoridentitasktp;
    }

    public void setNomoridentitasktp(String nomoridentitasktp) {
        this.nomoridentitasktp = nomoridentitasktp;
    }

    public String getNamakaryawan() {
        return namakaryawan;
    }

    public void setNamakaryawan(String namakaryawan) {
        this.namakaryawan = namakaryawan;
    }

    public String getAlamatkaryawan() {
        return alamatkaryawan;
    }

    public void setAlamatkaryawan(String alamatkaryawan) {
        this.alamatkaryawan = alamatkaryawan;
    }

    public String getNotelpkaryawan() {
        return notelpkaryawan;
    }

    public void setNotelpkaryawan(String notelpkaryawan) {
        this.notelpkaryawan = notelpkaryawan;
    }

    public String getNomoridentitassim() {
        return nomoridentitassim;
    }

    public void setNomoridentitassim(String nomoridentitassim) {
        this.nomoridentitassim = nomoridentitassim;
    }

    public Peminjamdanpengembalian getPeminjamdanpengembalian() {
        return peminjamdanpengembalian;
    }

    public void setPeminjamdanpengembalian(Peminjamdanpengembalian peminjamdanpengembalian) {
        this.peminjamdanpengembalian = peminjamdanpengembalian;
    }

    public Penggajian getPenggajian() {
        return penggajian;
    }

    public void setPenggajian(Penggajian penggajian) {
        this.penggajian = penggajian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodepegawai != null ? kodepegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.kodepegawai == null && other.kodepegawai != null) || (this.kodepegawai != null && !this.kodepegawai.equals(other.kodepegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Karyawan[ kodepegawai=" + kodepegawai + " ]";
    }
    
}
