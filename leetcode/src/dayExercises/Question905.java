package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/28 22:26
 */

public class Question905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[left++] = nums[i];
            }else {
                result[right--] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
