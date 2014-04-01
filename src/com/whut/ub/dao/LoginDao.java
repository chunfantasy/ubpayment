package com.whut.ub.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.whut.ub.model.AccountFile;

public class LoginDao {
	Configuration cfg = new AnnotationConfiguration();
	SessionFactory sf = cfg.configure().buildSessionFactory();
	Session session = sf.openSession();

	public LoginDao() {
		session.beginTransaction();
	}

	public boolean check(String account) {
		Query q = session.createQuery("from AccountFile");
		if (q.list().isEmpty())
			return false;
		else
			return true;
	}

	public String getPassword(String account) {
		String password = null;
		Query q = session.createQuery("from AccountFile");
		for (Object o : q.list()) {
			password = ((AccountFile) o).getPassword();
		}
		return password;
	}
}
