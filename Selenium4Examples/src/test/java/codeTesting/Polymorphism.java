package codeTesting;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String retval = add();
		System.out.println("retval : "+retval);		

	}
	
	
	@SuppressWarnings("finally")
	public static String add()
	{
		try
		{
			//int x = 10/0;
			//return "return from try";
		}catch(Exception ex)
		{
			return "return from catch";
		}
		finally
		{
			System.out.println("before finally return");
			return "return from finally";
		}		
				
		//return "return from general";
	}

}
