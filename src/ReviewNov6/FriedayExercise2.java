package ReviewNov6;

import java.util.Scanner;

public class FriedayExercise2 {

	public static void main(String[] args) {

		/*
		 * Prompt user to input either �M� or �F� as a String �gender� and input any value as int �age�.
You have 2 conditions:
If age is above 25, your inner condition, depending on your gender value, should get either �Woman� or �Man� as an output.
If age is below 25, your inner condition, depending on your gender value, should get either �Girl� or �Boy� as an output.
		 */
		
		
		Scanner gender= new Scanner(System.in);
		System.out.println(" What is your gener, answer in M or F");
		String gender1=gender.nextLine();
		int age= gender.nextInt();
		
		
		if (age>25) {
			
		 if (gender1.equals("M")){
		System.out.println(" your a male");
		
			
		
		}else {
			System.out.println(" Your are women");
			
			
			}
			
		}else  {
			
		if (gender1.equals("M")) {
			System.out.println("Your are a boy");
			
			
		}else {
			
			System.out.println("Your are a girl");
			
		}
		}
	}
	

}
