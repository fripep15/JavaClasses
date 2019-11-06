package com.class14;

public class StringMethodRecap {

	public static void main(String[] args) {
		
		// .replace
		
		String str="your Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		
	System.out.println("***********************  Str.replace, target*******");	
	
	System.out.println(str.replace("your", "my"));

System.out.println(" *********** Replace all %%%%%%%%%%%%%%");

String str2= "What is String in java. Generally, String is a sequence of characters. But in Java, "
		+ "string is an object that represents a sequence"
		+ " of characters. The java.lang.String class is used to create a string object. ";

System.out.println(str2.replaceAll("String", "Bakwas"));
System.out.println(str2.replaceAll("sequence(.*)", " "));

// .*  remove every thing after sequence..

String str3="wr3j;323j***^^^^4k3j4lk3jl4kj444kdjflkjd;klfjsdkljlk";
System.out.println(str3.replaceAll("[0-9A-Za-z]", " "));
// reove all digits, elphabits......

// if you want dont remove these then type ^, see "[^0-9A-Za-z]"

System.out.println(str3.replaceAll("[^0-9A-Za-z]", "Junaid"));// if want to remove, no replace then then " ";

System.out.println("**************** Replace First *************************");
System.out.println();

System.out.println(str2.replaceFirst(" ", ""));
// remove first space, not other changes 

System.out.println("******************************************************************");
// reomve all other , keep alphabit and numbers "//w", 
System.out.println(str3.replaceAll("\\w", " "));

	}

}
