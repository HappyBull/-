package dayExercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zouz
 * @Date 2022/4/18 9:34
 */

/**
 * 字典序排数，重要的思路是依据字典序遍历
 */
public class Question386 {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        int number = 1;
        for (int i = 0; i < n; i++) {
            ret.add(number);
            if (number * 10 <= n) {
                number *= 10;
            } else {
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                number++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Question386 question386 = new Question386();
        List<Integer> result = question386.lexicalOrder(101);
        result.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
