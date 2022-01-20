package com.myassignments;

public class Assignment5 {

	public static void main(String[] args) {
		// swap 4 numbers with temporary variable
		
		int num1=18,num2=12,num3=6 ,num4=24;
		
		System.out.println("Values before swap num1 : " +num1 +"\t"+"num2 : "+num2 
				+"\t"+"num3 : "+num3+"\t"+"num4 : "+num4);
		
		int temp=num1;
			num1=num2;
			num2=num3;
			num3=num4;
			num4=temp;
			System.out.println("Values after swap num1 : " +num1 +"\t"+"num2 : "+num2 
					+"\t"+"num3 : "+num3+"\t"+"num4 : "+num4);	
		
		
	}

}
