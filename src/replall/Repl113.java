package replall;

public class Repl113 {
	
	/*
	 
	 Step 1:create a method "PrintTwice" that should take a String as a single parameter

Step 2:Write the logic for that method print two statements twice 

Step 3: call the method ONLY once within the main method and pass the String value as 
"Don't make me say this twice!"

Output:
Don't make me say this twice!
Don't make me say this twice!

	 */
	
	
	void PrintTwice() {
		for (int i=1; i<3; i++) {
			
			System.out.println("Don't make me say this twice!");
			
		}
	}
	
public static void main (String [] args) {
	
	Repl113 print=new Repl113();
	
	print.PrintTwice();
}
}
