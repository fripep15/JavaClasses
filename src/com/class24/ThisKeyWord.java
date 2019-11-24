package com.class24;

public class ThisKeyWord {
	
	 int a, b;
	    
	    public ThisKeyWord(int a, int b) {
	        this.a=a;
	        this.b=b;
	    }
	    public ThisKeyWord() {
	        System.out.println("I am non argument constructor");
	    }
	    public void sum(int a, int b) {
	        System.out.println("The sum of local parameters is "+(a+b));
	        System.out.println("The sum of instance variables is "+(this.a+this.b));
	    }
	    public static void main(String[] args) {
	        
	    	ThisKeyWord obj=new ThisKeyWord(5, 10);
	        obj.sum(10, 20);
	        
	        ThisKeyWord obj1=new ThisKeyWord(20, 20);
	        obj1.sum(100, 200);
	    }
	}

