package dayExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zouzh
 * @date 2022/5/27 14:20
 */

public class Question17_11 {
    public int findClosest(String[] words, String word1, String word2) {
        Map<String, List<Integer>> temp = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (temp.containsKey(word)) {
                temp.get(word).add(i + 1);
            } else {
                List<Integer> cur = new ArrayList<>();
                cur.add(i + 1);
                temp.put(word, cur);
            }
        }
        List<Integer> list1 = temp.get(word1);
        List<Integer> list2 = temp.get(word2);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                min = Math.min(min, Math.abs(list1.get(i) - list2.get(j)));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Question17_11 q = new Question17_11();
        String[] words = {"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"};
        q.findClosest(words, "a", "student");
    }
}
