package com.nterview_questions;

import java.util.Scanner;

public class PalidndromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	Write a Java Program to find whether a String is palindrome or not?
		        Scanner scan=new Scanner(System.in);
		        
		        String a,b="";
		        
		        System.out.println("Enter the string you want to check");
		        
		        a=scan.nextLine();
		        int n=a.length();
		        
		        for(int i=n-1;i>=0;i--) {
		            b=b+a.charAt(i);  // stores all the chracters of a
		        }
		        if(a.equalsIgnoreCase(b)) {
		            System.out.println("The string is palindrome.");
		        }else {
		            System.out.println("The String is not palindrome");
		        }
	}

}
