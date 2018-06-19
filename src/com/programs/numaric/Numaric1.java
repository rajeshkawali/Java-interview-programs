package com.programs.numaric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numaric1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number :");
		int number = Integer.parseInt(rd.readLine());
		
		for(int i=1;i<=number;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
