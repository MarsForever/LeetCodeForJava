package Solutions;

import java.util.stream.IntStream;
//Runtime: 4 ms, faster than 40.56% of Java online submissions for Search Insert Position.
//http://www.cnblogs.com/grandyang/p/4408638.html
public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] >= target) return i;
		}
		return nums.length;
    }
}
