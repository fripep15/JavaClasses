package com.nterview_questions;

public class FibonachiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8.Write a Java Program to print first 10 numbers of Fibonacci series.
        int n = 10, t1 = 0, t2 = 1;
      
         System.out.print("First " + n + " terms: ");
        for (int m = 1; m <= n; ++m)
        {
            System.out.print(t1 + " , ");
            int sum = t1 + t2;
          
            t1 = t2;
            t2 = sum;
        }
   }
	}


