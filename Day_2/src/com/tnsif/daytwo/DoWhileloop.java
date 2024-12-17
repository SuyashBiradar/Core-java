package com.tnsif.daytwo;

public class DoWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated met
		int i=1;
		do {
			System.out.println(i);
			i++;
		}
         while(i<=10);
		
		
		//break statemengt
		
		for (int j=1;j<=15;j++) {
			if (j==7) {
				break;
			}
			System.out.println(j);
		}
	
	
	//CONTINUE KEYWORD
	
	
	//int k;
	 
	for(int k=5; k<=15; k++) 
	{  
		if (k%2 != 0) 
		{
              continue;		
		}
	System.out.println(k);
	}
}
	

}
