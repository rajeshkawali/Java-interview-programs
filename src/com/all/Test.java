package com.all;
public class Test {
	public static void main(String[] args) {

		int size=5;
		for (int i = 0; i <= size; i++) {
			for (int j = i; j <= size; j++) {
				//if(j>=i)
					System.out.print("*");
					//System.out.print(j);
					//System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n----------------------");
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= i; j++) {
				//if(j>=i)
					System.out.print("*");
					//System.out.print(j);
					//System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n----------------------");
		for (int i = 1; i <= size; i++) {
			for (int j = size; j>=0; j--) {
				if(j<=i)
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n----------------------");
		int num=5;
		while(num!=0){
			System.out.println(num);
			num--;
		}
		System.out.println("\n----------------------");
		int num1=5;
		do{
			System.out.println(num1);
			num1--;
		}while(num1>0);
	}

}
