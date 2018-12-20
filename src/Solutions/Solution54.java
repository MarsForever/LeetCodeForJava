package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[0].length ; j++) {
				res.add(matrix[i][j]);
			}
		}
		return res ;
    }
}
