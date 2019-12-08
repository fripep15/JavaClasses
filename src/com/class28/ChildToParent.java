package com.class28;

public class ChildToParent extends Parent {
		
		String name="Jash";
		public void callName() {
		 System.out.println(name);
		 System.out.println(super.name);
		 System.out.println(lastName);
		}
		
		public void callingMethod() {
			callName();
			
		}
		public static void main(String[] args) {
			
			ChildToParent obj=new ChildToParent();
			
		obj.callName();
		

		}
	}
		