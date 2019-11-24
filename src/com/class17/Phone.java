package com.class17;

public class Phone {


//		Create a Class “Phone”. Create 3 Objects of it: iPhone, 
//		Android, Nokia with specific  attributes and behaviours.
//
//
//		Create a Dog Class and create 3 different objects of it: 
		//Husky, Bulldog, Labrador  with specific attributes and behaviours.

		
		
		String name, brand, made, color;
		int memory, screen, pixl;
		
	
		void talking() {
			
			System.out.println("I talk on my "+ name +" it is manafuctured in  " +made + " for hours");
		}
		
		void watchmovie() {
			
			System.out.println(" I watch funny movies on my "+ name);
			
		}
		

		public static void main (String [] args ) {	
			
			Phone phone1=new Phone();
			
			phone1.name="Android";
			phone1.brand="M200";
			phone1.made="Japan";
			phone1.memory=120;
			phone1.screen=8;
			phone1.pixl=14;
			
			System.out.println("I want to give you "+ phone1.name + " brand "+ phone1.brand+ " its Camera is "+ phone1.pixl );
			
			phone1.watchmovie();
			phone1.talking();
			
		Phone phone2=new Phone();
		phone2.name="Apple";
		phone2.brand="XR";
		phone2.made="tokyoe";
		phone2.memory=55;
		phone2.screen=15;
		phone2.pixl=18;
		
		
		phone2.talking();
		phone2.watchmovie();
		
		phone1.talking();
		}
	}


