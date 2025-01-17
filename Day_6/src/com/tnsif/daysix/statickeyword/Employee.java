package com.tnsif.daysix.statickeyword;

public class Employee {
	private String name;
	private int id;
	
    static String CompanyName = "TNS";
    
    Employee(String name ,int id){
    	this.name=name;
    	this.id=id;
    	
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "  " + "companyname =" +CompanyName +" ]";
	}
    

}
