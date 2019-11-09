package com.class16;

public class IQ6_Palindrome {

	public static void main(String[] args) {
		// find the string is Palindrom ( both way ) same MoM, kayak, bob, etc
		
		/*
		 * Reverse the string, 
		 * compare two strings
		 * if strings are equal, then we can say they are palindrome, if not Not Palindrome
		 * 
		 */
		
		//Write a Java Program to find whether a String is palindrome or not?
        // if reverse string and original string are same---> string is plaindrome
        // mom, dad, madam, racecar, kayak, bob, level, refer
        // we can do through follwoing steps
        // step 1: reverse the string
        // step 2: compare 2 Stirngs
        // if strings are equal, they are plaindrom
        // else not palindrom
        
        String original="kayak";
        String reversed="";
        
        for (int i=original.length()-1; i>=0; i--) {
        
        reversed=reversed+original.charAt(i); /// ""+k=k+a=ka+k        
    }
System.out.println(reversed);
}
}
