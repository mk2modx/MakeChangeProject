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
		kb.close();
		if (totalCost > tendered) {
			System.out.println("You don't have enough money.");

		} // if else for error and breaking after error
		else {

			fullChange = tendered - totalCost;
			fullChange = fullChange + 0.0005; // to satisfy roundup

			System.out.print("Total Change :$");
			System.out.printf("%.2f%n", fullChange);
			// show total with only 2 digits for pennies

			// multiplied by 100 to separate pennies
			double change1 = fullChange * 100;
			double dollar = (change1 - (change1 % 100));

			// used passed by value to continue using the remainder amounts
			int twentyDollar = bills(dollar);
			System.out.println(twentyDollar + " : Twenties");
			int tenDollar = tenbills(dollar, twentyDollar);
			System.out.println(tenDollar + " : Tens");
			int fiveDollar = fivebills(dollar, twentyDollar, tenDollar);
			System.out.println(fiveDollar + " : Fives");
			int oneDollar = oneBill(dollar);
			System.out.println(oneDollar + " : Ones");

			// casted to double to (int) for the remaining coins
			int coins = (int) (change1 - dollar);
			int quarters = (coins - (coins % 25)) / 25;
			// subtracted remainder then divided value / similar calculation for the rest
			System.out.println(quarters + " : Quarters");
			int coins2 = (coins - (quarters * 25));
			int dimes = (coins2 - (coins2 % 10)) / 10;
			System.out.println(dimes + " : Dimes");
			int coins3 = (coins2 - (dimes * 10));
			int nickles = (coins3 - (coins % 5)) / 5;
			System.out.println(nickles + " : Nickles");
			System.out.println((coins3 - (nickles * 5)) + " : Pennies");
		}
	}

	public static int bills(double dollar) {
		int twenty = (int) dollar / 100;
		twenty = (twenty - (twenty % 20)) / 20;
		return twenty;
	}

	public static int tenbills(double dollar, int twentyDollar) {
		int ten = (int) (dollar / 100) - (twentyDollar * 20);
		ten = (ten - (ten % 10)) / 10;
		return ten;
	}

	public static int fivebills(double dollar, int twentyDollar, int tenDollar) {
		int five = (int) (dollar / 100) - ((twentyDollar * 20) + (tenDollar * 10));
		five = (five - (five % 5)) / 5;
		return five;
	}

	public static int oneBill(double dollar) {
		int one = (int) (dollar / 100);
		one = one % 5;
		return one;
	}
}
