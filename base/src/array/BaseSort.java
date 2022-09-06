package array;

/**
 * @Author zouz
 * @Date 2022/9/6 11:08
 */
public class BaseSort {
    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
