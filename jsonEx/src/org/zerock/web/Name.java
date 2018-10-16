package org.zerock.web;

public class Name {
	
	private String name;
	private int age;
	private String ad;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Name [name=" + name + ", age=" + age + "]";
	}
	public Name(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
