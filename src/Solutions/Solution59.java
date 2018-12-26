package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution59 {
	public int[][] generateMatrix(int n) {
		int [][] matrix = new int[n][n];
		int R = n , C = n;
		boolean [][] seen = new boolean[n][n];
		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};
		int r = 0, c = 0 , di = 0;
		int count = 1;
		for(int i = 0 ;i < n * n; i++) {
			matrix[r][c] = count;
			seen[r][c] = true;
			int cr = r + dr[di];
			int cc = c + dc[di];
			if(0 <= cr && cr < R && 0 <= cc && cc < R && !seen[cr][cc]) {
				r = cr;
				c =cc;
			}else {
				di = (di + 1) % 4;
				r += dr[di];
				c += dc[di];
			}
			count++;
		}
		return matrix;
    }
}

//Runtime: 2 ms, faster than 32.90% of Java online submissions for Spiral Matrix II.

