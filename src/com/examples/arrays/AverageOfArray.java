package com.examples.arrays;

public class AverageOfArray {

	static double arrayAvg(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		double avg = sum / arr.length;
		return avg;
	}

	public static void main(String[] args) {

		int[] arr = { 16, 5, 8, 13, 55, 44, 2, 33 };
		// {4,4,4,4};

		double result = arrayAvg(arr);

		System.out.println("Average of given array is : " + result);

	}

}
