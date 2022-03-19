package Q1to10;

/**
 * @author zouzh
 * @date 2022/2/25 15:37
 */

//斐波那契数列，可以用递归，也可以动态规划
//动态规划要找到状态转移方程和初始态
public class Q10 {

    //动态规划，滑动窗口，每次的result都等于前两个数之和
    public int fib(int n) {
        final int mod = 1000000007;
        if (n < 2) {
            return  n;
        }
        int p,q = 0; int result = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = result;
            result = (p+q)%mod;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
