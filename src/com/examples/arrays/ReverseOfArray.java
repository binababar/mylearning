package com.examples.arrays;

public class ReverseOfArray {

	public static void main(String[] args) {

		int[] arr = { 16, 5, 8, 13, 55, 44, 2, 33 };

		System.out.print("Reverse of given array is : ");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i]+ ",");

		}

	}

}
