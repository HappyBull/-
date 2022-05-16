package dayExercises;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zouzh
 * @date 2022/5/16 21:52
 */

/**
 * 利用二叉搜索树的性质
 * 后继结点的值大于p节点的值
 * 后继结点是大于p中最下的一个
 */
public class Question04_06 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        int target = p.val;
        TreeNode cur = root;
        TreeNode ans = null;
        while (cur != null){
            if (cur.val > target){
                ans = cur;
                cur = cur.left;
            }
            else{
                cur = cur.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
