package com.reastaurantapp;

import java.util.Scanner;

public class BiryaniMenu {

	Scanner sc = new Scanner(System.in);
	static int biryaniTolal = 0;
	int chickenBiryaniPrice = 100;
	int vegBiryaniPrice = 80;

	void chickenBryani() {
		System.out.println("Enter the number chicken biryani plates");
		int chickenBryaniQuantity = sc.nextInt();
		int chickenBiryaniTolal = chickenBryaniQuantity * chickenBiryaniPrice;
		biryaniTolal += chickenBiryaniTolal;

	}

	void vegBryani() {	
		System.out.println("Enter the number veg biryani plates");
		int vegBryaniQuantity = sc.nextInt();
		int vegBiryaniTolal = vegBryaniQuantity * vegBiryaniPrice;
		biryaniTolal += vegBiryaniTolal;

	}
 public void biryaniMenu() {
	 

	while(true)

	{
		System.out.println("1.Chicken Biryani");
		System.out.println("2.Veg Biryani");
		System.out.println("3.Back To Main Menu");

		System.out.println("Enter your biryani choice");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			chickenBryani();
			break;
		case 2:
			vegBryani();
			break;
		case 3:
			MainMenu.main(null);
		default:
			System.out.println("Pls Enter right choice");
		}
		}

	}
}
