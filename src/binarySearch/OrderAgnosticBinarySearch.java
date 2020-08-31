package binarySearch;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		System.out.println(orderAgnosticBinarySearch(new int[] { 4, 6, 10 }, 10));
	    System.out.println(orderAgnosticBinarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
	    System.out.println(orderAgnosticBinarySearch(new int[] { 10, 6, 4 }, 10));
	    System.out.println(orderAgnosticBinarySearch(new int[] { 10, 6, 4 }, 4));
		
	    /*int[] arr = { 4, 6, 10 };
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 10;
		int target1 = 5;
		int result = orderAgnosticBinarySearch(arr, target);
		System.out.println(result);
		int result1 = orderAgnosticBinarySearch(arr1, target1);
		System.out.println(result1);*/

	}
	
	public static int orderAgnosticBinarySearch(int[] arr, int target) {
		
		int low = 0, high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(target == arr[mid]) return mid;
			
			if (arr[low] < arr[high]) { // asc
				if (target < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { // desc
				if (target < arr[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
