package com.programs.numaric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numaric4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number :");
		int number = Integer.parseInt(rd.readLine());

		for(int i=1;i<=number;i++){
			for(int j=1;j<=number;j++){
				if(i<=j){
				System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
