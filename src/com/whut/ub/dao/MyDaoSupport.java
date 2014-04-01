package com.whut.ub.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MyDaoSupport {
	final Configuration cfg = new AnnotationConfiguration();
	final SessionFactory sf = cfg.configure().buildSessionFactory();
	final Session session = sf.openSession();

	public Session getSession() {
		return session;
	}

	public MyDaoSupport(){
		session.getTransaction().begin();
	}

	public void save(Object o) {
		session.save(o);
	}

	public void update(Object o) {
		session.update(o);
	}

	public void commit() {
		session.getTransaction().commit();
	}

	public void rollback() {
		session.getTransaction().rollback();
	}

	public void close() {
		session.close();
	}

}
