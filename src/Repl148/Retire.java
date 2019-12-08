package Repl148;

public class Retire extends Person {

	String seniorActivity;
	
	
	Retire(String name1, String lastName1, int age1, String seniorActivity1){
		
		name=name1;
		lastName=lastName1;
		age=age1;
		seniorActivity=seniorActivity1;
		
		System.out.println(name+ " "+ lastName+ " "+age+ " "+seniorActivity);
		
	}
}
