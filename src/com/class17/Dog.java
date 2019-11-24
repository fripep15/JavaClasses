package com.class17;

public class Dog {
	

	
	/*
	  Create a Dog Class and create 3 different objects of it:
	 *  Husky, Bulldog, Labrador  
	 * with specific attributes and behaviours.
	 */

	String color, race, country;
	int weight, height, run;
	boolean bark, eat, hunt;
	
	void barking() {
		System.out.println(" The dog "+ race + "Barks  with heavey sound at night");
		
	}
		void hunting() {
			
			System.out.println("Is my dog hunts?"+ hunt);
		}

			void running() {
				System.out.println(race + " runs fast.");
				
			}
			void barkig() {
				System.out.println(" My dog "+ race + bark);
			}
			
			public static void main(String [] args ) {
				
				Dog dog1=new Dog();
				dog1.color="Brown";
				dog1.race="Bull";
				dog1.country="Netherlands";
				dog1.weight=55;
				dog1.height=14;
				dog1.run=55;
				boolean barking=true;
				boolean eat=true;
				boolean dog1hunt=true;
				
				dog1.hunting();
				
						dog1.running();
						
						dog1.barkig();
			}
		
	
}

