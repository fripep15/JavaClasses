package replall;

import java.util.Scanner;

public class Repl102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	      String[] arr = new String[5];
	      for (int i=0;i<5;i++)
	      {
	          arr[i] = input.nextLine();
	      }
	        for (int j=0; j<5;j++) {
	        	 System.out.println( arr[j].substring(0,3));
	        }
	       
	  }
}
