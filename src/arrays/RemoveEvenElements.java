package arrays;

import java.util.ArrayList;
import java.util.List;

// Remove even elements in an array

public class RemoveEvenElements {

	public static void main(String[] args) {
		int[] arr = {2,5,6,7,8,9,12};
		
		System.out.println(removeEvenElem(arr));

	}
	
	static List<Integer> removeEvenElem(int[] arr) {
		
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result.add(arr[i]);
			}
		}
		return result;
	}

}
