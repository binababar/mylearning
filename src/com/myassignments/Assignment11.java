package com.myassignments;

public class Assignment11 {

	public static void main(String[] args) {
		// Calculate Himas net salary
		
		
		double basicSalary=85000;
		
		double ta=basicSalary*15/100;
		
		double da=basicSalary*20/100;
		
		double hra=basicSalary*18/100;
		
		double pf=basicSalary*20/100;
		
		double tax=basicSalary*25/100;
		
		double grossSalary=basicSalary+ta+da+hra;
		
		double netSalary=grossSalary-(pf+tax);
		
		System.out.println("Himas gross salary is : " +grossSalary);
		
		System.out.println("Himas net salary is : "+netSalary);

	}

}
