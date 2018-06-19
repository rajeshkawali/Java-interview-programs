package com.program.exception;

import java.util.Scanner;;


class AgeLessThanZero extends ArithmeticException {
	AgeLessThanZero() {
	}

	AgeLessThanZero(String msg) {
		super(msg);
	}
}

public class ExceptionCustom {

	public static void main(String[] args)  {

		//BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int str = sc.nextInt();
		
		//String str = bread.readLine();
		//int str =bread.read();
		if (str <= 0){
			//throw new AgeLessThanZero();
			throw new AgeLessThanZero("Age should be greater than zero");
		}
	}

}
