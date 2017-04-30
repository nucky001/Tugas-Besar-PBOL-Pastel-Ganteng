package Control;

import View.PeminjamanPengembalian;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ASUS
 */
public class PeminjamanPengembalianDAO {
    static SessionFactory session = HibernateUtil.getSessionFactory();
    private Session sess;
    
    List<PeminjamanPengembalian> ods = new ArrayList<>();
    public PeminjamanPengembalianDAO()
    {
        sess = this.membukaSession();
    }
    public Session membukaSession()
    {
        return session.openSession();
    }
    public PeminjamanPengembalian ambilDetailBerdasarkanId(int id)
    {
        return  (PeminjamanPengembalian) sess.load(PeminjamanPengembalian.class, id);
    }
    public List<PeminjamanPengembalian> getAllPeminjaman()
    {
        Criteria c = sess.createCriteria(PeminjamanPengembalian.class);
        List<PeminjamanPengembalian> data = c.list();
        return data;
    }
    public List<PeminjamanPengembalian> getAllPeminjamanDetail()
    {
        Criteria c = sess.createCriteria(PeminjamanPengembalian.class);
        List<PeminjamanPengembalian> data = c.list();
        return data;
    }
    public List<PeminjamanPengembalian> getALLPembelian() {
        return ods;
    }
    public void deleteData(int index) {
        ods.remove(index);
    }
    public void deleteAllData(){
        ods.removeAll(ods);
    }
    
    public void simpanAtauUpdateDetail(PeminjamanPengembalian p)
    {
        Transaction t = sess.beginTransaction();
        sess.saveOrUpdate(p);
        t.commit();
    }
}
