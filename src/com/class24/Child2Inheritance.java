package com.class24;

public class Child2Inheritance extends Parent {

	
	public void art() {
		System.out.println(" I am child 2 of my parents with Art Skills");
		
	}
	
	public static void main(String[] args) {
		
		Child2Inheritance child2=new Child2Inheritance();
		
		child2.race="Asian";
		child2.haircolor="Brwon";
		child2.art();
				
		

	}

}
