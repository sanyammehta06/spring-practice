package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotation {
	public String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public ExampleAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void start() {
		System.out.println("starting method : init");
	}

	@PreDestroy
	public void end() {
		System.out.println("ending method : destroy");
	}

	@Override
	public String toString() {
		return "ExampleAnnotation [subject=" + subject + "]";
	}

}
