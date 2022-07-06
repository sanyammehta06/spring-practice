package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoEmployee {
	@Autowired
	@Qualifier("temp1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("inside setter method");
		this.address = address;
	}
	
	public AutoEmployee(Address address) {
		super();
		System.out.println("inside constructor");
		this.address = address;
	}

	public AutoEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
