package com.class25;

public class PrivateMethod {
	
		
	private void result(String str) {
		
		System.out.println(str);
			
		}
		
	private void result(String str, String str2) {
			
			System.out.println(str+"  "+ str2);
			
		}

	private void result(String str, String str2, int number) {
		
		System.out.println(str+ " " +str2+ "  "+number);
		
		
	}
	public static void main(String[] args) {
		
		PrivateMethod obj=new PrivateMethod();
		
		obj.result("Junaid");
		obj.result("Khan", "Khan2");
		obj.result("Khan3", "Gul", 55);
		
	}

}
