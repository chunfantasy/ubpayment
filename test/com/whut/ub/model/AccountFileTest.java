package com.whut.ub.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class AccountFileTest {
	@Test
	public void test() {
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		AccountFile af = new AccountFile();
//		 清空所有记录
		Query q = session.createQuery("from AccountFile");
		for (Object o : q.list()) {
			session.delete((AccountFile) o);
		}
		for (int i = 0; i <= 2; i++) {
			af.setAccount("0000000000");
			af.setPassword("1");
			af.setBalance(20000);
			af.setBank_certificate("中国联合银行");
			af.setName("中国联合银行");
			af.setCredit_buyer(0);
			af.setCredit_seller(0);
			af.setAccount_certificate("000000000");
			session.save(af);
			session.flush();
			session.clear();
		}

		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
