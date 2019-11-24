package com.class24;

public class Task {
	
	String name;
	int number;
	
	private Task() {
		System.out.println(" This is constructor for private task");
		
		
	}
	
	public Task(String youName) {
		System.out.println(" This is your public constructor ");
		name=youName;
		int number;
	}
	
	protected Task(int number) {
		
	}
	
	public void name () {
		System.out.println("name "+ name);
	}
	
	public static void main (String [] args ) {
	Task name1=new Task();
	name1.name();

	
	

}
}

//Task obj1= new Task();
