package com.myassignments;

public class Assignment2 {

	public static void main(String[] args) {
		// swap two numbers without using temp variable
		
		int no1=35,no2=56;
		
		System.out.println("Numbers before swap " + "no1: "  +no1 +"\t" +"no2: " +no2 );
		
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		System.out.println("Numbers after swap " + "no1: "  +no2 +"\t" +"no2: " +no2 );
   
	}

}
