package testcases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee(10, "sam"));
		elist.add(new Employee(123, "james"));
		elist.add(new Employee(99, "george"));
		elist.add(new Employee(50, "adam"));
		elist.add(new Employee(1, "xaviour"));
		
		
		System.out.println(elist.toString());
		
		Comparator<Employee> c = (a,b)-> a.getName().compareTo(b.getName());
		
		Collections.sort(elist,c);
		
		elist.forEach(System.out::println);

	}

}

class Employee
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public String toString()
	{
		return "id :"+this.id + " name : "+this.name; 
	}
}

class MyComparator implements Comparator<Employee>{



	@Override
	public int compare(Employee a, Employee b) {
		// TODO Auto-generated method stub
		
		
		//return a.getName().compareTo(b.getName());
		return b.getName().compareTo(a.getName());
	}
	
}


