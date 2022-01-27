package com.reastaurantapp;

import java.util.Scanner;

public class DrinksMenu {

	Scanner sc = new Scanner(System.in);
	static int drinksTolal = 0;
	int teaPrice = 10;
	int hotChocolatePrice=25;
	int lassiPrice = 20;
	int milkShakePrice=20;

	void teaTotal() {
		System.out.println("Enter the Tea quantity");
		int teaQuantity = sc.nextInt();
		int teaTolal = teaQuantity * teaPrice ;
		drinksTolal += teaTolal;

	}

	void hotChocolateTotal() {	
		System.out.println("Enter the Hot-Chocolate Quantity");
		int hotChocolateQuantity = sc.nextInt();
		int hotChocolateTolal = hotChocolateQuantity *hotChocolatePrice;
		drinksTolal+= hotChocolateTolal;

	}
	
	void lassiTotal() {
		System.out.println("Enter the number Mango Ice-cream");
		int lassiQuantity = sc.nextInt();
		int lassiTolal = lassiQuantity * lassiPrice;
		drinksTolal+= lassiTolal;
	}
	void milkShakeTotal() {
		System.out.println("Enter the number Mango Ice-cream");
		int milkShakeQuantity = sc.nextInt();
		int milkShakeTolal = milkShakeQuantity * milkShakePrice;
		drinksTolal+= milkShakeTolal;
	}
 public void drinksMenu() {
	 

	while(true)

	{
		System.out.println("****DRINKS MENU****");
		System.out.println("1.Tea");
		System.out.println("2.HotChocolate");
		System.out.println("3.Lassi");
		System.out.println("4.Milkshake");
		System.out.println("5.Back To Main Menu");

		System.out.println("Enter your Drinks choice");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			teaTotal();
			break;
		case 2:
			hotChocolateTotal();
			break;
		case 3:
			lassiTotal();
			break;
		case 4:
			milkShakeTotal();
			break;
		case 5:
			MainMenu.main(null);
		default:
			System.out.println("Pls Enter right choice");
		}
		}

	}
}
