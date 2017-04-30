package Control;

import Model.Peminjam;
import Model.Penggajian;
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
public class PenggajianDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    public PenggajianDAO()
    {
        sess = this.membukaSession();
    }
    
    public Session membukaSession()
    {
        return session.openSession();
    }
    
    public List<Penggajian> getAllPeminjam()
    {
        Criteria c = sess.createCriteria(Penggajian.class).addOrder(Order.asc("KodePenggajian"));
        List<Penggajian> data = c.list();
        return data;
    }
    
    public String getKodePegawaiByID(int id) {
        return sess.createQuery("SELECT s.KodePegawai FROM penggajian s WHERE s.KodePenggajian = '" + id + "'").list().iterator().next().toString();
    }
    
    public void simpanAtauUpdatePeminjam(Penggajian m)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(m);
        t.commit();
    }
    
    public void hapusPeminjamBerdasarkanId(String nrp)
    {
        Transaction t = sess.beginTransaction();
        Penggajian s = this.ambilPenggajianBerdasarkanId(nrp);
        sess.delete(s);
        t.commit();
    }
    
    public Penggajian ambilPenggajianBerdasarkanId(String nrp)
    {
        return  (Penggajian) sess.load(Penggajian.class, nrp);
    }
}
