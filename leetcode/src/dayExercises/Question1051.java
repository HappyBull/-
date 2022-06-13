package dayExercises;

import java.util.Arrays;

/**
 * @author zouzh
 * @date 2022/6/13 21:45
 */

public class Question1051 {
    public int heightChecker(int[] heights) {
        int n = heights.length, ans = 0;
        int[] expected = new int[n];
        System.arraycopy(heights, 0, expected, 0, n);
        Arrays.sort(expected);
        for (int i = 0; i < n; ++i) {
            if (heights[i] != expected[i]) {
                ++ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Question1051 question1051 = new Question1051();
        question1051.heightChecker(new int[] {
                1,5,3
        });
    }
}
