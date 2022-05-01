package dayExercises;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouzh
 * @date 2022/5/1 22:11
 */

public class Question1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        inorder(root1, list1);
        inorder(root2, list2);
        int l1 = 0, l2 = 0;
        List<Integer> result = new ArrayList<Integer>();
        while (l1 < list1.size() || l2 < list2.size()) {
            if (l1 == list1.size()) {
                result.add(list2.get(l2++));
            } else if (l2 == list2.size()) {
                result.add(list1.get(l1++));
            } else {
                if (list2.get(l2) > list1.get(l1)) {
                    result.add(list1.get(l1++));
                } else {
                    result.add(list2.get(l2++));
                }
            }
        }
        return result;
    }

    public void inorder(TreeNode node, List<Integer> list) {
        if (node != null) {
            inorder(node.left, list);
            list.add(node.val);
            inorder(node.right, list);
        }
    }

    public static void main(String[] args) {

    }
}
