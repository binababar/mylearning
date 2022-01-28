package com.examples.arrays;

public class FindDuplicateValues {
	
	private static void duplicate(int[] arr) {
		 
	 for(int i=0;i<arr.length-1;i++) {
		  for(int j=i+1;j<arr.length;j++)
		 if(arr[i]==arr[j]) {
			 
			 System.out.println("found dulpucate values : "+arr[i] +" At " +i +" th position ");
			 
		 }
		 
	 }
		
	}

	public static void main(String[] args) {

		int[] arr = { 16, 5, 8, 60, 55, 44, 5, 8 };

		duplicate(arr);
		/*
		 * System.out.print("Reverse of given array is : "); for (int i = arr.length -
		 * 1; i >= 0; i--) {
		 * 
		 * System.out.print(arr[i]+ ",");
		 * 
		 * }
		 */

	}

	

}
