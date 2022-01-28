package com.examples.arrays;

public class ReverseOfArray2 {

	private static int[] reversed(int[] arr) {

		int[] arr2 = new int[arr.length];

		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			arr2[j++] = arr[i];

		}
		return arr2;
	 }

	public static void main(String[] args) {

		int[] arr1 = { 16, 5, 8, 13, 55, 44, 2, 33 };

		int[] arr2 = reversed(arr1);

		System.out.println("Reverse of given array is : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(+arr2[i] + " , ");
		}
	}

}
