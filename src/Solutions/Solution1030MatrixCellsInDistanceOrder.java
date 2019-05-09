package Solutions;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1030MatrixCellsInDistanceOrder {

	public static void main(String[] args) {
		Solution1030MatrixCellsInDistanceOrder  Solution1030 =  new Solution1030MatrixCellsInDistanceOrder();
		Solution1030.allCellsDistOrder(2, 3, 1, 2);
	}
/*
	 public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
	        int[][] origin = new int[R * C][2];
	        for (int i = 0; i < R; i++) {
	            for (int j = 0; j < C; j++) {
	                origin[i * C + j] = new int[] {i, j};
	            }
	        }

	        Arrays.sort(origin, new Comparator<int[]>(){
	            public int compare(int[] a, int[] b) {
	                return Math.abs(a[0] - r0) + Math.abs(a[1] - c0)
	                        - Math.abs(b[0] - r0) - Math.abs(b[1] - c0);
	            }
	        });
	        return origin;
	    }
*/

	public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] distance = new int[R][C];
        for(int r = 0 ; r < R ; r++){
            for(int c = 0 ; c < C ; c++){
                distance[r][c] = Math.abs(r - r0) + Math.abs(c - c0);
            }
        }
        Arrays.sort(distance);
        return distance;
    }

}
