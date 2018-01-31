package com.mxd.utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {
	static SessionFactory sessionFactory;
	static{
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = configure.buildSessionFactory();
	}
	
	public static Session findSession(){
		//return sessionFactory.openSession();
		return sessionFactory.getCurrentSession();
	}
}
