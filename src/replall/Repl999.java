package replall;

import java.util.Scanner;

public class Repl999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		   
		     if(browser.equalsIgnoreCase("ChRoME")) {
			          System.out.println("Proceed with Chrome browser");
			      }else if (browser.equalsIgnoreCase("FireFox")) {
			          System.out.println("Proceed with Firefox browser");
			      }else if(browser.equalsIgnoreCase("IE")) {
			          System.out.println("Proceed with IE browser");
			      }else  {
			           System.err.println("Invalid browser");
			      }
			  }
			}
	


