package Ⅰ.Q11to20;

/**
 * @author zouzh
 * @date 2022/2/26 21:21
 */

//绳子剪成多段的最大乘积
//动态规划和贪心，贪心要数学推导最大值
public class Q14_1 {

    public int cuttingRope(int n) {
        int[] p = new int[n + 1];
        p[1] = 1;
        p[2] = 2;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int temp = Math.max(p[j] * (i - j), j * (i - j));
                p[i] = Math.max(p[i], temp);
            }
        }
        return p[n];
    }

    //贪心算法，利用数学公式或者手动推导
    public int cuttingRope2(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }


    public static void main(String[] args) {

    }
}
