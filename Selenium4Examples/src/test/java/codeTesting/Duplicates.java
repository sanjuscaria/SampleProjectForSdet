package codeTesting;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 2, 5, 3, 6 };

		// Use LinkedHashSet to preserve order
		Set<Integer> seen = new LinkedHashSet<>();
		Set<Integer> duplicates = new LinkedHashSet<>();

		// Iterate through the array
		for (int num : array) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}

		// Print duplicates
		System.out.println("Duplicate elements: " + duplicates);
	}

}



