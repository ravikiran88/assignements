package org.jnit.collections;

public class Customers implements Comparable<Customers> {
	
	public Customers(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	private String name;
	private String city;
	private int age;
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Customers o) {
		return this.getCity().compareTo(o.getCity());
	}
	
	
	
	
	
	
	
	
	
}
