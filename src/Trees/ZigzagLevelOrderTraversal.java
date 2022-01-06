package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, 
 * return the zigzag level order traversal of its nodes' values. 
 * (i.e., from left to right, then right to left for the next level and alternate between).
 * 
 * Input: root = [3,9,20,null,null,15,7]
   Output: [[3],[20,9],[15,7]]
   
   Input: root = [1]
   Output: [[1]]
   
   Input: root = []
   Output: []
 * 
   Time complexity - O(N) Since each node is processed only once
   Space complexity - O(N) to output n elements in the result list
 *
 */

public class ZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		boolean left = true;
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				TreeNode current = q.poll();
				if (!left) {
					level.add(0, current.val);
				} else {
					level.add(current.val);
				}
				if (current.left != null) {
					q.offer(current.left);
				}
				if (current.right != null) {
					q.offer(current.right);
				}
			}
			result.add(level);
			left = !left;
		}
		return result;
	}

}
