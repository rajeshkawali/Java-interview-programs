package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	
	public static void main(String[] args) {
		System.out.println(main1());
	}
	public static String main1() {
		try {
			System.out.println(" try ");
			return "nitesh";
			
		}catch(Exception e) {
			System.out.println(" catch ");
			return "diebold";
		}finally {
			try {
				System.out.println(" try ");
				return "nitesh";
				
			}catch(Exception e) {
				System.out.println(" catch ");
				return "diebold";
			}finally {
				System.out.println(" finally ");
				return "Rajesh";
			}

		}
		
	}
}
