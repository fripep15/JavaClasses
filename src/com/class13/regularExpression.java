package com.class13;

public class regularExpression {

	public static void main(String[] args) {
		
		// print only text, not numbers 
		
		String str= "jlkjlkjlkjlk4454dfd4f65d4f65d4";
		System.out.println(str.replaceAll("[0-9]", "" ));
		
		// replace all  alphabet and keep number
		
		System.out.println(str.replaceAll("[a-zA-Z]", "" ));
		
		
		// remove everything except text and numbers,
		
		System.out.println("++++++++++++++++++");
		String str2="djlfkkjklj;lj2324$#@@$;jk*";
		
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		
		//2. Replace old character with new 
		
		String str4="12-21-1990";
		System.out.println(str4.replace("-", "/"));
		
		
	}

}
