package com.myassignments;

public class Assignment3 {

	public static void main(String[] args) {
		// three numbers swap with temp variable
		
		int temp,num1=100,num2=200,num3=300;
		
		System.out.println("Numbers before swaping  "+"num1: " +num1 + "\t"+"num2 : " +num2 + "\t" +" num3: "+ num3);
		temp=num1;
		num1=num2;
		num2=num3;
		num3=temp;
		System.out.println("Numbers before swaping  "+"num1: " +num1 + "\t"+"num2 : " +num2 + "\t" +" num3: "+ num3);

	}

}
