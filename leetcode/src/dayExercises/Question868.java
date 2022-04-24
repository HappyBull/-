package dayExercises;

/**
 * @Author zouz
 * @Date 2022/4/24 13:38
 */

/**
 * 二进制间距
 */
public class Question868 {
    public int binaryGap(int n) {
        int result = 0;
        int num = 0;

        boolean start = false;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (start) {
                    result = Math.max(result,num);
                } else {
                    start = true;
                }
                num = 1; //找新的1之后，从1开始计数
            }else {
                if (start) {//只有在之前找到过1，间隔才有意义
                    num++;
                }
            }
            n = n >> 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Question868 q = new Question868();
        System.out.println(q.binaryGap(5));
    }
}
