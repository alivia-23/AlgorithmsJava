package arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 3, 9, 6, 7, 4, 12};
		quickSort(arr);
		for (int n : arr) {
			System.out.print(n + " ");
		}

	}
	
	public static void quickSort(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		quicksort(arr, left, right);
	}
	
	public static void quicksort(int[] ar, int left, int right) {
		if(left >= right) return;
		int pivot = ar[left + (right - left)/2];
		int index = partition(ar, left, right, pivot);
		quicksort(ar, left, index - 1);
		quicksort(ar, index, right);
	}
	
	public static int partition(int[] a, int left, int right, int pivot) {
		
		while (left <= right) {
			while (a[left] < pivot) {
				left++;
			}
			
			while (a[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				swap(a, left, right);
				left++;
				right--;
			}
		}
		return left;	
	}
	
	public static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

}
