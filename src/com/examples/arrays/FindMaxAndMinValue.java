package com.examples.arrays;

public class FindMaxAndMinValue {

	static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}

		}
		return max;
	}
	static int minValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i]<min) {
				min = arr[i];

			}

		}
		return min;
	}
	public static void main(String[] args) {

		int[] arr1 = { 16, 5, 8, 13, 55, 44, 2, 33 };
	
		int maxValue = maxValue(arr1);
		int minValue=minValue(arr1);

		System.out.println("Max value in  array is : " + maxValue);
		System.out.println("Min value in  array is : " + minValue);

	}

}
