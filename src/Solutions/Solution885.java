package Solutions;

public class Solution885 {
	public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
		int total = R * C;
		int [][] res = new int [R][C];
		for(int i = 0 ; i < R ; i++) {
			for(int j = 0 ; j < C ;j++) {
				res[i][j] = res[i][j];
			}
		}
		return res;
    }
}
