package dayExercises;

import java.util.*;

/**
 * @author zouzh
 * @date 2022/5/19 21:10
 */

/**
 * 所有数字都变成中位数
 */
public class Question462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ret = 0, x = nums[n / 2];
        for (int i = 0; i < n; i++) {
            ret += Math.abs(nums[i] - x);
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
