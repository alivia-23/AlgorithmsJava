package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.TreeNode;

/* Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 * */

public class BinaryTreeZigZagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root ==  null) {
			return result;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		boolean isLeft = true;
		while (!q.isEmpty()) {
			int levelSize = q.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < levelSize; i++) {
				TreeNode node = q.remove();
				
				if (!isLeft) {
					list.add(0, node.val);
				} else {
					list.add(node.val);
				}
				
				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}
			}
			result.add(list);
			isLeft = !isLeft;
		}
		return result;
	}
    
}
