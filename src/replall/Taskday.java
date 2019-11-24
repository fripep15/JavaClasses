package replall;

public class Taskday {
	
	/*
	 
	 Write a program that will have a constructor: one with parameters and second without any parameters.
	  Create a separate Test class where you will execute both of the constructors.


Write a java program of Class Students that takes students name and 3 subject grades. 
Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.

	 */
Taskday(){
	
}

Taskday(String name, String nation, String degree, int age){
	
}
	public static String test;
	
	public String name;
	public String nation;
	public String degree;
	public int age;
	
	public void display() {
		System.out.println(" My teacher is "+ name + " and her age is "+ age);
	}
		
	
	public static void main (String [] args ) {
		
		Taskday teacher=new Taskday();
		
		teacher.name="Asel";
		teacher.nation="Tajik";
		teacher.degree="Masters";
		teacher.age=33;
		
		teacher.display();
		
		
		
		
		
		
		
		
	}
	
	
}
