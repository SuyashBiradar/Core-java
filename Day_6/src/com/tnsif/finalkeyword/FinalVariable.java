package com.tnsif.finalkeyword;

public class FinalVariable {

	
	final int x = 100 ; // must be initialised at time of declration
	
	final static int y;
	
	final static int z=10;
	// instance method 

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y ="+ y + "]";
	}
	
	static {
		y=20;
//		z=100;
//		y=50;
	}
	
//	void change() {
//		x=30;
//		y=200;
//	}
	
	
}
