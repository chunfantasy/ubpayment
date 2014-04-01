package com.whut.ub.dao;

import org.hibernate.Query;

import com.whut.ub.model.TransactionState;

public class TransactionStateDao extends MyDaoSupport {

	TransactionState ts = new TransactionState();

	public void dobuyer_pay(String number, String time) {
		Query q = session.createQuery("from TransactionState where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			ts = (TransactionState) o;
			ts.setTime_buyer_pay(time);
			update(ts);
		}
	}

	public void doseller_deliver(String number, String time) {
		Query q = session.createQuery("from TransactionState where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			ts = (TransactionState) o;
			ts.setTime_seller_deliver(time);
			update(ts);
		}
	}

	public void dobuyer_receive(String number, String time) {
		Query q = session.createQuery("from TransactionState where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			ts = (TransactionState) o;
			ts.setTime_buyer_receive(time);
			update(ts);
		}
	}
}
