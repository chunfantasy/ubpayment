package com.whut.ub.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TransactionDetailTest {
	@Test
	public void test() {
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		TransactionDetail td = new TransactionDetail();

		// 清空所有记录
		Query q1 = session.createQuery("from TransactionDetail");
		for (Object o : q1.list()) {
			session.delete((TransactionDetail) o);
		}
		Query q2 = session.createQuery("from TransactionState");
		for (Object o : q2.list()) {
			session.delete((TransactionState) o);
		}
		Query q3 = session.createQuery("from TransactionCondition");
		for (Object o : q3.list()) {
			session.delete((TransactionCondition) o);
		}
		for (int i = 0; i <= 9; i++) {
			td.setNumber("000000000" + i);
			td.setAccount_buyer("0000000006");
			td.setAccount_seller("0000000008");
			td.setAmount(10000);
			td.setCredit_buyer("0000000066");
			td.setCredit_seller("0000000088");
			td.setEvaluation_buyer(10);
			td.setEvaluation_seller(10);
			td.setId(1);
			td.setMode("directly");
			td.setNumber_order("888888888888");
			td.setState("dsp");
			td.setTime_start("2010-08-08");
			TransactionConditionTest tct = new TransactionConditionTest();
			TransactionCondition tc = new TransactionCondition();
			tc = tct.test(td.getNumber());
			TransactionStateTest tst = new TransactionStateTest();
			TransactionState ts = new TransactionState();
			ts = tst.test(td.getNumber());
			session.save(td);
			session.save(tc);
			session.save(ts);
			session.flush();
			session.clear();

		}

		for (int i = 10; i <= 19; i++) {
			td.setNumber("00000000" + i);
			td.setAccount_buyer("0000000006");
			td.setAccount_seller("0000000008");
			td.setAmount(10000);
			td.setCredit_buyer("0000000066");
			td.setCredit_seller("0000000088");
			td.setEvaluation_buyer(10);
			td.setEvaluation_seller(10);
			td.setId(1);
			td.setMode("credit");
			td.setNumber_order("888888888888");
			td.setState("csd");
			td.setTime_start("2010-08-08");
			TransactionConditionTest tct = new TransactionConditionTest();
			TransactionCondition tc = new TransactionCondition();
			tc = tct.test(td.getNumber());
			TransactionStateTest tst = new TransactionStateTest();
			TransactionState ts = new TransactionState();
			ts = tst.test(td.getNumber());
			session.save(td);
			session.save(tc);
			session.save(ts);
			session.flush();
			session.clear();

		}

		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
