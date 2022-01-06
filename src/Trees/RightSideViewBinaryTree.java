package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * Input: root = [1,2,3,null,5,null,4]
   Output: [1,3,4]
   
   Input: root = [1,null,3]
   Output: [1,3]
   
   Input: root = []
   Output: []
 * 
 * 
 * Time Complexity - O(N) Since we are processing n nodes of a tree
 * Space complexity - O(logN) + N/2  as result list consists of no. of elements equal to height of a tree i.e. O(logN)and 
 *                                   in the queue at last there will n/2 leaf nodes out of total nodes in case of complete binary tree 
 *
 */

public class RightSideViewBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (i == size - 1) {
                    result.add(current.val);
                }
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
        }
        return result;
    }

}
