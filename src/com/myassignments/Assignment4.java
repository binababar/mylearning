package com.myassignments;

public class Assignment4 {

	public static void main(String[] args) {
		// swap three numbers without temp variable
		
		int num1=22,num2=33,num3=44;
		System.out.println("Numbers before swap are "+ "num1: "+num1+"\t" +"num2: "+num2 +"\t"+"num3: "+num3);
		num3=num1+num2;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		num3=num3-num2;
		System.out.println("Numbers before after are "+ "num1: "+num1 +"\t"+"num2: "+num2 +"\t"+"num3: "+num3);

	}

}
