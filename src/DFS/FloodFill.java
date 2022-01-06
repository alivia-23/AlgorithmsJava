package DFS;

/**
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
	You are also given three integers r, c, and newColor. You should perform a flood fill on the image starting from the pixel image[r][c].
	
	To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as 
	the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. 
	Replace the color of all of the aforementioned pixels with newColor.
	
	Input: image = [[0,0,0],[0,0,0]], r = 0, c = 0, newColor = 2
    Output: [[2,2,2],[2,2,2]]
	
	**** similar question ****
	you are given a m x n grid matrix and you are given a cell whose index values are given suppose r, c. 
	You need to replace all the values similar to the given cell with a value suppose newValue in the grid matrix
	Also you can go only horizontally and vertically
    
    
    ***********************************************
    *Time complexity = O(N) As there are N number of cells in the matrix and we might process every cell
    *Space complexity = O(N) Size of the call stack while calling dfs
 * 
 *
 */

public class FloodFill {
	private int[][] directions = {
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1}
	};
    public int[][] floodfill(int[][] matrix, int r, int c, int newNum) {
    	int oldNum = matrix[r][c];
    	if (oldNum == newNum) {  // if the number that needs to be changed is same as the number with which to be changed then we will just return the matrix
    		return matrix;           // as we don't need to change anything
    	}
    	dfs(matrix, r, c, oldNum, newNum);
    	return matrix;
    }
    
    private void dfs(int[][] matrix, int r, int c, int oldNum, int newNum) {
    	if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || matrix[r][c] != oldNum) {
    		return;
    	}
    	matrix[r][c] = newNum;
    	for (int[] direction : directions) {
    		int newR = r + direction[0];
    		int newC = c + direction[1];
    		if (matrix[newR][newC] == oldNum) {
    			dfs(matrix, newR, newC, oldNum, newNum);
    		}
    	}
    }
}
