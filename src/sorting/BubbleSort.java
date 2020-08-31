package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {21, -5, 50, 34, 45, 27, 60, 10};
		
		int n = array.length;
        
		for (int j = n - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		if(i == j) {
			return;
		}
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
