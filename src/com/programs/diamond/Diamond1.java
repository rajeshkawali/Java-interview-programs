package com.programs.diamond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size :");
		int size = Integer.parseInt(rd.readLine());
		int oddNo=1;
		int noOfSpaces=size/2;
		for(int i=1;i<=size;i++){
			for (int j = noOfSpaces; j >=1; j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=oddNo;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<size/2+1){
					oddNo=oddNo+2;
					noOfSpaces=noOfSpaces-1;
			}else{
					oddNo=oddNo-2;
					noOfSpaces=noOfSpaces+1;
			}
		}
	}
}
