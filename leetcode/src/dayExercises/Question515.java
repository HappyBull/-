package dayExercises;

import common.TreeNode;

import java.util.*;

/**
 * @author zouzh
 * @date 2022/6/24 21:35
 */

public class Question515 {
    Map<Integer, Integer> result = new HashMap<Integer, Integer>();
    int maxHeight = 0;
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> temp = new ArrayList<Integer>();
        if (root == null) {
            return temp;
        }
        dfs(root, 1);
        for (int i = 1; i <= maxHeight; i++) {
            temp.add(result.get(i));
        }
        return temp;
    }

    public void dfs(TreeNode root, int height) {
        maxHeight = Math.max(maxHeight,height);
        int value = result.getOrDefault(height, Integer.MIN_VALUE);
        result.put(height, Math.max(value, root.val));
        if (root.left != null) {
            dfs(root.left, height + 1);
        }
        if (root.right != null) {
            dfs(root.right, height + 1);
        }
    }

    public static void main(String[] args) {

    }
}
