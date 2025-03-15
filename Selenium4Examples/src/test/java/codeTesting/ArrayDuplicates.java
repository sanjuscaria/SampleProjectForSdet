package codeTesting;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1,2,2,3,4,4,5,6 };
		int[] temp = new int [a.length];
		int j = 0;
		for(int i = 0; i < a.length-1; i++)
		{
			if( a[i] != a[i+1]) {
				a[j] = a[i];
				j++;
			}
		}
		
		a[j] = a[a.length-1];
		
		for(int k=0 ; k <=j ; k++)
		{
			System.out.println(a[k]);
		}	

	}

}
