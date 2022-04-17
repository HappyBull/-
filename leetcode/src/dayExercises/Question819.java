package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/17 10:57
 */

import java.util.*;

/**
 * 最常见的单词
 */
public class Question819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        String word = "";
        List<String> ban = Arrays.asList(banned);
        Map<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) >= 'A' && paragraph.charAt(i) <= 'z') {
                word += paragraph.charAt(i);
            } else {
                if (!"".equals(word)) {
                    word = word.toLowerCase();
                    if (!ban.contains(word)) {
                        counts.put(word, counts.getOrDefault(word, 0) + 1);
                    }
                    word = "";
                }
            }
        }

        if (!"".equals(word)) {
            word = word.toLowerCase();
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        Iterator<String> iterator = counts.keySet().iterator();
        int temp = 0;
        String next;
        while (iterator.hasNext()) {
            next = iterator.next();
            if (counts.get(next) > temp) {
                temp = counts.get(next);
                word = next;
            }
        }

        return word;

    }

    public static void main(String[] args) {
        Question819 q = new Question819();
//        q.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
        q.mostCommonWord("Bob", new String[]{});
    }
}
