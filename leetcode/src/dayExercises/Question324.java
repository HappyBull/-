package dayExercises;

import java.util.Arrays;

/**
 * @author zouzh
 * @date 2022/6/28 23:33
 */

public class Question324 {

    //摆动排序
    //先排序再跳着两两拿数
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int x = (n + 1) / 2;
        for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if (i + 1 < n) {
                nums[i + 1] = arr[k];
            }
        }
    }

    public static void main(String[] args) {

    }
}
