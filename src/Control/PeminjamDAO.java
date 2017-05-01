package Control;


import Model.Peminjam;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 * @author 1573001, 1573004
 *         Nucky, Adiel
 */
public class PeminjamDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    public PeminjamDAO()
    {
        sess = this.membukaSession();
    }
    
    public Session membukaSession()
    {
        return session.openSession();
    }
    
    public List<Peminjam> getAllPeminjam()
    {
        Criteria c = sess.createCriteria(Peminjam.class).addOrder(Order.asc("nomoridentitas"));
        List<Peminjam> data = c.list();
        return data;
    }
    
    public String getNamaPeminjamByID(int id) {
        return sess.createQuery("SELECT s.namalengkap FROM peminjam s WHERE s.nomoridentitas = '" + id + "'").list().iterator().next().toString();
    }
    
    public void simpanAtauUpdatePeminjam(Peminjam m)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(m);
        t.commit();
    }
    
    public void hapusPeminjamBerdasarkanId(String nrp)
    {
        Transaction t = sess.beginTransaction();
        Peminjam s = this.ambilPeminjamBerdasarkanId(nrp);
        sess.delete(s);
        t.commit();
    }
    
    public Peminjam ambilPeminjamBerdasarkanId(String nrp)
    {
        return  (Peminjam) sess.load(Peminjam.class, nrp);
    }
}
