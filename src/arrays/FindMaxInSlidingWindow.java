package arrays;

import java.util.ArrayDeque;

/**
 * Given a large array of integers and a window of size ww, find the current maximum value in the window as the window slides through the entire array.
 * @author witha
 *
 */

public class FindMaxInSlidingWindow {
	public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
	    ArrayDeque<Integer> result = new ArrayDeque<>(); 
	    int n = arr.length;
	    for (int i = 0; i < n - windowSize + 1; i++) {
	      int windowMax = Integer.MIN_VALUE;
	      for(int j = i; j < i + windowSize ; j++) {
	          windowMax = Math.max(windowMax, arr[j]);
	      }
	      result.add(windowMax);
	    }
	    return result; 
    }

}
