package com.model;

public class Employee {

	int id ,salary;
	String name,gender;
	Address address;
	
	
	
	
	
	public Employee() {
		super();
		
	}
	public Employee(int id, int salary, String name, String gender, Address address) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.gender = gender;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Address getAddress() {
		System.out.println("setter called");
		return address;
	}
	public void setAddress(Address address) {
		
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", gender=" + gender+", address="+address + "]";
	}
	
	
	
}
