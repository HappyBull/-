package Q1to10;

/**
 * @author zouzh
 * @date 2022/2/25 15:58
 */

//青蛙跳台阶，本质是斐波那契数列
public class Q10_2 {

    public static int numWays(int n) {
        if (n == 0 || n==1) {
            return 1;
        }
        int [] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = (f[i-1] + f[i-2]) % 1000000007;
        }
        return f[n];
    }

    public static void main(String[] args) {
        numWays(3);
    }
}
