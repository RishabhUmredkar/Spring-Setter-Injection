package com.springCore.SetterInjection;

public class Employee {

	int id; 
	String name; 
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void display()
	{
		System.out.println(id+"  "+name+"  "+city);
	}
}
