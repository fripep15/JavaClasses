package R149;

public class Main {
	
	
public final void display(boolean Y){
	
  System.out.println("Final method with boolean parameter"); 
}

public final String str="Final method with String parameter";
public final void display(String str){
	
System.out.println("Final method with String parameter");
}

public static void main(String[]args){
	
  Main obj=new Main();
  System.out.println(boolean true);
  Main obj1=new Main();
 obj1.display("str");
}
}