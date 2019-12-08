package replall;

public class R157 {


String str;
		public final void display(boolean Y){
			
		 System.out.println("Final method with boolean parameter");
		
		
		}
		public final void display(String str){
		
		  System.out.println("Final method with String parameter");
		
		}
		public static void main(String[] args) {
			
		
			R157 obj=new R157();
		  obj.display(true);
		  R157 obj1=new R157();
		 obj1.display("str");
}
}
