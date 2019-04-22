package com.zcw.hibernate.hello;


import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void test() {
		//1.创建一个SessionFactory对象
		SessionFactory sessionFactory = null;
		//1)创建Configuration对象 ：对应hibernate的基本配置信息和对象关系映射信息
		
		Configuration configuration = new Configuration().configure();
		//2)创建ServiceRegistry对象,hibernate的任何配置和服务都需要在该对象中注册才能有效
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

		
//		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		sessionFactory = new Configuration().configure().buildSessionFactory();
		//2.创建一个Session对象
		Session session = sessionFactory.openSession();
		
		//3.开启事务
		Transaction transaction = session.beginTransaction();
		//4.执行保存操作
		News news = new News("Java12345", "zcw", new Date(new java.util.Date().getTime()));
		session.save(news);		
		//5.提交事务
		transaction.commit();
		//6.关闭Session
		session.close();
		//7.关闭SessionFactory对象
		sessionFactory.close();
	}

}
