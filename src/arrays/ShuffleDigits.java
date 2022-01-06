package arrays;
/* There is a company that has a very creative way of managing its accounts. Every time they want to write down a number,
 * they shuffle its digits in the following way: they alternatively write one digit from the front of the number and 
 * one digit from the back, then the second digit from the front and the second from the back, 
 * and so on until the length of the shuffled number is the same as that of the original.
 * 
 * Write a function 
 * 
 * class Solution { public int solution(int A) }
 * 
 * that given a positive integer A, return the shuffled representation.
 * 
 * For example given A = 123456 the function should return 162534
 * Given A = 130 the function should return 103
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(n+n)= O(2n) = O(n)
 * */

public class ShuffleDigits {

	public static void main(String[] args) {
		int A = 123456;
		int result = solution(A);
		System.out.println("Shuffled A: " + result);
	}
	
	public static int solution(int A) {
		if (A < 0) {
			return 0;
		}
		
		char[] chs = String.valueOf(A).toCharArray();
		int low = 0, high = chs.length - 1;
		StringBuilder sb = new StringBuilder();
		
		boolean takeFront = true;
		
		while (low <= high) {
			if (takeFront) {
				sb.append(chs[low]);
				low++;
			} else {
				sb.append(chs[high]);
				high--;
			}
			takeFront = !takeFront;
		}
		
		return Integer.parseInt(sb.toString());
	}

}
