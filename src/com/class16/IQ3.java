package com.class16;

public class IQ3 {

	public static void main(String[] args) {
		// how many alpha characters in string
		
		String str = "Hello 30989()*()*000";
		
		str=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		
	}

}
