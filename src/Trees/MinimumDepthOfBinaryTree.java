package Trees;

import java.util.LinkedList;
import java.util.Queue;

/* Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.
 * */

public class MinimumDepthOfBinaryTree {
	public int findMinimumDepthBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int minDepth = 0;
		while (!q.isEmpty()) {
			minDepth++;
			int levelSize = q.size();
			for (int i = 0; i < levelSize; i++) {
				TreeNode node = q.remove();
				if (node.left == null && node.right == null) {
					return minDepth;
				}
				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}
			}
		}
		return minDepth;
	}

}
