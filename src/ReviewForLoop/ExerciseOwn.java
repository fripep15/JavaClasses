package ReviewForLoop;

import java.util.Scanner;

public class ExerciseOwn {

	public static void main(String[] args) {

Scanner scan;
 String mothername, fathername, gender;
 scan = new Scanner(System.in);
 
 System.out.println("please enter mother name");
 mothername=scan.nextLine();
 
 System.out.println("please enter father name");
 fathername=scan.nextLine();
 
 System.out.println("Please enter gender");
 gender=scan.nextLine();
 
 String babyname;
 
 if (gender.equalsIgnoreCase("boy")) {
	 babyname= fathername.substring(0, fathername.length()/2)+mothername.substring(mothername.length()/2);
	 
   }else if (gender.equalsIgnoreCase("girl")){
	 
	 babyname= mothername.substring(0, mothername.length()/2)+fathername.substring(fathername.length()/2);
	 
	} else {
		
		babyname= "no suggestion";
 
 
	}
 System.out.println(babyname);
	}
	
	/*
	 *   write a program to get the following details and give the out put as bellow:
	 *   
	 *   give 
	 */
	
	
	
	
	

}
