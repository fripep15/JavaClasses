package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
	
		
		// convert string to Array of char 
		
		String str="Syntax";
		str.toCharArray();
		System.out.println(str.toCharArray());
		
		char[] array=str.toCharArray();
		for (char i:array) {
		System.out.println(i);
		

	}
System.out.println(array);
}
}
