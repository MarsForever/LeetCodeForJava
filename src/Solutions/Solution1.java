package Solutions;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
        for(int i= 0; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length; j++){
               if(target==nums[i] + nums[j]){
                   int[] ret = {i,j};
                   return ret;
               }
            }
        }
        return nums;
    }
}
