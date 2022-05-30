package dayExercises;

import common.TreeNode;

/**
 * @author zouzh
 * @date 2022/5/30 20:00
 */

/**
 * 深度优先的递归
 */
public class Question1022 {

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = (val << 1) | root.val;
        if (root.left == null && root.right == null) {
            return val;
        }
        return dfs(root.left, val) + dfs(root.right, val);
    }

    public static void main(String[] args) {

    }
}
