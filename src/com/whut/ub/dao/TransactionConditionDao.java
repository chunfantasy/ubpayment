package com.whut.ub.dao;

import org.hibernate.Query;

import com.whut.ub.model.TransactionCondition;

public class TransactionConditionDao extends MyDaoSupport {

	TransactionCondition tc = null;

	public TransactionConditionDao() {
		session.beginTransaction();
	}

	public void dobuyer_pay(String number) {
		Query q = session
				.createQuery("from TransactionCondition where number = '"
						+ number + "'");
		for (Object o : q.list()) {
			tc = (TransactionCondition) o;
			tc.setBuyer_pay(1);
			update(tc);
		}
	}

	public void doseller_deliver(String number) {
		Query q = session
				.createQuery("from TransactionCondition where number = '"
						+ number + "'");
		for (Object o : q.list()) {
			tc = (TransactionCondition) o;
			tc.setSeller_deliver(1);
			update(tc);
		}
	}

	public void dobuyer_receive(String number) {
		Query q = session
				.createQuery("from TransactionCondition where number = '"
						+ number + "'");
		for (Object o : q.list()) {
			tc = (TransactionCondition) o;
			tc.setBuyer_receive(1);
			update(tc);
		}
	}
}
