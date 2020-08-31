package arrays;

public class Array2D {

	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;
		int[][] arr = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			//arr[i] = new int[cols];
			for(int j = 0; j < cols; j++) {
				arr[i][j] = i + j;
			}
		}
		
		for(int i = 0; i < rows; i++) {
			System.out.println();
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}

	}

}
