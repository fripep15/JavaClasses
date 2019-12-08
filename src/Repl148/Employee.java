package Repl148;

public class Employee extends Person{

	 int salary;
	 String name;
	 String lastName;
	int age;
	
	Employee(String name1,String lastName1,int age1,int salary1 ){
		
		salary=salary1;
		name=name1;
		lastName=lastName1;
		age=age1;
		System.out.println(name+ " "+ lastName+ " "+age + " "+salary);
	}
	 
//	public static void main(String[] args) {
	//	Employee obj1=new Employee("Joe", "Smith", 33,5555);	
	
	//Joe Smith 35 35000
}
