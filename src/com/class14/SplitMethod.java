package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str="An array, in the context of Java, is a dynamically-created object "
				+ "that serves as a of values of the ."
				+ " .";
		
		String [] array=(str.split(" "));
		
		for (int i=0; i<array.length; i++) {
	System.out.println(array[i]);
	}
		System.out.println("   *******      ********      *********");
		
		// How can we find how many setences are in the following string;
		
		String str1= "Today is Sunday. Its sunny day. And we are having java class";
		System.out.println();
		String [] array2=str1.split("\\.");
		System.out.println("The number of sentences in the given string is :: " +array2.length); // give number of sentences
		
		System.out.println("   *******      ********      *********");
		System.out.println();
		for (String string:array2) {
		System.out.println(string);

}
}
}
