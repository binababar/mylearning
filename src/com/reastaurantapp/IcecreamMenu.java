package com.reastaurantapp;

import java.util.Scanner;

public class IcecreamMenu {

	Scanner sc = new Scanner(System.in);
	static int icecreamTolal = 0;
	int vanilaIcecreamPrice = 25;
	int chocolateIcecreamPrice=30;
	int mangoIcecreamPrice = 35;

	void vanilaIcecream() {
		System.out.println("Enter the number Vanila Ice-Cream");
		int vanilaIcecreamQuantity = sc.nextInt();
		int vanilaIcecreamTolal = vanilaIcecreamQuantity * vanilaIcecreamPrice;
		icecreamTolal += vanilaIcecreamTolal;

	}

	void chocolateIcecream() {	
		System.out.println("Enter the number Chocolate Ice-cream");
		int chocolateIcecreamQuantity = sc.nextInt();
		int chocolateIcecreamTolal = chocolateIcecreamQuantity * chocolateIcecreamPrice;
		icecreamTolal += chocolateIcecreamTolal;

	}
	
	void mangoIcecream() {
		System.out.println("Enter the number Mango Ice-cream");
		int vanilaIcecreamQuantity = sc.nextInt();
		int vanilaIcecreamTolal = vanilaIcecreamQuantity * vanilaIcecreamPrice;
		icecreamTolal += vanilaIcecreamTolal;
	}
 public void icecreamMenu() {
	 

	while(true)

	{
		System.out.println("****ICE-CREAM MENU****");
		System.out.println("1.Vanila");
		System.out.println("2.Chocolate");
		System.out.println("3.Mango");
		System.out.println("4.Back To Main Menu");

		System.out.println("Enter your ice-cream choice");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			vanilaIcecream();
			break;
		case 2:
			chocolateIcecream();
			break;
		case 3:
			mangoIcecream();
			break;
		case 4:
			MainMenu.main(null);
		default:
			System.out.println("Pls Enter right choice");
		}
		}

	}
}
