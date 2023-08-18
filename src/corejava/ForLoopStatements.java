package corejava;

public class ForLoopStatements {

	public static void main(String[] args) {
		int[] arr2= {1,3,2,4,5,6,7,8,9,10,112,89};
		
		//check if array has multiple of 2
		//2,4,6,8,10,112
		
		for(int i=0; i<arr2.length; i++) 
		{
			if(arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
				//break;
			}
			else
			{
				System.out.println(arr2[i]+"is not multiple of 2");
			}
		}
	}

}
