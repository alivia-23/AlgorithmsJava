package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {21, -5, 50, 34, 45, 27, 60, 10};
		
		int n = array.length; 
		
		for(int i = 0; i < n - 1; i++) {
			
			int min_index = i;
			
			for(int j = i + 1; j < n; j++) {
				if(array[j] < array[min_index]) {
					swap(array, min_index, j);
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
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
