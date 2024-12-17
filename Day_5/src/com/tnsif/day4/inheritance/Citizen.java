package com.tnsif.day4.inheritance;

public class Citizen {
	private String name;
	private String aadharNo ; // we can use Long aslo as datatype
	private String address;
	private String phone;
	
	public Citizen() {
		
		System.out.println("Citizen Object Created");
	}
	
	public Citizen(String name, String aadharNo ,String address ,String phone) {
		this.name =name;
		this.aadharNo = aadharNo;
		this.address=address;
		this.phone=phone;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
