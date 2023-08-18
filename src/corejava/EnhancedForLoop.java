package corejava;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] names= {"ramesh", "vmd", "vmds"};
		
		//Appraoch1
		/* for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		} */
		
		////Appraoch2
		
		  for(String s:names)
		  {
			  System.out.println(s);
		  }
	}

}
