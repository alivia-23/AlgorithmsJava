package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of bad numbers and a range of integers, determine the longest segment of integers within the range that does not include any bad numbers
 * Example:
 *  n = 6
 *  badNumbers = [37,7,22,15,49,60]
 *  lower = 3
 *  upper = 48
 *  The longest segment in the range 3 to 48 inclusive without any bad numbers are [3, 6], [8, 14],[16, 21],[23, 36] and [38, 48]
 *  The longest segment is [23, 36] and it is 14 elements long thus the return value is 14 
 * @author witha
 *
 */

public class LongestSegmentWithoutBadNumbers {
	
	public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {
		int longestSegment = 0;
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (Integer num : badNumbers) {
			set.add(num);
		}
		int n = upper- lower + 1;
		int[] numRange = new int[n];
		for (int i = 0; i < n; i++) {
			numRange[i] = lower;
			lower++;
		}
		for (int i = 0; i < numRange.length; i++) {
			if (!set.contains(numRange[i])) {
				count++;
			} else if (set.contains(numRange[i])) {
				count = 0;
			}
			longestSegment = Math.max(longestSegment, count);
		}
		return longestSegment;
		
	}

	public static void main(String[] args) {
		List<Integer> badNumbers1 = Arrays.asList(37, 7, 22, 15, 49, 60);
		int lower1 = 3;
		int upper1 = 48;
		System.out.println(goodSegment(badNumbers1, lower1, upper1));
		
		List<Integer> badNumbers2 = Arrays.asList(8, 6, 20, 12);
		int lower2 = 1;
		int upper2 = 30;
		System.out.println(goodSegment(badNumbers2, lower2, upper2));
		
		List<Integer> badNumbers3 = Arrays.asList(1, 2, 3, 4);
		int lower3 = 1;
		int upper3 = 4;
		System.out.println(goodSegment(badNumbers3, lower3, upper3));

	}

}
