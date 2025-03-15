package codeTesting;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee() {
			public void getAge()
			{
				System.out.println("from ananymous class...");
			}
		};
		
		emp.getAge();
		
		FunctionalInter inter = (a)->{System.out.println(a);};

		inter.add("this is just from lambda");
		
	}

}

class Employee{
	
	public void getAge()
	{
		System.out.println("emplyoee class...");
	}
	
}

interface FunctionalInter
{
	public abstract void add(String a);
}