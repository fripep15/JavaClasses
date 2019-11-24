package com.class17;

public class Object0CarClass {
	
	public static void main(String [] args) {
		
		// to creat an object syntax is
		// ClassName variable=new ClassName()
		// Scanner scan=new Scanner(System.in);
		// String str=new String();
		
		Car car1=new Car();
		
		
	car1.make="Tesla";
	car1.model="S";
	car1.color="Black";
	car1.color="Black";
	car1.year=2020;
	car1.wheel=4;
	car1.window=5;
	car1.speed=200;
	
	// accessing behavior
	car1.drive();
	car1.start();
	car1.accelarate();
	Car car2=new Car();
	
	car2.make="BMW";
	car2.model="i8";
	car2.color="purple";
	car2.year=2019;
	car2.wheel=4;
	car2.window=6;
	car2.speed=300;
		// accessing behavior
	
	car2.drive();
	car2.start();
	car2.accelarate();
	
	
	// print features of the car
	// I have black tesla
	System.out.println("I have "+ car1.color+ " "+car1.make);
		// I drive BMW speed 300
	
	System.out.println("I drive"+ " "+ car2.make +" with speed of "+ car2.speed);
	car2.drive ();
	}

}

