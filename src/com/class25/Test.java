package com.class25;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(" creating an object of a Employee class   ");
		Employee emp=new Employee();
		emp.salary=9000;
		Employee.companyName="Syntax";
emp.work();
emp.getPaid();

System.out.println(" creating an object of a Scrum team   ");

ScrumTeam sm=new ScrumTeam();
sm.salary=90000;
sm.work();
sm.getPaid();
	}

}
