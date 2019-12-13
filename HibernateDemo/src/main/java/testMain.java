import dao.Usr;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/27 22:05
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */

public class testMain {
	private static final Logger logger = LogManager.getLogger(testMain.class);

	public void hibernateSour() {
//		加载配置
		Configuration configuration = new Configuration().configure();
//		创建sessionFaction
		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		得到会话
		Session session = sessionFactory.openSession();
//		开启事务
		Transaction transaction = session.beginTransaction();
//		写代码
		Usr usr = new Usr();
		usr.setName("老王");
		usr.setPhone("18772996760");
		usr.setSex(1);
		session.save(usr);
//		提交
		transaction.commit();
//		释放
		session.close();
		sessionFactory.close();
	}


	public static void main(String[] args) {
		List<Usr> l = HibernateUtils.query("from Usr where id=4b166891-f1b8-11e9-bfe9-00e05b680058");
		for (Usr u : l) {
			System.out.println(u.getId());
		}
	}
}
