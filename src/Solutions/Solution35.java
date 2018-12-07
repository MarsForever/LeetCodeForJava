package Solutions;

import java.util.stream.IntStream;
// Runtime 2 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//http://www.cnblogs.com/grandyang/p/4408638.html
public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		if(nums[nums.length -1] < target) return nums.length;
		int left = 0;
		int right = nums.length -1;
		while(left <= right) {
			int mid = left + ((right - left) >> 1 );
			if(nums[mid] == target) return mid;
			else if(nums[mid] < target) left = mid + 1;
			else right  = mid - 1 ;
		}
		return left;
    }
}
