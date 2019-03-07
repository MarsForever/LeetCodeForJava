package Solutions;

import java.util.Arrays;

public class Solution973 {
	public int[][] kClosest(int[][] points, int K) {
		int[] array = new int[points.length];
		for (int i = 0; i < points.length; i++) {
			array[i] = sqr(points[i][0]) + sqr(points[i][1]);
		}
		Arrays.sort(array);
		int distK = array[K - 1];
		int[][] ans = new int[K][2];
		int t = 0;
		for (int i = 0; i < points.length; ++i) {
			if ((sqr(points[i][0]) + sqr(points[i][1])) <= distK) {
				ans[t++] = points[i];
			}

		}
		return ans;
	}

	public int sqr(int num) {
		return num * num;
	}
}

// Runtime: 30 ms, faster than 93.13% of Java online submissions for K Closest
// Points to Origin.
// https://leetcode.com/problems/k-closest-points-to-origin/solution/