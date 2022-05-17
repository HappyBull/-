package dayExercises;

/**
 * @author zouzh
 * @date 2022/5/9 20:56
 */

/**
 * 增减字符串匹配
 * 如果为i就继续从小开始叉，如果为D就继续从大开始插
 */
public class Question942 {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int min = 0;
        int max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min;
                min++;
            } else {
                result[i] = max;
                max--;
            }
        }
        result[s.length()] = min;
        return result;
    }
    public static void main(String[] args) {

    }
}
