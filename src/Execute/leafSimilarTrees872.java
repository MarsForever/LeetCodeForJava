package Execute;
import Solutions.Solution872;


//input
//[3,5,1,6,2,9,8,null,null,7,4]
//[3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]

//output: true

public class leafSimilarTrees872 {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(3);
		root1.left =new TreeNode(5);
		root1.right = new TreeNode(1);
		root1.left.left = new TreeNode(6);
		root1.left.right = new TreeNode(2);
		root1.left.right.left = new TreeNode(7);
		root1.left.right.right = new TreeNode(4);
		root1.right.right = new TreeNode(9);
		root1.right.left = new TreeNode(8);
		
		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(5);
		root2.right = new TreeNode(1);
		root2.left.left = new TreeNode(6);
		root2.left.right = new TreeNode(7);
		root2.right.left = new TreeNode(4);
		root2.right.right = new TreeNode(2);
		root2.right.right.right = new TreeNode(9); 
		root2.right.right.left = new TreeNode(8);

		
		Solution872 test = new Solution872();
		System.out.println("Result: " + test.leafSimilar(root1,root2));
	}
}
