package dynamicProgramming;

/*
 * There are ‘n’ houses built in a line. A thief wants to steal maximum 
 * possible money from these houses. The only restriction the thief has
 * is that he can’t steal from two consecutive houses, as that would alert 
 * the security system. How should the thief maximize his stealing?
 * 
 * Given a number array representing the wealth of ‘n’ houses, 
 * determine the maximum amount of money the thief can steal 
 * without alerting the security system.

	Example 1:
	Input: {2, 5, 1, 3, 6, 2, 4}
	Output: 15
	Explanation: The thief should steal from houses 5 + 6 + 4
	
	Example 2:
	Input: {2, 10, 14, 8, 1}
	Output: 18
	Explanation: The thief should steal from houses 10 + 8
 */

public class HouseThief {

	public static void main(String[] args) {
		int[] nums = {2, 10, 14, 8, 1};
		System.out.println(houseThief(nums));

	}
	
	public static int houseThief(int[] num) {
		int n = num.length;
		
		int[] sum1 = new int[n];
		int[] sum2 = new int[n+1];
		
		
		for (int i = num.length-1; i >= 0; i--) {
			sum1[i] = sum1[i-1] + sum1[i-3];
			sum2[i] = sum2[i-2] + sum2[i-4];
		}
		
		return Math.max(sum1[n], sum2[n]);
		
	}

}
