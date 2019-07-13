package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double totalCost, tendered, fullChange;
		
		System.out.println("Enter Total Cost : ");
		totalCost = kb.nextDouble();
		
		System.out.println("Enter Tendered Amount : ");
		tendered = kb.nextDouble();
		
		fullChange = tendered - totalCost;
		fullChange = fullChange + 0.0005;
		
		System.out.printf("%.2f%n", fullChange);
		
		double change1 = fullChange * 100;
		double dollar = (change1 - (change1 % 100));
			
			int twentyDollar = bills(dollar);
			System.out.println(twentyDollar);
			
		System.out.println(dollar / 100 + " : Dollars");
		
		int coins = (int)(change1 - dollar);

		int quarters = (coins - (coins % 25)) / 25 ;
		System.out.println(quarters + " : Quarters");
		
		int coins2 =  (coins - (quarters * 25 ));
		
		int dimes = (coins2 - (coins2 % 10)) / 10 ;
		System.out.println(dimes + " : Dimes");
		
		int coins3 = (coins2 - (dimes * 10));
		int nickles = (coins3 - (coins % 5)) / 5 ;
		
		System.out.println(nickles + " : Nickles");
		
		System.out.println((coins3 - (nickles * 5)) + " : Pennies");
		
		
	}

	public static int bills( double dollar) {
		int twenty = (int) dollar / 100;
		twenty = (twenty - (twenty % 20)) / 20;
			return twenty;	
}
	public static int tenbills( double dollar, int twentyDollar) {
	int ten = 0;
		
		return ten;
	}
}
