package arrays;
/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

	Notice that you may not slant the container.
	Example 1:
	Input: height = [1,8,6,2,5,4,8,3,7]
	Output: 49
	Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
	In this case, the max area of water (blue section) the container can contain is 49.
	Example 2:
	Input: height = [1,1]
	Output: 1
	Example 3:
	Input: height = [4,3,2,1,4]
	Output: 16
	Example 4:
	Input: height = [1,2,1]
	Output: 2
	
	Constraints:
	n == height.length
	2 <= n <= 105
	0 <= height[i] <= 104
 * @author witha
 * 1. We take two pointers from start and end and calculate the area based on the smaller height multiplied by current the window width
 * 2. we move the smaller pointer as we are bound with the smaller height, since bigger height won't help because it will spill out most water outside
 * 
 * Time Complexity - O(N)
 * Space Complexity - O(1)
 */
public class ContainerWithMostWater {
	
	public static int maxAreaOfWater(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = Integer.MIN_VALUE;
		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
