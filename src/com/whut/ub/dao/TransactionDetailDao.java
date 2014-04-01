package com.whut.ub.dao;

import java.util.List;

import org.hibernate.Query;

import com.whut.ub.model.TransactionDetail;

public class TransactionDetailDao extends MyDaoSupport {

	TransactionDetail td = null;

	@SuppressWarnings("unchecked")
	public List<TransactionDetail> showlist_buyer(String account) {
		Query q = session
				.createQuery("from TransactionDetail where account_buyer = '"
						+ account + "'");
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public List<TransactionDetail> showlist_seller(String account) {
		Query q = session
				.createQuery("from TransactionDetail where account_seller = '"
						+ account + "'");
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public List<TransactionDetail> showlist(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		return q.list();
	}

	public TransactionDetail showdetail (int id){
		Query q = session.createQuery("from TransactionDetail where id = "
				+ id + "");
		return (TransactionDetail)q.list().get(0);
	}
	
	public void dodsp(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			td = (TransactionDetail) o;
			td.setState("dpd");
			update(td);
		}
	}

	public void dodpd(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			td = (TransactionDetail) o;
			td.setState("ddr");
			update(td);
		}
	}

	public void doddr(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			td = (TransactionDetail) o;
			td.setState("drg");
			update(td);
		}
	}
	
	public void docsd(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			td = (TransactionDetail) o;
			td.setState("cdr");
			update(td);
		}
	}
	
	public void docdr(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			td = (TransactionDetail) o;
			td.setState("crp");
			update(td);
		}
	}
	
	public void docrp(String number) {
		Query q = session.createQuery("from TransactionDetail where number = '"
				+ number + "'");
		for (Object o : q.list()) {
			td = (TransactionDetail) o;
			td.setState("cpg");
			update(td);
		}
	}
}
