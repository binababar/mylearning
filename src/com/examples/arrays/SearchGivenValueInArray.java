package com.examples.arrays;

import java.util.Scanner;

public class SearchGivenValueInArray {

	private static void searchValue(int x, int[] arr) {

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				System.out.println(" Found given value at " + arr[i]);
				flag = true;
			}

		}

		if (flag == false) {
			System.out.println("value not found");

		}
	}

	public static void main(String[] args) {
		int[] arr = { 45, 4, 43, 22, 66, 3, 8 };
		System.out.println("Enter the value");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		searchValue(x, arr);

	}

}
