package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	List<String> phoneNums;

	public Person(String name, int personId, Certi certi, List<String> phoneNums) {

		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.phoneNums = phoneNums;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId+"{"+this.certi.name+"} and his ph nums are : "+this.phoneNums;
	}

}
