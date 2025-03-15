package codeTesting;

import java.util.Scanner;

public class SystemIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pass("apple","orange","peach","banana");
		

	}
	
	public static void pass(String...a)
	{
		for(String x : a)
		{
			System.out.println(x);
		}
	}

}
