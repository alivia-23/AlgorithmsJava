package Trees;

public class SubTreeOfAnotherTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null) {
			return false;
		} else if (isSameTree(s, t)) {
			return true;
		} else {
			return isSubtree(s.left, t) && isSubtree(s.right, t);
		}
	}
	
	public boolean isSameTree(TreeNode s, TreeNode t) {
		if (s == null || t == null) {
			return s == null && t == null;
		} else if (s.val == t.val) {
			return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
		} else {
			return false;
		}
	}

}
