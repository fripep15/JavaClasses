package com.class16;

public class IQ4_PartofString {

	public static void main(String[] args) {
	// how to find part of string from a string
		//what is sbstring?
		//find numbers of word in string?
		
		String str="Today is very cold outside";
	String strsubString=str.substring(0, 5);
	System.out.println(strsubString);
	
	/* 
	 * step1 split based on the space----> arrray of string
	 * step 2---find the length of an array
	 * 
	 * split devided it by space" ", it means numbers of words separated by space
	 */
	
	String [] words= str.split("");
	System.out.println(words.length);
	
	};
	
	
	

}
