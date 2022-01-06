package arrays;

public class ArrayPrint2D {

	public static void main(String[] args) {
		int[][] scores = {
			{1, 90, 92, 93},
			{2, 65, 85, 90},
			{3, 90, 75, 98}
		 };
		
		print(scores);

	}
	
	public static void print(int[][] scores) {
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
                 System.out.print(scores[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
