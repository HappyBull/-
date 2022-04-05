package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/5 23:23
 */

//二进制表示中质数个计算置位
public class Question762 {

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int x = left; x <= right; ++x) {
            //另外根据right的范围得知1的个数不会超过十九个 2 3 5 7 11 13 17 19
            //可以用一个二进制数 mask = 665772 = 10100010100010101100 来存贮这些质数，第i位就表示i为质数
            if (((1 << Integer.bitCount(x)) & 665772) != 0) {
                ans++;
            }
//            if (isPrime(Integer.bitCount(x))) {
//                ++ans;
//            }
        }
        return ans;
    }

    //判断是否是质数
    //可以暴力破解
    //另外根据right的范围得知1的个数不会超过十九个 2 3 5 7 11 13 17 19
    //可以用一个二进制数 mask = 665772 = 10100010100010101100 来存贮这些质数，第i位就表示i为质数
    private boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
