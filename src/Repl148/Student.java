package Repl148;

public class Student extends Person {

	int grade, age;
	
	 String name, lastName;
	 
	
	
	Student(String name1,String lastName1,int age1,int grade1 ){
		
		
		name=name1;
		lastName=lastName1;
		grade=grade1;
		age=age1;
		
		System.out.println(name+ " "+ lastName+ " "+age+ " "+grade);
	}
	 
		
	
	
	
//	public static void main(String[] args) {
//		Student obj1=new Student("Joe", "Smith", 33);
//		
//	}
}