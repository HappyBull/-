package dayExercises;

import java.util.Arrays;

/**
 * @Author zouz
 * @Date 2022/4/14 19:17
 */
//资产最大的客户
public class Q1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        Q1672 q = new Q1672();
        q.maximumWealth(new int[][]{{1,2,3}, {3, 2, 1}});
    }
}
