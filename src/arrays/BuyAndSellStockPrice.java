package arrays;

public class BuyAndSellStockPrice {

	public static void main(String[] args) {
		int[] prices = {7,1,2,3,5,4};
		int[] prices1 = {7,6,5,4,3,2,1};
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(prices1));

	}
	
	private static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - min);
		}
		
		return maxProfit;
	}	

}
/**
 * Runtime Complexity - O(n) because in worst case all the elements should be traversed once
 * Space Complexity - O(1) constant space is needed
 */
