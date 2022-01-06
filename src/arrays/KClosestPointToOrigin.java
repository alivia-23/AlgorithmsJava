	package arrays;

import java.util.Arrays;

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

// Time Complexity - O(nlogn)
// Space Complexity - O(n+k) 
public class KClosestPointToOrigin {
   public int[][] findKClosestPointToOrigin(int[][] points, int K) {
	   Arrays.sort(points, (a, b) -> findDistance(a) - findDistance(b));
	   int[][] result = new int[K][2];
	   for (int i = 0; i < K; i++) {
		   result[i] = points[i];
	   }
	   return result;
   }
   
   public int findDistance(int[] point) {
	   int distance = point[0] * point[0] + point[1] * point[1];
	   return distance;
   }
}
