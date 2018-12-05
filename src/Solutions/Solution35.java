package Solutions;

import java.util.stream.IntStream;
//Runtime: 79 ms, faster than 0.93% of Java online submissions for Search Insert Position.
public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length -1;
		if(target < nums[0]) {
			return 0;
		}
		if(target > nums[high]) {
			return nums.length;
		}
		boolean contains  = IntStream.of(nums).anyMatch(x -> x == target);
		if(contains) {
			while (low <= high) {
				int mid = (low + high) /2;
				if (nums[mid] == target) {
					return mid;
				}else if(nums[mid] < target) {
					low = mid + 1;
				}else {
					high = mid -1;
				}
			}
		}
		for(int i  = 0 ; i < nums.length ; i++) {
			if(target > nums[i] && target < nums[i+1]) {
				return i+1;
			}
		}
		return target;
    }
}
