package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n and an integer array rounds. We have a circular track which consists of n sectors labeled from 1 to n.
 *  A marathon will be held on this track, the marathon consists of m rounds. The ith round starts at sector rounds[i - 1] and ends at sector rounds[i].
 *  For example, round 1 starts at sector rounds[0] and ends at sector rounds[1]
    Return an array of the most visited sectors sorted in ascending order.
    Notice that you circulate the track in ascending order of sector numbers in the counter-clockwise direction (See the first example).
 * @author witha
 *
 */
public class MostVisitedSectorInACircularTrack {
	public List<Integer> mostVisited(int n, int[] rounds) {
		List<Integer> result = new ArrayList<>();
		int size = rounds.length;
		int start = rounds[0];
		int end = rounds[size - 1];
		
		if (start <= end) {
			for (int i = start; i <= end; i++) {
				result.add(i);
			}
		} else {
			for (int i = 1; i <= end; i++) {
				result.add(i);
			}
			for (int i = start; i <= n; i++) {
				result.add(i);
			}
 		}
		return result;
	}

}
