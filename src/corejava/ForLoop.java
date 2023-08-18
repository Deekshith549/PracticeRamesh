package corejava;

public class ForLoop {

	public static void main(String[] args) {
		       //Appraoch1
				int[] arr=new int[5];
				arr[0]=1;
				arr[1]=2;
				arr[2]=4;
				arr[3]=5;
				arr[4]=6;
				
				//for loop
				/*for(int i=0; i<arr.length; i++) 
				{
					System.out.println(arr[i]);
				} */
				
				//Appraoch2
				/* int[] arr2= {1,2,4,5,6,55,78,96,122,485};
				
				for(int i=0; i<arr2.length; i++) {
				
				System.out.println(arr2[i]);	
				} */
				
				String[] names= {"ramesh", "vmd", "vmds"};
				for(int i=0; i<names.length; i++)
				{
					System.out.println(names[i]);
				}

	}

}
