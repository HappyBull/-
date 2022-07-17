package dayExercises;


import common.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author zouz
 * @Date 2022/6/22 15:14
 */
public class Question513 {
    int curVal = 0;
    int curHeight = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return curVal;
    }


    public void dfs(TreeNode root, int height) {
        if (root == null) {
            return;
        }
        height++;
        //深度优先，先左再右，同一层的右节点高度肯定小于左节点
        dfs(root.left, height);
        dfs(root.right, height);
        if (height > curHeight) {
            curHeight = height;
            curVal = root.val;
        }
    }

    //广度优先，一次塞入同一层的右左节点，那么队列的最后一个节点，就是要输出的值
//    public int findBottomLeftValue(TreeNode root) {
//        int ret = 0;
//        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            TreeNode p = queue.poll();
//            if (p.right != null) {
//                queue.offer(p.right);
//            }
//            if (p.left != null) {
//                queue.offer(p.left);
//            }
//            ret = p.val;
//        }
//        return ret;
//    }
}
