package dynamicProgramming;

/*
 * Given a stair with ‘n’ steps, implement a method to count how many possible ways
 *  are there to reach the top of the staircase, given that, 
 *  at every step you can either take 1 step, 2 steps, or 3 steps.

	Example 1:
	Number of stairs (n) : 3
	Number of ways = 4
	Explanation: Following are the four ways we can climb : {1,1,1}, {1,2}, {2,1}, {3} 
	
	Example 2:
	Number of stairs (n) : 4
	Number of ways = 7
	Explanation: Following are the seven ways we can climb : {1,1,1,1}, {1,1,2}, {1,2,1}, {2,1,1}, 
	{2,2}, {1,3}, {3,1}
 */

public class ClimbingStairs3 {

	public static void main(String[] args) {
		System.out.println(countPossibleWays(20));

	}
	
	public static int countPossibleWays(int n) {
		int[] memoized = new int[n+1];
		return calcClimb(memoized, n);
	}
	
	static int calcClimb(int[] memoized, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		// if already exists in memo then return memo value
		if (memoized[n] != 0) {
			return memoized[n];
		}
		
		memoized[n] = calcClimb(memoized, n-1) + calcClimb(memoized, n-2) + calcClimb(memoized, n-3);
		return memoized[n];
	}

}
