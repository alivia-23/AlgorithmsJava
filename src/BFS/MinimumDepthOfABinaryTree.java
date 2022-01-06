package BFS;

import java.util.LinkedList;
import java.util.Queue;

import Trees.TreeNode;

/**
 * Given a binary tree, find its minimum depth.
    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
	Note: A leaf is a node with no children.
	Example 1:
	Input: root = [3,9,20,null,null,15,7]
	Output: 2
	Example 2:
	
	Input: root = [2,null,3,null,4,null,5,null,6]
	Output: 5
 * @author witha
 *  Time Complexity - O(N)
 *  Space Complexity - O(N/2)
 */
public class MinimumDepthOfABinaryTree {
	
	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int minDepth = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			minDepth++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				// check if its the leaf node
				if (node.left == null && node.right == null) {
					return minDepth;
				}
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
		}
		return minDepth;
	}

}
