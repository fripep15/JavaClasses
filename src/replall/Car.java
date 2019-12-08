package replall;

public class Car {
	
	  
	  String make;
	 String model;
	  int numberOfDoors;
	  int topSpeed;
	  double price;
	  
	  Car (String make, String model, int numberOfDoors,int topSpeed,double price){
	  
	  this.make=make;
	  this.model=model;
	  this.numberOfDoors=numberOfDoors;
	  this.topSpeed=topSpeed;
	  this.price=price;
	  }
	  Car (String make, String model, int topSpeed,double price){
		  
		  this.make=make;
		  this.model=model;
		  this.topSpeed=topSpeed;
		  this.price=price;
		  }
	  Car ( int numberOfDoors,int topSpeed,double price){
		  
		  
		  this.numberOfDoors=numberOfDoors;
		  this.topSpeed=topSpeed;
		  this.price=price;
		  }
	  Car (String make, String model, int numberOfDoors){
		  
		  this.make=make;
		  this.model=model;
		  this.numberOfDoors=numberOfDoors;
		  
		  }
	  public void print() {
		  
		  System.out.println(make+ " " + model+ " " + numberOfDoors+" "+ topSpeed+ " " +price);
	  }
			public static void main(String[] args) {
		  
	  
				Car test=new Car("Toyota", " Prius", 4,120,30000);
				Car test1=new Car( 4,120,30000);
				Car test2=new Car("Toyota", " Prius", 4,90,00000);
				
				
				test.print();
				test1.print();
				test2.print();
				
				
}
	  }
 
