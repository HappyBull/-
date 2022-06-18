package Ⅰ.Q1to10;


/**
 * @author zouzh
 * @date 2022/2/23 12:47
 */

//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
// 数组中某些数字是重复的，但不知道有几个数字重复了，
// 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

//方法一：遍历数组，计算每个数字出现的次数 空间复杂度O(n)
//方法二：排序，查看每个元素右边元素是否与他相同 空间复杂度O(1) 时间复杂度取决于排序算法
//方法三：原地排序，把每个数字放在他应该在的位置，如果他应该在的位置的数字已经正确，那么这个数字就是重复的时间复杂度O(n)，空间复杂度O(1)
public class Q3 {

    public static int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < nums.length) {
            int currentNum = nums[i];
            if (nums[currentNum] == currentNum && currentNum != i) {
                return currentNum;
            } else {
                int temp = nums[currentNum];
                nums[currentNum] = currentNum;
                nums[i] = temp;
                if (nums[i] == i) {
                    i++;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(test));
    }
}
