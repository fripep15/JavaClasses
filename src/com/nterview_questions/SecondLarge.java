package com.nterview_questions;

public class SecondLarge {

	public static void main(String[] args) {
		//Second Largest number
		
int [] num= {5 ,20, 30, 50, 60, 70,778};
		
		int smallest=num[0];
		
		for (int i=0;i>num.length; i++) {
			if (num[i]>smallest) {
				
				smallest =num[i];
				
			}
			
		}
		
		System.out.println(smallest);
		
		
	}
	

	}

}
