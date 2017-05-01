package Model;

import java.io.Serializable;
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

/**
 * @author 1573001, 1573004
 *         Nucky, Adiel
 */
@Entity
@Table(name = "penggajian")
@NamedQueries({
    @NamedQuery(name = "Penggajian.findAll", query = "SELECT p FROM Penggajian p")})
public class Penggajian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kodepenggajian")
    private Integer kodepenggajian;
    @Basic(optional = false)
    @Column(name = "totalgaji")
    private String totalgaji;
    @JoinColumn(name = "kodepegawai", referencedColumnName = "kodepegawai")
    @OneToOne(optional = false)
    private Karyawan kodepegawai;

    public Penggajian() {
    }

    public Penggajian(Integer kodepenggajian) {
        this.kodepenggajian = kodepenggajian;
    }

    public Penggajian(Integer kodepenggajian, String totalgaji) {
        this.kodepenggajian = kodepenggajian;
        this.totalgaji = totalgaji;
    }

    public Integer getKodepenggajian() {
        return kodepenggajian;
    }

    public void setKodepenggajian(Integer kodepenggajian) {
        this.kodepenggajian = kodepenggajian;
    }

    public String getTotalgaji() {
        return totalgaji;
    }

    public void setTotalgaji(String totalgaji) {
        this.totalgaji = totalgaji;
    }

    public Karyawan getKodepegawai() {
        return kodepegawai;
    }

    public void setKodepegawai(Karyawan kodepegawai) {
        this.kodepegawai = kodepegawai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodepenggajian != null ? kodepenggajian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penggajian)) {
            return false;
        }
        Penggajian other = (Penggajian) object;
        if ((this.kodepenggajian == null && other.kodepenggajian != null) || (this.kodepenggajian != null && !this.kodepenggajian.equals(other.kodepenggajian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Penggajian[ kodepenggajian=" + kodepenggajian + " ]";
    }
    
}
