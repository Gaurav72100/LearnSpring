package com.model;

public class Address {

	private int streetno;
	private String city , state;
	
	
	public Address() {};
	
	public Address(int streetno, String city, String state) {
		super();
		this.streetno = streetno;
		this.city = city;
		this.state = state;
	}
	
	public int getStreet() {
		return streetno;
	}
	public void setStreet(int streetno) {
		this.streetno=streetno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [streetno=" + streetno + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
