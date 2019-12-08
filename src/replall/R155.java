package replall;

public class R155 {
	
	private void method() {
		System.out.println("private m1 method");
	}
	private void method(int a) {
		System.out.println("private m1 method with int parameter");
	}
	
	public static void main(String[] args) {
		
		
		R155 print =new R155();
		print.method();
		
		print.method(2);
	}
}
