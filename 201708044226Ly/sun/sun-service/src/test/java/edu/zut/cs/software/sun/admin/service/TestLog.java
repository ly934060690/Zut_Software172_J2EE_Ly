package edu.zut.cs.software.sun.admin.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLog {
	public static void main(String[] args) {
		ApplicationContext acx = new ClassPathXmlApplicationContext("bean.xml");
		UserManager userManager = (UserManager) acx.getBean("CGLIBProxyFactoryBean");//由代理工厂生成代理对象
		userManager.sayHello("world");
	}

}
