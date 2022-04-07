package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/7 20:58
 */

public class Question796 {
    public boolean rotateString(String s, String goal) {
        //s+s包含了所有 s旋转的结果
//        return s.length() == goal.length() && (s + s).contains(goal);
        //暴力法
        int m = s.length(), n = goal.length();
        if (m != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s.charAt((i + j) % n) != goal.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
