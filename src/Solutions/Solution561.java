package Solutions;

import java.util.Arrays;

public class Solution561 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int total = 0;
		for(int i = 0 ; i < nums.length ; i=i+2) {
			total += nums[i];
		}
		return total;
    }
}
