package dayExercises;

/**
 * @Author zouz
 * @Date 2022/5/5 16:59
 */

/**
 * 乘积小于 K 的子数组
 * 滑动窗口+双指针
 */
public class Question713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ret = 0;
        int prod = 1, i = 0;//i为左窗口
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {//如果当前乘积大于k，左窗口右移一位
                prod /= nums[i];
                i++;
            }
            ret += j - i + 1;//当前窗口子数组个数
        }
        return ret;
    }
}
