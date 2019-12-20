package com.csi.colleacation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Applicationcontext.xml");
		BranchCollection bc=(BranchCollection) context.getBean("b");
		System.out.println(bc.getBranchList());
		System.out.println(bc.getBranchMap());
		System.out.println(bc.getBranchSet());
		System.out.println(bc.getProps());
	}

}
