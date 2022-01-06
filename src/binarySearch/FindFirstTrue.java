package binarySearch;

/**
 * An array of boolean values is divided into two sections; the left section consists of all false and the right section consists of all true.
 *  Find the boundary of the right section, i.e. the index of the first true element. If there is no true element, return -1.
    Input: arr = [false, false, true, true, true]
    Output: 2
 */

public class FindFirstTrue {
	// Brute force O(n)
	public static int findFirstTrue(boolean[] bools) {
		if (bools.length == 0) {
			return -1;
		}
		for (int i = 0; i < bools.length; i++) {
			if (bools[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findFirstTrue1(boolean[] bools) {
		
		
	}

	public static void main(String[] args) {
		boolean[] arr = {false, false, true, true, true};
		boolean[] arr1 = {false, false, false, false, false};
		boolean[] arr2 = {true, true, true, true, true};
		int firstTrue = findFirstTrue(arr);
		System.out.println(firstTrue);

	}

}
