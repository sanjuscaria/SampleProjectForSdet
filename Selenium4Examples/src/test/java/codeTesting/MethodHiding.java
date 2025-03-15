package codeTesting;

public class MethodHiding {
	
	public void testing()
	{
		
	}
	
	public static void main(String[] args)
	{
		
		Child p = new Child();
		p.age();
		
	}

}

 class Parent {
	
 static	void age()
	{
		System.out.println("parent's age");
	}
}

class Child extends Parent {
	
 static	void age()
	{
		System.out.println("child's age");
	}
}
