package com.tnsif.daysix.statickeyword;

public class Myclass {
	private int section;
	private static int srNo;
	
	static
	{
		System.out.println("-----------Staic block data-------------------");
		srNo= 1000;
		
	}
	
	public void data()
	{
		System.out.println("---------- Non Static Method----------");
	}
	
	
	Myclass(){
		System.out.println("--------Default Constructor-------------------");
		srNo++;
		section++;
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
	static void display()
	{
		System.out.println("Serial No "+ srNo);
	}
	

}
