package com.program.facadedesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print("Welcome to Franchise Service Registration...!\n");
			System.out.print(" 1. KFC \n");
			System.out.print(" 2. McDonalds \n");
			System.out.print(" 3. Dominos \n");
			System.out.print(" 4. EXIT \n");
			System.out.print("Please Enter your Franchise Option Number: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			FranchiseServiceReg sp = new FranchiseServiceReg();

			switch (choice) {
			case 1: {
				sp.BuyKFCFranchise();
			}
				break;
			case 2: {
				sp.BuyMcDonaldsFranchise();
			}
				break;
			case 3: {
				sp.BuyDominosFranchise();
			}
				break;
			default: {
				System.out.println("Please Check the input and try again");
			}
				return;
			}

		} while (choice != 4);
	}
}