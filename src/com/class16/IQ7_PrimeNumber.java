package com.class16;

public class IQ7_PrimeNumber {

	public static void main(String[] args) {


		int num = 21;
        boolean isPrime = true;
        
        if (num<=1) {
            isPrime=false;
        }else {
            
        
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        }
        if (isPrime) {
            System.out.println(num + " is Prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}

	


