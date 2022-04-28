package mid.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zouz
 * @Date 2022/4/27 14:10
 */
public class Question22 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateParenthesis(n, n, "");
        return result;
    }

    public void generateParenthesis(int left, int right, String temp) {
        if (left == 0 && right == 0) {
            result.add(temp); //结果之一
            return;
        } else {
            if (left >= right) {
                generateParenthesis(--left, right, temp + "(");//左括号数量小于等于右括号的数量，此时只能添加左括号
            } else {
                generateParenthesis(left, right - 1, temp + ")");//左括号数量大于右括号数量一定可以添加一个右括号
                if (left > 0) {
                    generateParenthesis(left - 1, right, temp + "(");//如果左括号数量不大于n，那么也可以添加继续添加左括号
                }
            }
        }
    }

    public static void main(String[] args) {
        Question22 q = new Question22();
        q.generateParenthesis(2);
    }
}
