package Trees;

import java.util.ArrayList;
import java.util.List;

public class FindLonelyNodes {

	public List<Integer> getLonelyNodes(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		dfs(root, false, result);
		return result;
	}
	
	private void dfs(TreeNode root, boolean isLonely, List<Integer> result) {
		if (root == null) {
			return;
		}
		if (isLonely) {
			result.add(root.val);
		}
		dfs(root.left, root.right == null, result);
		dfs(root.right, root.left == null, result);
	}

}
