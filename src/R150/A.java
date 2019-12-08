package R150;

public class A {
	
	
		int a;
		 int b;
		int sum=(int a+int b);
		System.out.println( a+ b);
	
	
	}

}

class B extends A{
	public static void display() {
		System.out.println(20);
		
	}
}

class Main{
	

public static void main(String[] args) {
	B a=new B();
	a.display();
}
}