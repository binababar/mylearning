package com.myassignments;

public class Assignment6 {

	public static void main(String[] args) {
		// swap 3 numbers without using temp variables
		
		int num1=10,num2=20,num3=30,num4=40;
		
		System.out.println("Values before swap num1 : " +num1 +"\t"+"num2 : "+num2 
											+"\t"+"num3 : "+num3+"\t"+"num4 : "+num4);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		num3=num3+num4;
		num4=num3-num4;
		
		num3=num3-num4;System.out.println("Values before swap num1 : " +num1 +"\t"+"num2 : "+num2 
				+"\t"+"num3 : "+num3+"\t"+"num4 : "+num4);
		
		
	}

}
