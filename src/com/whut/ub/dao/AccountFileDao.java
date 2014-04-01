package com.whut.ub.dao;

import java.util.List;

import org.hibernate.Query;

import com.whut.ub.model.AccountFile;

public class AccountFileDao extends MyDaoSupport{

	AccountFile af = null;

	@SuppressWarnings("unchecked")
	public List<AccountFile> showlist(String account) {
		Query q = session.createQuery("from AccountFile where account = '"
				+ account + "'");
		return q.list();
	}

	public boolean transfer(String account_credit, String account_debit, int amount) {
		Query q = session.createQuery("from AccountFile where account = '"
				+ account_credit + "'");
		af = (AccountFile) q.list().get(0);
		af.setBalance(af.getBalance() - amount);
		System.out.println(af.getBalance());
		if (af.getBalance() < 0)return false;
		update(af);
		
		q = session.createQuery("from AccountFile where account = '"
				+ account_debit + "'");
		af = (AccountFile) q.list().get(0);
		af.setBalance(af.getBalance() + amount);
		update(af);
		return true;
	}
	
}
