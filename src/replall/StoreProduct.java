package replall;

public class StoreProduct {
	
	String label;
	  double price;
	  String category;
	  String produce;
	  boolean hasExpiration=false;
	  int stock;
	  
	  StoreProduct(String label,double price, String produce, boolean hasExpiration, int stock){
		  
		  this.label=label;
		  this.price=price;
		  this.category=category;
		  this.produce=produce;
		  this.hasExpiration=hasExpiration;
		  this.stock=stock;
		  
	  }
StoreProduct(String label,double price, String produce, int stock){
		  
		  this.label=label;
		  this.price=price;
		  this.produce=produce;
		  this.stock=stock;
		  
	  }
StoreProduct(String label,double price, String produce){
	  
	  this.label=label;
	  this.price=price;
	  this.produce=produce;
	 
	  
}

public void print() {
	
	
	System.out.println(label+" "+price+" "+ produce+" "+ hasExpiration+" "+stock);
}
	
public static void main(String [] args) {
	
	

StoreProduct test=new StoreProduct("Eggs",3.0,"Produce", true,10);
StoreProduct test1=new StoreProduct("Paper Towel", 2.0,misc,false, 24);
StoreProduct test2=new StoreProduct("Paper Towel", 2.0,null,false,0);

test.print();	
test1.print();
test2.print();

	  /*
	  Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0
	   
	 Step 1: Complete the StoreProduct.java class:

Create below class variables. (Choose proper datatype and naming convention for variable ) 
* label
* price 
* category
* hasExpiration 
* stock (represent the stock quantity)


Step 2: Write three constructors:

* The main constructor( with all parameters)
* Second constructor with all parameters except category and hasExpiration (category defaults to "misc", 
* hasExpiration defaults to false inside constructor)
* Third constructor all the parameters except category, expiration, and stock 
* (stock default to 0 inside the constructor)

Step 3: Method for display out put. 
in StoreProduct Class create a method to display the output of class variables. 
(Output sequence as as order of variable shown above. all in one line)

Step 4: in Main Class Create an object of StoreProduct Class with each constructors. 
pass the values and then call the display method. 

Step 5: Execute your application :)


Hint: each variable must be object specific
Output:
 

  
  
	   */
}
}
