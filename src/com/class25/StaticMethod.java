package com.class25;

import replall.Main;

public class StaticMethod {
	
	public static void result(String str) {
		
	System.out.println(str);
		
	}
	
public static void result(String str, String str2) {
		
		System.out.println(str+"  "+ str2);
		
	}

public static void result(String str, String str2, int number) {
	
	System.out.println(str+ " " +str2+ "  "+number);
	
	
}
public static void main(String[] args) {
	
	StaticMethod obj=new StaticMethod();
	obj.result("Junaid");
	obj.result("Junaid", "Dennis");
	obj.result("Junaid" , "Khan", 22);
	
}
}
