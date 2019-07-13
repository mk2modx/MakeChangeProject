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
		
		System.out.printf("%.2f%n", fullChange);
		
		double change1 = fullChange * 100;
		double dollar = (change1 - (change1 % 100));
		System.out.println(dollar / 100 + " : Dollars");
		
		int coins = (int)(change1 - dollar);
		System.out.println(coins);

		coins = coins - (coins % 25);
		int quarters = coins / 25;
		System.out.println(quarters + " : Quarters");
		
		System.out.println(coins);
		
	}

}
