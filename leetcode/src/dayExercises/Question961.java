package dayExercises;

/**
 * @author zouzh
 * @date 2022/5/21 23:15
 */

import java.util.HashSet;
import java.util.Set;

/**
 * hash表或者数学规律
 */
public class Question961 {

//    public int repeatedNTimes(int[] nums) {
//        Set<Integer> found = new HashSet<Integer>();
//        for (int num : nums) {
//            if (!found.add(num)) {
//                return num;
//            }
//        }
//        // 不可能的情况
//        return -1;
//    }


    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for (int gap = 1; gap <= 3; ++gap) {
            for (int i = 0; i + gap < n; ++i) {
                if (nums[i] == nums[i + gap]) {
                    return nums[i];
                }
            }
        }
        // 不可能的情况
        return -1;
    }

    public static void main(String[] args) {

    }
}
