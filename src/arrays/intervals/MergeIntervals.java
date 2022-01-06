package arrays.intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.
 * 
 * Intervals: [[1,4], [2,5], [7,9]]
	Output: [[1,5], [7,9]]
	Explanation: Since the first two intervals [1,4] and [2,5] overlap, we merged them into 
	one [1,5].
	
	Intervals: [[6,7], [2,4], [5,9]]
	Output: [[2,4], [5,9]]
	Explanation: Since the intervals [6,7] and [5,9] overlap, we merged them into one [5,9].
	
	Intervals: [[1,4], [2,6], [3,5]]
	Output: [[1,6]]
	Explanation: Since all the given intervals overlap, we merged them into one.
 */

public class MergeIntervals {

	public static void main(String[] args) {
		Interval i1 = new Interval(2, 4);
		Interval i2 = new Interval(5, 9);
		Interval i3 = new Interval(6, 7);
		List<Interval> intervals = new ArrayList<>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		List<Interval> result = mergeInterval(intervals);
		for (Interval interval : result) {
			System.out.println("[" + interval.start + " " + interval.end + "]");
		}
		

	}
	
	public static List<Interval> mergeInterval(List<Interval> intervals) {
		if (intervals.size() <= 1) {
			return intervals;
		}
		List<Interval> mergedInterval = new ArrayList<>();
		
		Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);
		
		Interval first = intervals.get(0);
		
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (current.start <= first.end) {
				first.end = Math.max(first.end, current.end);
			} else {
				mergedInterval.add(first);
				first = current;
			}
		}
		mergedInterval.add(first);
		return mergedInterval;
	}

}


