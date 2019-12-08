package com.class5;

import java.util.Scanner;

class Main { public final void reverse(  ) {
	Scanner scan = new Scanner(System.in);
	 int a=scan.nextInt ();
	 int b=scan.nextInt();
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("a  value of "+a);
	System.out.println("b value of "+ b);
	}
	public static void main(String[] args) {
Main obj=new Main();
obj.reverse();
}
}