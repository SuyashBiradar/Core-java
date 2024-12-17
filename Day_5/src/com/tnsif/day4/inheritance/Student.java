package com.tnsif.day4.inheritance;

public class Student extends Citizen {
	private static String aadharNo;
	private int RollNo;
	private String collegeName;
	
	public Student(){
		super();
		
	}
	public Student(String name ,String addharNo,String address, String phone,int rollNo,String collegeName) 
	{
		super (name,aadharNo,address,phone);
		this.RollNo=RollNo;
		this.collegeName=collegeName;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
