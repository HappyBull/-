package mid.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author zouz
 * @Date 2022/4/24 15:41
 */
public class Question20 {
    public boolean isValid(String s) {
        if (s.length()%2 !=0) {
            return false;
        }
        Stack<Character> temp = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c== '{' || c == '[') {
                temp.push(c);
            }else {
                if (temp.size() == 0 || !map.get(c).equals(temp.pop())) {
                    return false;
                }
            }
        }

        if (temp.size() > 0) {
            return false;
        }
        return true;
    }
}
