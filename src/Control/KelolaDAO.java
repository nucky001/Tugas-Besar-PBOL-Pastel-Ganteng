package Control;

import Model.Kelolaresiko;
import Model.Mobil;
import View.KelolaResikoView;
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
public class KelolaDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    public KelolaDAO()
    {
        sess = this.membukaSession();
    }
    
    public Session membukaSession()
    {
        return session.openSession();
    }
    
    public List<Kelolaresiko> getAllKelola()
    {
        Criteria c = sess.createCriteria(Kelolaresiko.class).addOrder(Order.asc("kodeasuransi"));
        List<Kelolaresiko> data = c.list();
        return data;
        
    }
    
    public String getKelolaNomorByID(int id) {
        return sess.createQuery("SELECT s.namaasuransi FROM kelolaresiko s WHERE s.kodeasuransi = '" + id + "'").list().iterator().next().toString();
    }
    
    public void simpanAtauUpdateMobil(Kelolaresiko m)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(m);
        t.commit();
    }
    
    public void hapusKelolaResikoBerdasarkanId(String id)
    {
        Transaction t = sess.beginTransaction();
        Kelolaresiko s = this.ambilKelolaResikoBerdasarkanId(id);
        sess.delete(s);
        t.commit();
    }
    
    public Kelolaresiko ambilKelolaResikoBerdasarkanId(String id)
    {
        return  (Kelolaresiko) sess.load(KelolaResikoView.class, id);
        
    }
}
