package codeTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst = new ArrayList<>();
		lst.add(15);
		lst.add(20);
		lst.add(1);
		lst.add(16);
		lst.add(5);
		lst.add(50);
		
		Collections.sort(lst, new ReverseIntegerComparator());
	//	lst.sort(Comparator.reverseOrder());
		
		lst.forEach(System.out::println);
		
	}

}

class ReverseIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a; // Descending order
    }
}

class revComparator implements Comparator<Object>{
	
	@Override
	public int compare(Object obj1, Object obj2)
	{
		
		int a = (int)obj1;
		int b = (int) obj2;
		
		if(a > b) return -1;
		else if(a < b) return +1;
		else return 0;
				
	}
}
