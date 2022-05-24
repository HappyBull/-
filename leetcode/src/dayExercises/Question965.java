package dayExercises;

/**
 * @author zouzh
 * @date 2022/5/24 21:17
 */

import common.TreeNode;

/**
 * 递归，左节点=根节点，右节点=根节点，在递归中传递
 * 就可以保证都相等
 */
public class Question965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.val != root.left.val || !isUnivalTree(root.left)) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val != root.right.val || !isUnivalTree(root.right)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
