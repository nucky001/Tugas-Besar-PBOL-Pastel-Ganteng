package Control;

import Model.Peminjamdanpengembalian;
import java.util.ArrayList;
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
public class PeminjamanPengembalianDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    List<Peminjamdanpengembalian> ods = new ArrayList<>();
    public PeminjamanPengembalianDAO()
    {
        sess = this.membukaSession();
    }
    public Session membukaSession()
    {
        return session.openSession();
    }
    public List<Peminjamdanpengembalian> getAllPP()
    {
        Criteria c = sess.createCriteria(Peminjamdanpengembalian.class).addOrder(Order.asc("kodepeminjaman"));
        List<Peminjamdanpengembalian> data = c.list();
        return data;
    }
    public String getPPByID(int id) {
        return sess.createQuery("SELECT s.status FROM peminjamdanpengembalian s WHERE s.kodepeminjaman = '" + id + "'").list().iterator().next().toString();
    }
    
    public void simpanAtauUpdatepp(Peminjamdanpengembalian m)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(m);
        t.commit();
    }
    
    public void hapusPPBerdasarkanId(int id)
    {
        Transaction t = sess.beginTransaction();
        Peminjamdanpengembalian s = (Peminjamdanpengembalian) this.ambilPPBerdasarkanId(id);
        sess.delete(s);
        t.commit();
    }
    
    public Peminjamdanpengembalian ambilPPBerdasarkanId(int id)
    {
        return (Peminjamdanpengembalian) sess.load(Peminjamdanpengembalian.class, id);
    }
}
