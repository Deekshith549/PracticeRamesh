package corejava;

public class Strings {

	public static void main(String[] args) {
	/* //2 types strings
		//1-string literal
		String s = "ramesh";
		String s1= "vmds";
		
		//2-new memory locaters
		
		String s = new String ("ramesh");
		String s1 = new String ("vmds");  */
		
		//Split- break string
		String s ="ramesh vmds java";
		/* String[] splittedString =s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]); */
		
	
		/*String[] splittedString =s.split("vmds");
		System.out.println(splittedString[0]);  
		System.out.println(splittedString[1]);//with white space o/p
		System.out.println(splittedString[1].trim()); // remove white space  */
		//print charecter by charecter
		/* for(int i=0; i<s.length();i++) */
	    for(int i=s.length()-1; i>=0;i--) // for reverse order
		{
			System.out.println(s.charAt(i));
		}
	}

}
