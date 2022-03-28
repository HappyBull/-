package dayExercises;

/**
 * @Author zouz
 * @Date 2022/3/28 9:35
 */

/**
 * 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
 */
public class Question693 {
    //两个方向，一种是模拟二进制运算，对数字进行模2取余
    //另一种是进行位运算
//    public boolean hasAlternatingBits(int n) {
//        if (n == 0) {
//            return true;
//        }
//        int present = n%2;
//        n = n/2;
//        while (n != 0) {
//            if (present == n%2) {
//                return false;
//            }
//            present = n%2;
//            n = n/2;
//        }
//        return true;
//    }

    //位运算方法1，同上,每次向右移动一位，然后和1做与运算就可以知道最后一位是0还是1
//    public static boolean hasAlternatingBits(int n) {
//        if (n == 0) {
//            return true;
//        }
//        boolean pre = (n & 1) == 1;
//        n >>=1;
//        while (n != 0) {
//            if (pre == ((n & 1) == 1)) {
//                return false;
//            }
//            pre = (n & 1) == 1;
//            n >>=1;
//        }
//        return true;
//    }
    //高端移位操作
    //如果一个数的二进制满足条件，那么他右移1位也满足条件
    //那么a = n ^ (n>>1) 就为全1
    //a+1 为第一个字符为1其他为0
    //和a做与运算应该为全0
    //举例 10101010 n
    //     1010101  n>>1
    //   011111111   n ^ (n>>1)
    //   100000000  a+1
    public static boolean hasAlternatingBits(int n) {
        long a = n ^ (n>>1);
        return (a & (a + 1)) == 0;
    }

    public static void main(String[] args) {
        hasAlternatingBits(11);
    }

}
