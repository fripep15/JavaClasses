package replall;

public class Repl_114 {
	
/*
 
 For you to do 
Step1: Create method with 2 Parameters as int 
Step2: Write the logic in that method in println statement to print hours : with minutes 
Step3: Call the method

Output: MUST BE!!!
11:30
 */

	
	int hour,minutes;
	
	void clock(int hour, int minutes) {
	System.out.println(hour+":"+ minutes);
		
	}
	public static void main(String [] args) {
		
		Repl_114 hour=new Repl_114();
		
		hour.clock(11, 30);
	}
	
}
