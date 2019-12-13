import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;


public class HibernateUtils {
	private static final Configuration cfg = new Configuration().configure();
	private static final SessionFactory sf = cfg.buildSessionFactory();


	public static <T> T get(Class c, Serializable id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Object o = session.get(c, id);
		tr.commit();
		session.close();
		return (T) o;
	}

	public static List query(String hql) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery(hql);
		List i = query.list();
		tr.commit();
		session.close();
		return i;
	}

	public static List queryBySql(String sql) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createSQLQuery(sql);
//		session.
		List i = query.list();
		tr.commit();
		session.close();
		return i;
	}

	public static Serializable save(Object o) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Serializable i = session.save(o);
		tr.commit();
		session.close();
		return i;
	}

	public static void saveOrUpdate(Object o) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(o);
		tr.commit();
		session.close();
	}
}
