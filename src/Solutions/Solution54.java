package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
	public List<Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0) return ans;
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
//        https://leetcode.com/problems/spiral-matrix/solution/   
//        Approach 1: Simulation
//        [0][1] is to the right, [1][0] is down, [0][-1] is to the left, and [-1][0] is up.
//           0   is to the right,      1 is down,     2   is to the left,        3    is up. 
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, di = 0;
        for (int i = 0; i < R * C; i++) {
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
          if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]){
            		r = cr;
                c = cc;
            } else {
//	retate all 4 directions right,down,left,up 
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }
}

//2 ms, faster than 36.93% of Java online submissions for Spiral Matrix.
