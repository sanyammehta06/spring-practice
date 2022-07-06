package com.springcore.javaconfig2;

import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;   // dependency
	public void study() {
		this.samosa.display();
		System.out.println("Student is studying");
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

}
