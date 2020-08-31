package arrays;

import java.util.Arrays;

public class SumConsecutiveArray {
	public static int[] sumConsecOfK(int[] nums, int k) {
		int n = nums.length;
		int[] result = new int[n - k + 1];
		
		for (int i = 0; i < result.length; i++) {
			int sum = 0;
			for (int j = i; j < i+k ; j++) {
				sum = sum + nums[j];	
			}
			result[i] = sum;
		}
		return result;
	}
	
    public static void main(String[] arg) {
		int[] num = {1,2,3,4,5};
		int k = 3;
		
		int[] resultarray = sumConsecOfK(num, k);
		System.out.println(Arrays.toString(resultarray));
	}

}

	
