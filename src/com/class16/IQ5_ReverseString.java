package com.class16;

public class IQ5_ReverseString {

	public static void main(String[] args) {
		// write a jave program to reserve string?
		//revrse   a string word by word
		
	//	String [] given= "Welcome to the Java class";
		
		/*
		 * to revrse string
		 * split ()
		 * step1   split   array of string
		 * step 2   use for loop and use decrement to print valuses
		 */
		
//		String [] str= given.split("\\s");
//		
//		for (int j=str.length-1; j>=0; j--) {
//		
//		System.out.println(str);
		
		// second method
//		
//		String reversed="";
//		String [] str=given.split("");
//		for (int j=str.length-1; j>=0; j--) {
//		}
//		System.out.println();
		
		// write a jave program to reverse string?
		
		//toCharArray() ; charAt();
		
		String given1="Today is Java Class";
		char[] charArray=given1.toCharArray();
		for (int i=charArray.length-1; i>=0; i--) {
			
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("++++++++++++++++++++ using CharAt +++++++++++++++++++");
		// second method ( CharAt method)
		
		String word3="I Love Jave";
		for (int i=word3.length()-1; i>=0; i--) {
			
			System.out.print(word3.charAt(i));
		}
	}
	}

