package com.class15;

import ReviewNov6.Substring1;

public class InterviewQuestion1 {

	public static void main(String[] args) {


		/*
         * Write a program to swap 2numbers with out a temporary variable? Swap 2
         * Strings without a temporary variable?
         */
        
            int a = 10;
            int b = 20;
            a = a + b;// 30
            b = a - b;// 30=20
            a = a - b;// 30=20
            System.out.println("The value of a =" + a); 
            System.out.println("The value of b =" + b);
            
            // swipe value of 2 strings 
            String str1="Hello";
            String str2="Bye";
            
            // logic is similar as above example
            System.out.println("  ________________________  Question 2");
            
            str1=str1+str2; // HelloBye
            str2=str1.substring(0, 5); // get from 0 to 5 Hello
            str1=str1.substring(5);
            
            str1=str1+str2;
            str2=str1.substring(0, str1.length() -str2.length());
          //  str2=str1.substring()
            System.out.println("the value of str1="+ str1);
            System.out.println("the value of str2=" +str2);
            
            
            
	}

}
