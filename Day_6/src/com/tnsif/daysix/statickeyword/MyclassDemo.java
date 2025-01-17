package com.tnsif.daysix.statickeyword;

public class MyclassDemo {
	
public static void main(String[] args) {
		
		Myclass o1 = new Myclass();
		System.out.println(o1);
		
		Myclass.display(); // static method
		
		Myclass o2 = new Myclass();
		System.out.println(o2);
		Myclass.display();

	}

}
