package Trees;
/* Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
 * */
public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		return convertBST(nums, 0, nums.length - 1);
		
	}
	
	public TreeNode convertBST(int[] nums, int l, int r) {
		if (nums.length == 0) {
			return null;
		}
		int mid = l + (r-l) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = convertBST(nums, l, mid - 1);
		root.right = convertBST(nums, mid + 1, r);
		return root;
	}

}
