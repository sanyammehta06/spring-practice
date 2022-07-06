package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void hey() {
		System.out.println("inside init method: hey!");
	}

	public void bye() {
		System.out.println("inside destroy method: bye!");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

}
