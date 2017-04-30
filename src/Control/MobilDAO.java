package Control;

import Model.Mobil;
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
public class MobilDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    public MobilDAO()
    {
        sess = this.membukaSession();
    }
    
    public Session membukaSession()
    {
        return session.openSession();
    }
    
    public List<Mobil> getAllMobil()
    {
        Criteria c = sess.createCriteria(Mobil.class).addOrder(Order.asc("kodemobil"));
        List<Mobil> data = c.list();
        return data;
    }
    
    public String getPlatNomorByID(int id) {
        return sess.createQuery("SELECT s.platnomor FROM mobil s WHERE s.kodemobil = '" + id + "'").list().iterator().next().toString();
    }
    
    public void simpanAtauUpdateMobil(Mobil m)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(m);
        t.commit();
    }
    
    public void hapusMobilBerdasarkanId(String id)
    {
        Transaction t = sess.beginTransaction();
        Mobil s = this.ambilMobilBerdasarkanId(id);
        sess.delete(s);
        t.commit();
    }
    
    public Mobil ambilMobilBerdasarkanId(String id)
    {
        return  (Mobil) sess.load(Mobil.class, id);
    }
}
