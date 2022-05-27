package dayExercises;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zouzh
 * @date 2022/4/10 21:06
 */

//唯一摩尔斯密码词
public class Question804 {
    public static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<String>();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                code.append(MORSE[c - 'a']);
            }
            result.add(code.toString());
        }
        return result.size();
    }

    public static void main(String[] args) {

    }
}
