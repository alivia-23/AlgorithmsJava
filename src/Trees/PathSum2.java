package Trees;

import java.util.ArrayList;
import java.util.List;

/* Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
 * */

public class PathSum2 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		recursePathSum(root, sum, 0, current, result);
		return result;
	}
	public void recursePathSum(TreeNode root, int sum, int currentSum, List<Integer> current, List<List<Integer>> result) {
		if (root == null) {
			return;
		}
		current.add(root.val);
		currentSum = currentSum + root.val;
		if (root.left == null && root.right == null && currentSum == sum) {
			result.add(new ArrayList<>(current));
		} else {
			recursePathSum(root.left, sum, currentSum, current, result);
			recursePathSum(root.right, sum, currentSum, current, result);
		}
		current.remove(current.size() - 1);	
	}

}
