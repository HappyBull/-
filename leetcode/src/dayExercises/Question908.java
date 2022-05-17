package dayExercises;

import java.util.Arrays;

/**
 * @author zouzh
 * @date 2022/4/30 22:06
 */

public class Question908 {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();
        if ((minNum + k) > (maxNum - k)) {
            return 0;
        } else {
            return maxNum - minNum - k - k;
        }
    }

    public static void main(String[] args) {

    }
}
