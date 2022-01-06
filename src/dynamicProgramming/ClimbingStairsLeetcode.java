package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	Example 1:
	Input: n = 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	
	Example 2:
    Input: n = 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step
 *
 */
public class ClimbingStairsLeetcode {
	/* Time Complexity - O(N) , Space Complexity - O(N)
	 * Top-down approach
	Map<Integer, Integer> cache = new HashMap<>();
	
	public int climbingStairs(int n) {
		return dp(n);
	}
	
	private int dp(int i) {
		if (i == 1) {
			return 1;
		}
		if (i == 2) {
			return 2;
		}
		if (!cache.containsKey(i)) {
			cache.put(i, dp(i-1) + dp(i-2));
		}
		
		return cache.get(i);
	}*/
	
	/* Time complexity - O(N), Space complexity - O(N)
	//Bottom up approach with memory
	public int climbingStairs(int n) {
		int[] memory = new int[n+1];
		if (n <= 2) {
			return n;
		}
		memory[1] = 1;
		memory[2] = 2;
		for (int i = 3; i <= n; i++) {
			memory[i] = memory[i-1] + memory[i-2];
		}
		return memory[n];
	}
	*/
	
	/*Time complexity - O(N), Space complexity - O(1)
	 * Bottom -up approach without memory using two pointer
	public int climbingStairs(int n) {
		if (n <= 2) return n;
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}*/

	public static void main(String[] args) {
		

	}

}
