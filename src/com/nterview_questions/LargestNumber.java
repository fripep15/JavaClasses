package com.nterview_questions;

public class LargestNumber {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int [] num= { 20, 30, 50, 60, 70,8};
		
		int largest=num[0];
		
		for (int i=0;i<num.length; i++) {
			if (num[i]>largest) {
				largest =num[i];
				
			}
			
		}
		
		System.out.println(largest);
		
		
	}
	
	

}
