package arrays;

public class ProductOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		printArray(productExceptSelf(arr)); 

	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	
	/*
	 * Brute force method
	 */
	
	/*public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] output = new int[n];
		
		for (int i = 0; i < n; i++) {
			int product = 1;
			for (int j = 0; j < n; j++) {
				if(i != j) {
					product = product * nums[j];
				}
			}
			output[i] = product;
		}
		
		return output;
	}*/
	
	/*
	 * The following won't work for input [0,0]
	 */
	/*public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int product = 1;
		int[] output = new int[n];
		
		for (int i = 0; i < n; i++) {
			product = product * nums[i];
		}
		
		for (int i = 0; i < n; i++) {
			output[i] = product / nums[i];
		}
		
		return output;
	} */
	
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = result[i-1] * nums[i-1];
		}
		
		int right = 1;
		for (int i = n-1; i >= 0; i--) {
			result[i] = result[i] * right;
			right = right * nums[i];
		}
		
		return result;
	}

}
