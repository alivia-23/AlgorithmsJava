package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] array = {21, -5, 50, 34, 45, 27, 60, 10, 20};
		int n = array.length;
		
		for(int index = 1; index < n; index++) {
			int value = array[index];
			int hole = index;
			
			while(hole > 0 && array[hole - 1] > value) {
				array[hole] = array[hole - 1];
				hole = hole - 1;
			}
			array[hole] = value;
		}
		
		
		for (int index = 0; index < n; index++) {
			System.out.println(array[index]);
		}

	}

}
