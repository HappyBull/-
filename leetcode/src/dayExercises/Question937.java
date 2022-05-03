package dayExercises;

import java.util.Arrays;

/**
 * @author zouzh
 * @date 2022/5/3 23:41
 */

public class Question937 {

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (o1, o2) -> compare(o1, o2));
        return logs;
    }

    private int compare(String log1, String log2) {
        int s1 = log1.indexOf(' ') + 1;
        int s2 = log2.indexOf(' ') + 1;
        if (Character.isDigit(log1.charAt(s1)) && Character.isDigit(log2.charAt(s2))) {
            return 0;
        } else if (Character.isDigit(log1.charAt(s1))) {
            return 1;
        } else if (Character.isDigit(log2.charAt(s2))) {
            return -1;
        } else {
            int cmp = log1.substring(s1).compareTo(log2.substring(s2));
            if (cmp == 0) {
                return log1.compareTo(log2);
            } else {
                return cmp;
            }
        }
    }

    public static void main(String[] args) {

    }
}
