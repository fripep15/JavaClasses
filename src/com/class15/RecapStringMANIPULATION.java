package com.class15;

import java.util.Scanner;

public class RecapStringMANIPULATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LET ASK USE TO ENTER BROWSER
		//BASED ON THE INPUT WE SAY " YOUR SELECTED BROWSER IS ...."
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		
		String browser=scan.nextLine();
		
		switch (browser.toLowerCase()) {// change input to lower case , to match our case:
		case "firefox":
			System.out.println("Execuation be performed on " + browser);
			break;
			
		case "chrome":
			System.out.println("Execuation be performed on " + browser);
			break;
			
		case "ie":
			System.out.println("Execuation be performed on " + browser);
			break;
			
			default:
				System.out.println("Please enter valid browser");
		}
		
		
		
	}

}
