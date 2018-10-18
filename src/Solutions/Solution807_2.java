package Solutions;

public class Solution807_2 {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int[][] max = new int[2][grid.length];

		for(int i = 0 ; i < grid.length ; i++) {
			for(int j = 0 ; j < grid.length ; j++) {
				if( max[0][i] < grid[j][i]) {
					max[0][i] = grid[j][i];
				}
				if( max[1][i] < grid[i][j]) {
					max[1][i] = grid[i][j];
				}
			}
		}
		int total = 0;
		for(int i = 0 ; i < grid.length ; i++) {
			for(int j = 0 ; j < grid.length ; j++) {
				if(max[0][i] >= max[1][j]) {
					total +=  max[1][j] - grid[i][j];
				}else {
					total += max[0][i] - grid[i][j];
				}
			}
		}
		return total;
	}
}
