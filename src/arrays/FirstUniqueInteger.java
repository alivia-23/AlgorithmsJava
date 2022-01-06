package arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueInteger {
	
	public static int findFirstUnique(int[] arr) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int val : arr) {
	    	map.put(val, map.getOrDefault(val, 0) + 1);
	    }
	    for (int val : arr) {
	    	int count = map.get(val);
	    	if (count == 1) {
	    		return val;
	    	}
	    }
	    return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2, 54, 7, 2, 6, 54};

	    int unique = findFirstUnique(arr);
	    System.out.print("First Unique in an Array: " + unique);
	}

}
