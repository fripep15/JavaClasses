package replall;

public class SyntaxTechnologies {
	
	String schoolName;
	  int batch;
	  String year;
	  String lastDayOfClass;
	  
	  SyntaxTechnologies(){
	    
	  }
	  
	  SyntaxTechnologies(String schoolName, int batch, String year, String lastDayOfClass ){
	    this.schoolName=schoolName;
	    this.batch=batch;
	    this.year=year;
	    this.lastDayOfClass=lastDayOfClass;
	    
	  }
	  
	  public void print(){
	    System.out.println(schoolName+ " "+ batch+ " "+year+ " "+lastDayOfClass);
	  }
	  
	  public static void main(String[] args) {
		  SyntaxTechnologies test=new SyntaxTechnologies();
		  SyntaxTechnologies test1=new SyntaxTechnologies("Syntax",4,"2019", "07/30/2019");
		 
		  test.print();
		  test1.print();
	    
	    
	  
	  }
}


