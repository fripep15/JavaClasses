package com.class13;

public class ReplaceStringMethod {

	public static void main(String[] args) {
		// replace
		// this method returns a new string resulting, rpelacing 
		
		String str="Hello dear, how are you?";
		
		System.out.println(str);
		
		System.out.println(str.replace('e', 'b'));
		
		// replace one cahracter with other, all occurances. 
		
		
		
		//2. 
		
		System.out.println(str.replace("dear", "are"));
		
		// 3. replace first
		
		System.out.println(str.replaceFirst("dear", "Mr."));
		
		//4. Replace all
		
		//.out.println(str.replaceAll(regex, replacement));
		
		// on class regular expression
	}
	

}
