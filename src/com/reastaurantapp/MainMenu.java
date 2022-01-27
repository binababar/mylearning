package com.reastaurantapp;

import java.util.Scanner;

public class MainMenu{
	
	static void bill() {
		System.out.println("Biryani Total Bill :   "+ BiryaniMenu.biryaniTolal);
		System.out.println("Drinks Total Bill :    "+ DrinksMenu.drinksTolal);
		System.out.println("Ice-cream Total Bill : "+ IcecreamMenu.icecreamTolal);
		int totalBill=BiryaniMenu.biryaniTolal+DrinksMenu.drinksTolal+IcecreamMenu.icecreamTolal;
		System.out.println("Total Bill : 		   "+ totalBill);
	}

	
	@SuppressWarnings("resource")
	public static void main(String[] args ) {
	
		
		while(true) {
	
		System.out.println(	"*****************************"	);
		System.out.println(	"        FOOD MENU            "	);
		System.out.println(	"*****************************"	);
		
		System.out.println( "       1.BIRYANI             " );
		System.out.println( "       2.DRINKS             " );
		System.out.println( "       3.ICECREAM             " );
		System.out.println( "       4.Bill             " );
		System.out.println( "       5.EXIT            " );
		System.out.println("--------------------------------");
		//c( "\n I.  Veg Biryani " + " \n II. Chicken Biryani \n III. Mutton Biryani");
	
		System.out.println( "Enter your choice " );
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		
		case 1:BiryaniMenu biryani=new BiryaniMenu();
				biryani.biryaniMenu();
				break;
		case 2:	DrinksMenu	drinks=new DrinksMenu();
				drinks.drinksMenu();
		case 3:IcecreamMenu icecream=new IcecreamMenu();
				icecream.icecreamMenu();
				break;
		case 4:bill();
		case 5:System.exit(0);	
		
		}
		}

		
	}
}
