package codeTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.*;
import java.util.stream.Collectors;


public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = {1, 1, 2, 2, 3, 4, 4, 5};
		
		String[] str = {"apple","orange","mango"};
		
		//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		
	    System.out.println(isPalindrom("malayalam")); 
       
		
	}
	
	public static boolean isPalindrom(String str)
	{
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	

}


