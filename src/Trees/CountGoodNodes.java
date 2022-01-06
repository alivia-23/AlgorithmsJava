package Trees;
/**
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
   Return the number of good nodes in the binary tree.
	Example 1:
	Input: root = [3,1,4,3,null,1,5]
	Output: 4
	Explanation: Nodes in blue are good.
	Root Node (3) is always a good node.
	Node 4 -> (3,4) is the maximum value in the path starting from the root.
	Node 5 -> (3,4,5) is the maximum value in the path
    Node 3 -> (3,1,3) is the maximum value in the path.
 * 
 *
 */
public class CountGoodNodes {
	public int goodNodes(TreeNode root) {
		return countGoodNodes(root, root.val);
	}
    
	private int countGoodNodes(TreeNode root, int maxSoFar) {
		int numberOfGoodNodes = 0;
		if (root != null) {
			if (root.val >= maxSoFar) {
				maxSoFar = root.val;
				numberOfGoodNodes++;
			}
			numberOfGoodNodes += countGoodNodes(root.left, maxSoFar);
			numberOfGoodNodes += countGoodNodes(root.right, maxSoFar);
		}
		return numberOfGoodNodes;
	}
}
