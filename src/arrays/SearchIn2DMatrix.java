package arrays;
/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
	Integers in each row are sorted from left to right.
	The first integer of each row is greater than the last integer of the previous row.
	 
	 Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     Output: true
     
     Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     Output: false
 * @author witha
 *    ****LOGIC****
 *    1. start from rightmost element of the first row
 *    2. compare with target if it is greater than target then move one row forward because since the target element is greater than the last element 
 *       of first row then it should be definetly not in the first row
 *    3. if target is less than last element of current row the then move col backward because obviously it should not be in that col or more than than
 *    *************
 *    Time complexity - O(n + m)
 *    Space complexity - O(1)
 *    
 *    **** Binary Search Logic *****
 *    1. Since the every row in the matrix is sorted from left to right and last element of each is less than first element of next row
 *       we can assume the entire matrix as stretched to a single array and apply binary search in it
 *    2. Find mid index and the for finding individual row and col index of that mid index we need to perform '/' or '%' operation with the total number of cols
 *       To find row index : row = mid / total no.of columns
 *       To find col index : col = mid % total no.of columns
 *    3. Now compare target with mid element
 *    
 *    Time complexity - O(logmn)
 *    Space complexity - O(1)
 *    
 *    
 */
public class SearchIn2DMatrix {
	public boolean search2DMatrix(int[][] matrix, int target) {
		/* Search space reduction by eleminating row and col
		int row = 0;
		int col = matrix[0].length - 1;
		
		while (row < matrix.length && col >= 0) {
			if (target == matrix[row][col]) {
				return true;
			} else if (target < matrix[row][col]) {
				col--;
			} else {
				row++;
			}
		}	
		return false;	*/
		// Binary search
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		int low = 0;
		int high = numRows * numCols - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			//mid element with the index
			int midElement = matrix[mid / numCols][mid % numCols];
			if (target == midElement) {
				return true;
			} else if (target < midElement) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

}
