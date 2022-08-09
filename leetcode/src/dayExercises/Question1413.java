package dayExercises;

/**
 * @Author zouz
 * @Date 2022/8/9 16:10
 */
public class Question1413 {

    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 1) {
                min = Math.min(sum, min);
            }
        }
        return Math.abs(min) + 1;
    }
}
