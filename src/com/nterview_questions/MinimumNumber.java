package com.nterview_questions;

public class MinimumNumber {

	public static void main(String[] args) {
	int [] num= {5 ,20, 30, 50, 1 ,60, 70,};
		
		int smallest=num[0];
		
		for (int i=0;i>num.length; i++) {
			if (num[i]>smallest) {
				smallest =num[i];
				
			}
			
		}
		
		System.out.println(smallest);
		
		
	}
	
	

	}


