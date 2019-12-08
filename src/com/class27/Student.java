package com.class27;

public class Student {

	public void result() {
		System.out.println("The result will declare on Jan 01");

	}
	public static final void control() {
		System.out.println("I am final method, no override allowed");

}
}

class SyntaxStudent extends Student {

	public void result() {
		System.out.println("Students will see the result on Jan 02");
	}
	
	//public static final void control() {  // final canot be override, its final, 
		
//	}
	public static final void control(int number) {// final ethod can be over load but not override, 
		System.out.println("I am final method, no override allowed");
}
}


class CollegeStudent extends Student {

	public  void result() {
		System.out.println(" College students has no concerns with Syntax Result on January 01");
	}

	public void collegeRsult() {

		System.out.println("College results will declare in June ");

	}
	
	
	}



		
	

