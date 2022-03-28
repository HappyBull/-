package mid.maths;

/**
 * @Author zouz
 * @Date 2022/3/28 11:34
 */
public class Question7 {
//    public int reverse(int x) {
//        StringBuilder num;
//        long result;
//        if (x ==0) {
//            return 0;
//        }
//        if (x < 0) {
//            num = new StringBuilder(String.valueOf(x));
//            result = Long.parseLong(num.reverse().toString());
//        }else {
//            num = new StringBuilder(String.valueOf(x).substring(1));
//            result = Long.parseLong("-"+num.reverse().toString());
//        }
//        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
//            return 0;
//        }
//        return (int)result;
//
//    }
    //方法二，以此弹出最后一个数，组成新的数字
    public int reverse(int x) {
        int result = 0;
        while (x !=0) {
            if (result<Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10) {
                return 0;
            }
            int digit = x%10;
            x /=10;
            result = result*10 + digit;
        }
        return result;
    }
}
