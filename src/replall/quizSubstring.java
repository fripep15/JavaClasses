package replall;

public class quizSubstring {

	public static void main(String[] args) {
		String str= "Watan is my contry and KABUL is its Capital";
		String str1="Syntax Technologies and Java CALCULATIONS";
		String str2="Watan is my contry and KABUL is its Capital";


		System.out.println(str.toLowerCase());
		
		System.out.println("****** to Upper case  *********");
		System.out.println(str.toUpperCase());
		
		System.out.println("********* charAt***********************");
	System.out.println();
		System.out.println(str.charAt(6));

		System.out.println("******************* Char Replace with  **************************");
	
		System.out.println(str.replace('i', 'p'));
		System.out.println("********************   Replace with*****************");
		
		System.out.println(str.toLowerCase().replace('k', 'z'));
		
		System.out.println("************   replace word********************");
		
		System.out.println(str.replaceAll("KABUL", "ShaToot"));
		
		System.out.println("********* equalIgnore case**********");
		
		// compare two string, is this sub set for str2............
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		
		}
	}