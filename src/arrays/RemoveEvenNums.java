package arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenNums {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[] result = removeEvenNums(array);
		for(int i = 0; i < result.length; i++) {
		    System.out.println(result[i]);	
		}
    }
	
	public static int[] removeEvenNums(int[] arr) {
		List<Integer> oddlist = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
			    oddlist.add(arr[i]);
			}
		}
		
		int[] output = new int[oddlist.size()];
		
		for(int i = 0; i < output.length; i++) {
			output[i] = oddlist.get(i);
		}
		return output;
	}

}
