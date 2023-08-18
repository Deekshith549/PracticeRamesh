package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRelatedMethods {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList <String>();
		a.add("ramesh");
		a.add("vmds");
		a.add("java");
		a.add("selenium");
		
		//method1
		/* for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		} */
		
		//method2
		/* for(String val:a) 
		{
		 System.out.println(val);	
		} */
		
		//mrthod3
		//item is present in ArrayList
		
		//System.out.println(a.contains(a)); 
		System.out.println(a.contains("selenium"));
		String[] name = {"ramesh", "vmds", "selenium"};
		List<String>nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium");

	}

}
