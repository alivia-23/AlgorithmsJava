package DFS;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
   An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
   You may assume all four edges of the grid are all surrounded by water.
 * 
 *      Input: grid = [
		  ["1","1","1","1","0"],
		  ["1","1","0","1","0"],
		  ["1","1","0","0","0"],
		  ["0","0","0","0","0"]
		 ]
        Output: 1
 *
 */

public class NumberOfIsland {
	private int[][] directions = {
			{1, 0},
			{-1, 0},
			{0, 1},
			{-1, 0}
	};
	public int numberOfIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j);
					count++;
				}
			}
		}
		return count;
	}
	
	private void dfs(char[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
			return;
		}
		
		grid[i][j] = '0'; // we are marking our visited cell as '0' so that we don't go through the same cell again
		for (int[] direction : directions) {
			int row = i + direction[0];
			int col = j + direction[1];
			dfs(grid, row, col);
		}
	}

}
