package com.class14;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 


		 */
		
		System.out.println("Create a String that will hold a sentence. Write a program to get a new String without any spaces.");
		System.out.println();
		
		String str="Create a String that will hold a sentence. Write a program to get a new String without any spaces.";
		System.out.println("*********************************");
		System.out.println(str.replace(" ", ""));
		
		// task 2
		
		System.out.println(" task2 ******* Create a String that should be combination of letters, numbers and special characters. "
				+ "Find out how many alpha characters are there in the String.");
		System.out.println(" split(a-z******************** ");
		String str4="djflkdjklfj334455;jkjkjlk";
		//System.out.println(str4.split(a-z));
		
		String str2=" You have a String a=�Is it saturday? Is it raining? Do we have a Java Class today?";
		
		System.out.println(str2.length());
		
		System.out.println();
		
		System.out.println(" Degree 3*******You have a String a=�Is it saturday? Is it raining? Do we have a Java Class today?� "
				+ "How would you find out how many sentences are in that String?");
		
		String str3="Is it saturday. Is it raining. Do we have a Java Class today.";
		
String [] array=str3.split("\\?");
System.out.println(array.length);
		
		for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
		
		
		}
		
	}
	}


