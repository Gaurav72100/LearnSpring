package com.model;

public class Address {

	private int streetno;
	private String city, state,country;
	
	Address(){};
	
	
	public Address(int streetno, String city, String state, String country) {
		super();
		this.streetno = streetno;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public int getStreetno() {
		return streetno;
	}


	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [streetno=" + streetno + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
