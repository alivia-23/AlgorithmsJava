package arrays;
/* There are N coins, each showing either heads or tails. We would like all the coins to form a sequence of alternating head and tails.
 * What is the minimum number of coins that must be reversed to achieve this?
 * Consecutive elements of array A represent consecutive coins and contain either a 0(heads) or a 1(tails)
 * 
 * Example:
 * 
 * A  = [1,0,1,0,1,1] the function should return 1 . 
 * After reversing the sixth coin, we achieve an alternating sequence of coins[1,0,1,0,1,0]
 * 
 * A = [1,1,0,1,1]
 * After reversing the second coin,third and fourthcoins, we get coins[1,0,1,0,1] for this function return 3
 * But if we reverse the first and fifth coin, we get [0,1,0,1,0] for this function should return 2
 *  therefor minimum number is 2, so we would go for second procedure.
 *  
 * A = [0,1,0] the function should return 0 as the sequence is already alternating.
 * 
 * A = [0,1,1,0] the function should return 2
 * In either case, [1,0,1,0] and [0,1,0,1] we are reversing 2 coins.
 * */
public class ReverseCoinsHeadsTails {

	public static void main(String[] args) {
		int[] A = {1,0,1,0,1,1};
		int[] A1 = {1,1,0,1,1};
		int result = flipCoins(A1);
		System.out.println("Minimum flips: " + result);
	}
	
	public static int flipCoins(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		
		int minFlipStart0 = flip(A, 0);
		int minFlipStart1 = flip(A, 1);
		
		return Math.min(minFlipStart0, minFlipStart1);
	}
	
	public static int flip(int[] nums, int x) {
		int count = 0;
		for (int num : nums) {
			if (num != x) {
				count++;
			}
			x = x == 1 ? 0 : 1;
		}
		return count;
	}

}
