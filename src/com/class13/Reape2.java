package com.class13;

public class Reape2 {

	public static void main(String[] args) {
	
		String str1= "Hello";
         String str2= "Hello"; 
        
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equalsIgnoreCase(str2));// equalsIgnorecase will not take notice of lower/upper case. 
        //this is important in some cases while getting inputs from users. for example, enter username (lower or uper or 
        //both will be acceptable.
        
        // == is comparing the objects not the value, the reference variable, 
        //  to comare the object use .equal, 
        System.out.println(str1==str2);
        String str3=new String("Bye");
        String str4=new String("Bye");
        
        // here bot str3 and str3 has same value but they have two different refereces. in term of ==, its not equal, b/c the value is save 
        // in two differnet location, but if we write it as below, then ==, is true
        // String str3=new String("Bye");
        // str3=str4;
                
        System.out.println("==============");
        
        System.out.println(str3.equals(str4));//true
        System.out.println(str3==str4);
        System.out.println("==============");
        System.out.println(str1.contains("zz"));
        
        System.out.println("=======StartsWith and EndsWith=======");
        String str5="Today is Saturday";
        System.out.println(str5.startsWith("Today"));
        System.out.println(str5.endsWith("day"));
        
        System.out.println("=======Concat=======");
        System.out.println(str5.concat("and we have java class"));
        
        
        System.out.println( "=======trime=======");
        		
        String str6="    It is sunny    ";
        System.out.println("Before triming: " +str6);
        System.out.println(str6.trim());
        
        System.out.println("=======Index OF and CharAt=======");
        String str7=  "Tomorrow we will be done with String Manipulation" ;
        
        System.out.println(str7.indexOf('e'));
        
        System.out.println(" =======  index  'e' , 11 ======");
        
        // index of e after e on 11 ( the answer is 18 ( e on index 18)
        System.out.println(str7.indexOf('e', 11));
        System.out.println(str7.indexOf("we"));
        
        System.out.println(str7.charAt(10));
        
        
        
        
	}   
    }