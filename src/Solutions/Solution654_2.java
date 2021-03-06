package Solutions;

import Execute.TreeNode;
public class Solution654_2 {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return construt(nums, 0, nums.length-1);
	}
	 
	public TreeNode construt(int[] nums,int left,int right){
		if(left>right){
			return null;
		}
		int max=nums[left];
		int max_index=left;
		for(int i=left+1;i<=right;i++){
			if(nums[i]>max){
				max=nums[i];
				max_index=i;
			}
		}
		TreeNode root=new TreeNode(max);
		root.left=construt(nums, left, max_index-1);
		root.right=construt(nums, max_index+1, right);
		return root;
	}
}
