package com.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee)ioc.getBean("epms");
		System.out.println(e);
		
		Employee e2 = (Employee)ioc.getBean("emps2");
		System.out.println("Successfully"+e2);

	}

}
