package ReviewNov6;

import java.util.Scanner;

public class FridayExercise {

	public static void main(String[] args) {
		
		/*
		 * Declare int temperature and prompt user to input any value.
		 
Your program should check:
if is it sunny weather or not.
If the weather is sunny output should be �It is a sunny day, I should go somewhere!�
If it is not sunny output should be �I stay home and practice Java�
If the weather is sunny you want to check the temperature.
If the temperature is higher than 85 then �I am going to the beach�
otherwise, �I am going to the park�
		 */
		
		Scanner temp=new Scanner(System.in);
		System.out.println("Please tell me about weather, is it Sunny ?");
		boolean weather= temp.nextBoolean();
		
		
		if ( weather) {
			System.out.println("It is a sunny day, I should go somewhere!");
			
			System.out.println(" What is the temperature");
			int temp1=temp.nextInt();
			if (temp1>85) {
				System.out.println("I am going to the beach");
				
			}else {
				System.out.println(" I am going to the park");
			}
				
		}else {
			System.out.println(" I stay home and practice Java");
		}
			

	}

}
