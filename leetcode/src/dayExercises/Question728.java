package dayExercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zouz
 * @Date 2022/3/31 13:57
 */
//自然数指的是每一位都可以被自身整除的数
public class Question728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
