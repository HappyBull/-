package dayExercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouzh
 * @date 2022/8/11 22:37
 */

public class Question1417 {
    public static void main(String[] args) {
        Question1417 question1417 = new Question1417();
        question1417.reformat("a0b1c2");
    }

    public String reformat(String s) {
        List<Character> character1 = new ArrayList<>();
        List<Character> character2 = new ArrayList<>();
        if (s == null || s.equals("")) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                character1.add(s.charAt(i));
            } else {
                character2.add(s.charAt(i));
            }
        }
        if (Math.abs(character1.size() - character2.size()) > 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        if (character1.size() > character2.size()) {
            result.append(character1.get(0));
            for (int i = 0; i < character2.size(); i++) {
                result.append(character2.get(i)).append(character1.get(i + 1));
            }
        } else if (character1.size() < character2.size()){
            result.append(character2.get(0));
            for (int i = 0; i < character1.size(); i++) {
                result.append(character1.get(i)).append(character2.get(i + 1));
            }
        } else {
            for (int i = 0; i < character1.size(); i++) {
                result.append(character1.get(i)).append(character2.get(i));
            }
        }
        return result.toString();
    }
}
