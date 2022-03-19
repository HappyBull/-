package Q11to20;

/**
 * @author zouzh
 * @date 2022/2/26 21:58
 */
//二进制中1的个数
public class Q15 {

    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        int res = 0;
        while (n != 0) {//若 n & 1 = 0n，则 n 二进制 最右一位 为 0 ；
            //若 n & 1 = 1 ，则 n 二进制 最右一位 为 1 。
            res += n & 1;
            n = n >>> 1; //n右移一位
        }

        //巧用 n & (n - 1)
        //          n = 10101000
        //      n - 1 = 10100111
        //n & (n - 1) = 10100000相当于直接消掉最后一个1
        while (n != 0) {
            res++;
            n = n & (n - 1);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
