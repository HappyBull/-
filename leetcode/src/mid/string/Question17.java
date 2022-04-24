package mid.string;

/**
 * @Author zouz
 * @Date 2022/4/24 14:05
 */

import java.util.*;

/**
 * 电话号码的字母组合
 * 队列遍历
 */
public class Question17 {

    public List<String> letterCombinations(String digits) {
        Map<Character,char[]> chars = new HashMap<>();
        chars.put('2', new char[]{'a', 'b', 'c'});
        chars.put('3', new char[]{'d', 'e', 'f'});
        chars.put('4', new char[]{'g', 'h', 'i'});
        chars.put('5', new char[]{'j', 'k', 'l'});
        chars.put('6', new char[]{'m', 'n', 'o'});
        chars.put('7', new char[]{'p', 'q', 'r', 's'});
        chars.put('8', new char[]{'t', 'u', 'v'});
        chars.put('9', new char[]{'w', 'x', 'y', 'z'});

        Queue<String> result = new LinkedList<>();
        if ("".equals(digits)) {
            return new ArrayList<>();
        }
        for (int i = 0; i < digits.length(); i++) {
            int length = result.size();
            char [] nextChars = chars.get(digits.charAt(i));
            if (length == 0) {
                for (int j = 0; j < nextChars.length; j++) {
                    result.add(String.valueOf(nextChars[j]));
                }
            }else {
                for (int j = 0; j < length; j++) {
                    String temp = result.poll();
                    for (int k = 0; k < nextChars.length; k++) {
                        result.offer(temp + String.valueOf(nextChars[k]));
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        Question17 q = new Question17();
        q.letterCombinations("23");
    }

}
