package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 *  and return an array of the non-overlapping intervals that cover all the intervals in the input.
	Example 1:
	
	Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
	Output: [[1,6],[8,10],[15,18]]
	Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
	Example 2:
	
	Input: intervals = [[1,4],[4,5]]
	Output: [[1,5]]
	Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * @author witha
 *
 */

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		//edge cases
		if (intervals.length <= 1) {
			return intervals;
		}
		List<int[]> result = new ArrayList<>();
		int[] prevInterval = intervals[0];
		result.add(prevInterval);
		for (int[] curInterval : intervals) {
			if (prevInterval[0] <= curInterval[1]) { // overlapping interval
				prevInterval[1] = Math.max(prevInterval[1], curInterval[1]);
			} else {  // non overlapping
				result.add(curInterval);
				prevInterval = curInterval;
			}
		}
		return result.toArray(new int[result.size()][]);
	}

}
