package heap;

import java.util.PriorityQueue;

/* We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)
Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
 * */

public class KClosestPointsToOrigin {
	public int[][] KClosest(int[][] points, int K) {
		PriorityQueue<int[]> maxHeap = new PriorityQueue<>(K, (a, b) -> findDistance(b) - findDistance(a));
		for (int[] point : points) {
			maxHeap.offer(point);
			if (maxHeap.size() > K) {
				maxHeap.poll();
			}
		}
		int[][] result = new int[K][2];
		for (int i = 0; i < K; i++) {
			result[i] = maxHeap.poll();
		}
		return result;
	}
	
	public int findDistance(int[] point) {
		int distance = point[0] * point[0] + point[1] * point[1];
		return distance;
	}

}
