package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Samosa samosa1 = (Samosa) context.getBean("samosa");
//		System.out.println(samosa1);

		// registering shut down hook and this hook is available in AbstarctAppContext
		// interface.
		context.registerShutdownHook(); // this hook calls destroy method on bean

		System.out.println("+++++++++++++++++++++++++++++++");

//		Pepsi p1 = (Pepsi) context.getBean("pepsi");
//		System.out.println(p1);
		
		ExampleAnnotation ex = (ExampleAnnotation) context.getBean("annot");
		System.out.println(ex);
		
	}
}
