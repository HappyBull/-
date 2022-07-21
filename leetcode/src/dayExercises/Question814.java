package dayExercises;

import common.TreeNode;

/**
 * @Author zouz
 * @Date 2022/7/21 15:20
 */
public class Question814 {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
