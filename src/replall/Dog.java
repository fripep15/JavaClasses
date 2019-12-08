package replall;

public class Dog {

	public String DogBreed;
	public	String dogName;
	double dogWeight;
		
	Dog(String dogName,String DogBreed){
		this.dogName=dogName;
		
		this.DogBreed=DogBreed;
		}

	
       Dog(String dogName, double dogWeight, String DogBreed){
    	   this.dogName=dogName;
   		this.dogWeight=dogWeight;
   		this.DogBreed=DogBreed;
	}
	
	public void print () {
		System.out.println(this.dogName+" " +this.DogBreed+ " "+ dogWeight);
	}
	
public static void main(String[] args) {
	
Dog test=new Dog("Tarzan",50 , "Mutt");
Dog test1=new Dog("Tarzan", 50, "Mutt");

test.print();
test1.print();
	
}
	
	
	/*
	 1. Complete the Dog.java class:

Create following class variables. 
dogName
dogWeight   
static dogBreed=Mutt;
For all methods and variables use proper naming convention. 


Write two constructors:
* The main constructor(include all the variables as parameter)
* A secondary constructor that takes in only Name and Weight 
2. Create a display method to print the values of class variable in Dog class. 

2. In Main class Create a Dog object using both Constructors.and they call display method with each object 

Output:
1.The main constructor(with all parameters) 
Expected console output: 
Tarzan Mutt 50.0

2.secondary constructor that takes in only Name and Weight (Breed defaults to "Mutt")
Expected console output
Tarzan Mutt 50.0 
	 
	 */
}


