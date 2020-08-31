package arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 8, 10};
		int[] arr2 = { 3, 4, 8, 9, 12};
		
		printArray(mergeSortedArray(arr1, arr2));

	}
	
	public static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {

		int[] sortedArray = new int[arr1.length + arr2.length];
		int i = 0; int j = 0; int k = 0;
		
		while( i < arr1.length && j < arr2.length ) {
			
			if( arr1[i] <= arr2[j] ) {
				sortedArray[k] = arr1[i];
				i++; k++;
			} else {
				sortedArray[k] = arr2[j];
				j++; k++;
			}
		}
		
		while( i < arr1.length) {
			sortedArray[k] = arr1[i];
			i++; k++;
		}
		
		while( j < arr2.length) {
			sortedArray[k] = arr2[j];
			j++; k++;
		}
		
		return sortedArray;
		
	}

}
