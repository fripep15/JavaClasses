package com.class11;

public class ForEachLoopTask1 {

	public static void main(String[] args) {

		// TASK 1
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		// TASK2
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		// TASK3
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country. (use 2 different loops).

		// TASK1
		String[] array = new String[6];

		String[] carsList = { "Suzuki", "Toyota", "Mercedez", "GMC", "BMW", "Honda" };

		for (String element : carsList) {
			System.out.println(element);
		}

		// TASK2
		int[] num = { 2, 4, 6 };
		int sum = 0;
		for (int n : num) {
			sum += n;
		}
		System.out.println(sum);
	

	// TASK3

	String[] country= {"Germany", "USA", "Canada", "Turkey"};
	
	for(String c:country){
		switch (c) {
		case "Germany":
			System.out.println("Berlin");
			break;
		case "USA":
			System.out.println("Washington DC");
			break;
		case "Canada":
			System.out.println("Ottowa");
			break;
		case "Turkey":
			System.out.println("Ankara");
			break;
		}
	}

	// second way
String[] countries= {"Germany", "USA", "Canada", "Turkey"};
	
	//for(String getCountry:countries){
	//	if(getCountry) {
	//		if (getCountry.equals("USA")) {
	//			System.out.println(" The capital of USA is Washngton DC");
				
		//	}
		
		
		//}
	}
	}

