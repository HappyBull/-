package dayExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author zouz
 * @Date 2022/7/7 15:38
 */
public class Question648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(dictionary, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
        String[] sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            String word = sentences[i];
            for(String data : dictionary) {
                if (word.indexOf(data) == 0 && data.length() < word.length()) {
                    sentences[i] = data;
                    break;
                }
            }
            sb.append(sentences[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Question648 question648 = new Question648();
        question648.replaceWords(Arrays.asList("as","abc","ac"),"ab as");
    }
}
