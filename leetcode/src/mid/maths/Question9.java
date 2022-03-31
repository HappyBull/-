package mid.maths;

/**
 * @Author zouz
 * @Date 2022/3/31 14:23
 */
//判断一个数字是不是回文数,正读和倒读是一样的
public class Question9 {
    //这个也可以转换成字符串进行暴力求解
//    public boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//        String oldNum = String.valueOf(x);
//        StringBuilder sb = new StringBuilder(String.valueOf(x));
//        sb.reverse();
//        if (!sb.toString().equals(oldNum)) {
//            return false;
//        }
//        return true;
//    }

    //翻转后半部分字符串
    public static boolean isPalindrome(int x) {
        //如果小于0或者最后一位为0都不符合
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverNum = 0;
        while (x > reverNum ) {
            reverNum = reverNum*10 + x%10;
            x/=10;
        }
        //x为偶数位              x位奇数位
        return x==reverNum || x==reverNum/10;
    }

    public static void main(String[] args) {
        isPalindrome(1221);
    }
}
