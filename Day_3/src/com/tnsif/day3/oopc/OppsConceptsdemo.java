package com.tnsif.day3.oopc;

public class OppsConceptsdemo {
	private int SerialNum;
	private String name;
	private int Age;
	
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		this.SerialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	@Override
	public String toString() {
		return "OppsConceptsdemo [SerialNum=" + SerialNum + ", name=" + name + ", Age=" + Age + "]";
	}
	
	

}
