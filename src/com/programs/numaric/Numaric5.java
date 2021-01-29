package com.programs.numaric;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Numaric5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size :");
		int size = Integer.parseInt(rd.readLine());
		int odd=1;
		int spaces=size;
		for (int i = 1; i <= size; i++) {
			for (int j = spaces; j >=1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=odd; j++) {
				System.out.print(i);
			}
			System.out.println();
			if(i<(size/2)+1){
				odd=odd+2;
				spaces=spaces-1;
			}else{
				odd=odd-2;
				spaces=spaces+1;
			}
		}
	}
}
/*

Enter the size :7
       1
      222
     33333
    4444444
     55555
      666
       7

 */
