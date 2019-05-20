package Solutions;

import Execute.TreeNode;

class Solution114FattenBinaryTreeToLinkedList{
	//整个程序需要维护一个全局变量，保存当前所遍历的节点。

	    TreeNode lastvisited = null;

	    public void flatten(TreeNode root) {
	        if(root == null)
	            return;
	        TreeNode realright = root.right;
	        if(lastvisited != null){
	//遍历到的值作为新的右孩子存起来，左孩子变为空
	            lastvisited.left = null;
	            lastvisited.right =root;
	        }   
	//注意的是，因为右孩子会更新，所以为了递归右子树，要在更新之前提前保存右孩子。
	            lastvisited = root;
	            flatten(root.left);
	            flatten(realright);
	    }
	}
