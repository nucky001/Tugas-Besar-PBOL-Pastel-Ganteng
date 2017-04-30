package Control;

import Model.Karyawan;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author ASUS
 */
public class PegawaiDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    public PegawaiDAO()
    {
        sess = this.membukaSession();
    }
    
    public Session membukaSession()
    {
        return session.openSession();
    }
    
    public List<Karyawan> getAllPegawai()
    {
        Criteria c = sess.createCriteria(Karyawan.class).addOrder(Order.asc("kodepegawai"));
        List<Karyawan> data = c.list();
        return data;
    }
    
    public String getNamaPegawaiByID(int id) {
        return sess.createQuery("SELECT s.namakaryawan FROM karyawan s WHERE s.kodepegawai = '" + id + "'").list().iterator().next().toString();
    }
    
    public void simpanAtauUpdatePegawai(Karyawan m)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(m);
        t.commit();
    }
    
    public void hapusPegawaiBerdasarkanId(String id)
    {
        Transaction t = sess.beginTransaction();
        Karyawan s = (Karyawan) this.ambilPegawaiBerdasarkanId(id);
        sess.delete(s);
        t.commit();
    }
    
    public Karyawan ambilPegawaiBerdasarkanId(String id)
    {
        return (Karyawan) sess.load(Karyawan.class, id);
    }
}
