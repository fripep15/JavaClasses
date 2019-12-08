package replall;

public class R154 {
	
	public void method1(String str) {
		System.out.println(str);
	}
	
	public void method2(String str,String str1) {
		System.out.println(str +" "+ str1);
		
	}
	
	public static void main(String[] args) {
		
		R154 print=new R154();
		print.method1("main Syntax");
		print.method2("main Syntax " , "Solutions");
	}

}
