package dayExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zouz
 * @Date 2022/6/14 11:04
 */
public class Question890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String s : words) {
            if (match(s, pattern) && match(pattern, s)) {
                result.add(s);
            }
        }
        return result;
    }

    public boolean match(String s1, String s2) {
        Map<Character, Character> temp = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (temp.containsKey(c1)) {
                if (temp.get(c1) != c2) {
                    return false;
                }
            } else {
                temp.put(c1, c2);
            }
        }
        return true;
    }
}
