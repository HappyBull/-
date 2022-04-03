package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/3 21:43
 */

//寻找比目标字母大的最小字母
public class Question744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {

    }
}
