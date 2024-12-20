package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	int id ,salary;
	String name,gender;
	private List<Integer>list;
	private Set<Integer>sets;
	private Map<Integer,String> map;
	public Employee() {
		super();
		
	}
	public Employee(int id, int salary, String name, String gender,List<Integer>list ,Set<Integer>sets,Map<Integer,String> map) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.gender = gender;
		this.list=list;
		this.sets=sets;
		this.map=map;
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
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public Set<Integer> getSets() {
		return sets;
	}
	public void setSets(Set<Integer> sets) {
		this.sets = sets;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", gender=" + gender + ", list=" + list
				+ ", sets=" + sets + ", map=" + map + "]";
	}
	
	
	
	
}
