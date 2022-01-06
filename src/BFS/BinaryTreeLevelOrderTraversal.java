package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	
	public static List<List<TreeNode>> levelOrderTraversal(TreeNode root) {
		List<List<TreeNode>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int n = queue.size();
			List<TreeNode> level = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				TreeNode node = queue.poll();
				level.add(node);
				if (node.left != null) queue.offer(node.left);
				if (node.right != null) queue.offer(node.right);
			}
			result.add(level);
		}
		return result;
		
	}

}
