package com.class16;

public class IQ8_FebonachiNumbers {

	public static void main(String[] args) {
		 int a, b, c;
	        a = 0;
	        b = 1;
	        for (int i = 0; i < 10; i++) {
	        	
	        	// 10 means the first 10 fibonacci number, its not less then 10
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	}

	


