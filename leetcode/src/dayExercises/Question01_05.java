package dayExercises;

/**
 * @Author zouz
 * @Date 2022/5/13 17:35
 */
public class Question01_05 {
    public boolean oneEditAway(String first, String second) {
        if (first.equals(second)) {
            return true;
        }
        if (first.length() == second.length()) {
            return sameLength(first, second);
        } else if (first.length() - second.length() == 1) {
            return notSameLength(second, first);
        } else if (second.length() - first.length() == 1) {
            return notSameLength(first, second);
        }
        return false;
    }

    public boolean sameLength(String s1, String s2) {
        int changeNum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                changeNum++;
                if (changeNum > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean notSameLength(String shortString, String longString) {
        if (longString.length() == 1) {
            return true;
        }

        for (int i = 0; i < shortString.length(); i++) {
            if (shortString.charAt(i) != longString.charAt(i)) {
                if (shortString.substring(i).equals(longString.substring(i + 1))) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Question01_05 q = new Question01_05();
        q.oneEditAway("mart", "karma");
    }
}
