package Trees;
/* Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * */

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		return hasPathSum(root, sum, 0);
	}
	public boolean hasPathSum(TreeNode root, int target, int pathsum) {
		if (root == null) {
			return false;
		}
		pathsum = pathsum + root.val;
		if (root.left == null && root.right == null && pathsum == target) {
			return true;
		}
		return hasPathSum(root.left, target, pathsum) || 
			   hasPathSum(root.right, target, pathsum);
	}

}
