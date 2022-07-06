package com.springcore.javaconfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")   this is only needed when we use @Component. not needed w @Bean
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp","con"})  // by default name of bean returned will be getStudent.. but you can give any name to bean using "name"
	public Student getStudent(){    // this method will return object of Student class. method name can be anything
		// creating a new student object 
		Student student = new Student(getSamosa());   //injecting Samosa dependency into Student.. we can do this by autowiring also.
		return student;
	}

}

// this java config file is usin 