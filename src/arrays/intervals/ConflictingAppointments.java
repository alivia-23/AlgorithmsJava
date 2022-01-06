package arrays.intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given an array of intervals representing ‘N’ appointments, find out if a person can attend all the appointments.
 * 
 *  Appointments: [[1,4], [2,5], [7,9]]
	Output: false
	Explanation: Since [1,4] and [2,5] overlap, a person cannot attend both of these appointments.
	
	Appointments: [[6,7], [2,4], [8,12]]
	Output: true
	Explanation: None of the appointments overlap, therefore a person can attend all of them.
	
	Appointments: [[4,5], [2,3], [3,6]]
	Output: false
	Explanation: Since [4,5] and [3,6] overlap, a person cannot attend both of these appointments.
 */

public class ConflictingAppointments {
	
	public static void main(String[] arg) {
		Interval i1 = new Interval(6,  7);
		Interval i2 = new Interval(2,  4);
		Interval i3 = new Interval(8,  12);
		List<Interval> intervals = new ArrayList<>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		System.out.println(canAttend(intervals));
	}
	
	public static boolean canAttend(List<Interval> intervals) {
		Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);
		
		for (int i = 0; i < intervals.size()-1; i++) {
			if (intervals.get(i).end > intervals.get(i+1).start) {
				return false;
			} 
		}
		return true;
	}

}

