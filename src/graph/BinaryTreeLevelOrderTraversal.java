package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode (int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		
		if(root == null) return result;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			
			List<Integer> curLevelNodeValue = new ArrayList<>();
			
			for (int i = 0; i < queue.size(); i++) {
				TreeNode curNode = queue.poll();
				curLevelNodeValue.add(curNode.val);
				
				if(curNode.left != null) queue.offer(curNode.left);
				if(curNode.right != null) queue.offer(curNode.right);
			}
			
			result.add(curLevelNodeValue);
			
		}
		
		return result;
	}

}
