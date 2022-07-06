package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/streotype/stereoconfig.xml");
		Student student1 = (Student)context.getBean("student");
		System.out.println(student1);
		System.out.println("________________________________________");
		System.out.println(student1.getAddress());
		
		Student student2 = (Student)context.getBean("student");
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

	}

}
