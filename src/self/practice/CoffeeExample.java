package self.practice;

import java.util.Scanner;

public class CoffeeExample {

	public static void main(String[] args) {
		
		Scanner price=new Scanner (System.in);
		
		int coffee =0;
		
		while (coffee<5) {
			
			System.out.println("Pay more for coffee");
			
			coffee++;
			
			coffee=price.nextInt();
			
		}
		System.out.println("You paid, Enjoy your coffee");
		
	}}

// https://www.youtube.com/watch?v=6djggrlkHY8