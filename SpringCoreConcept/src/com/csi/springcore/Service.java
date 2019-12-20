package com.csi.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = (Employee) context.getBean("ee");
		//emp.setEmpName("JERRY");
		System.out.println(emp.getEmpName());
	}
}
