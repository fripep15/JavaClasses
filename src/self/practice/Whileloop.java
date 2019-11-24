package self.practice;

import java.util.Scanner;

public class Whileloop {

	

	public static void main(String[] args) {

// int a=0;
// 
// while (a<5) {
//	 
//	 System.out.println("Printing for test");
//	 a++;
//			 
// }
//System.out.println(" Your print ended");
//	
//int b=0;
//while (b<10) {
//	
//	System.out.println(b);
//	b+=2;
//}
//
////while(true) {
////	System.out.println("printing for infinity");
//}
//	
//	// ask to pay for cofee, if less than 5, ask to pay for coffee, and when 5 or above, say enjoy your coffee
	
	Scanner price=new Scanner(System.in);
	
	
	int coffee=5;
	
	while (coffee<=5) {
	
		System.out.println("Please pay for coffee");
	coffee=price.nextInt();
	coffee++;
	
	}
	System.out.println("your are done, enjoy your coreee");
	}
	
}

