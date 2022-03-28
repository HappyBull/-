package dayExercises;

/**
 * @Author zouz
 * @Date 2022/3/21 9:20
 */

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * 给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 * 深度优先遍历/广度优先便利/中序遍历加双指针
 * 前两种方法配合一个hash表，便利一个节点时，判断表中是不是已经有k-val
 * 中序遍历的结果是递增的，通过双指针，当指针相遇时，就代表不存在
 */
public class Question653 {
    Set<Integer> temp = new HashSet<>();

    //深度优先
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (temp.contains(k - root.val)) {
            return true;
        }
        temp.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    //广度优先
    public boolean findTargetD(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (set.contains(k - node.val)) {
                return true;
            }
            set.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return false;
    }


}


