package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/22 22:01
 */

import java.util.Arrays;

/**
 * 旋转函数
 * 本质是数学题
 * F(K) = F(k-1) + sum - n - num[n-k]
 */
public class Question396 {
    public int maxRotateFunction(int[] nums) {
        int f = 0, n = nums.length, numSum = Arrays.stream(nums).sum();
        for (int i = 0; i < n; i++) {
            f += i * nums[i];
        }
        int res = f;
        for (int i = n - 1; i > 0; i--) {
            f += numSum - n * nums[i];
            res = Math.max(res, f);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
