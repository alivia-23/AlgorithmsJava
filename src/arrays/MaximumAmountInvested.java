package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Your team at Amazon has been asked to help outline for a hypothetical investment strategy. Imagine an investor opens a new account and wants to 
 * invest in a number of assets. Each asset begins with a balance of 0, and its value is stored in an array using 1-based indexing. Periodically a contribution 
 * is received and equal investments are made in a subset of portfolio. Each contribution will be given by investment amount, start index, end index. Each 
 * investment in that range will receive the contribution amount. Determine the maximum amount invested in any one investment after all contributions.
 * 
 * For example, start with an array of 5 elements: investments = [0, 0, 0, 0, 0]. The variable left and right will represent the starting and ending indices,
 * inclusive. Another variable contribution is the new funds to invest per asset. The first investment is at index 1.
 * 
 * left    right    contribution      investments
 *                                  [0, 0, 0, 0, 0]
 * 1        2            10         [10, 10, 0, 0, 0]
 * 2        4            5          [10, 15, 5, 5, 0]
 * 3        5            12         [10, 15, 17, 17, 12]
 * 
 * In the first round, a contribution of 10 is made to investment 1 and 2. In the second round, a contribution of 5 is made to assets 2, 3 and 4. Finally,
 * in the third round, a contribution of 12 is added to investments 3, 4 and 5. The maximum invested in any one asset is 17.
 *                                  
 * @author witha
 *
 */
public class MaximumAmountInvested {
	
	public static long maxValue(int n, List<List<Integer>> rounds) {
		long[] investments = new long[n];
		long maxInvest = 0;
		for (List<Integer> round : rounds) {
			int leftIndex = round.get(0) - 1;
			int rightndex = round.get(1) - 1;
			int contribution = round.get(2);
			for (int i = leftIndex; i <= rightndex; i++) {
				investments[i] += contribution; 
			}
		}		
		for (int i = 0; i < investments.length; i++) {
			maxInvest = Math.max(maxInvest, investments[i]);
		}
		
		return maxInvest;
	}

	public static void main(String[] args) {
		int n1 = 5;
		List<List<Integer>> rounds1 = Arrays.asList(
				Arrays.asList(1, 2, 100),
		        Arrays.asList(2, 5, 100),
		        Arrays.asList(3, 4, 100));
		System.out.println(maxValue(n1, rounds1));
		
		int n2 = 4;
		List<List<Integer>> rounds2 = Arrays.asList(
				Arrays.asList(2, 3, 603),
		        Arrays.asList(1, 1, 286),
		        Arrays.asList(4, 4, 882));
		System.out.println(maxValue(n2, rounds2));
        
		int n3 = 5;
		List<List<Integer>> rounds3 = Arrays.asList(
				Arrays.asList(1, 2, 10),
		        Arrays.asList(2, 4, 5),
		        Arrays.asList(3, 5, 12));
		System.out.println(maxValue(n3, rounds3));
	}

}
