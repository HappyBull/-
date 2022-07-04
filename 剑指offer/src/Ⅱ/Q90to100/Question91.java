package Ⅱ.Q90to100;

import java.util.Arrays;

/**
 * @author zouzh
 * @date 2022/6/25 17:02
 */

public class Question91 {
    /**
     * 简单的动态规划
     * 当前最小的dp[i]等于 当前选择颜色的钱cout + dp[i-1]
     * dp[i]有三种情况，可以整合成一个动态方程
     * @param costs
     * @return
     */
    public int minCost(int[][] costs) {
        int n = costs.length;
        int[] dp = new int[3];
        for (int j = 0; j < 3; j++) {
            dp[j] = costs[0][j];
        }
        for (int i = 1; i < n; i++) {
            int[] dpNew = new int[3];
            for (int j = 0; j < 3; j++) {
                dpNew[j] = Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + costs[i][j];
            }
            dp = dpNew;
        }
        return Arrays.stream(dp).min().getAsInt();
    }

    public static void main(String[] args) {

    }
}
