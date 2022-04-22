package dayExercises;

/**
 * @Author zouz
 * @Date 2022/4/19 15:43
 */

/**
 * 字符串的最短距离
 */
public class Question821 {
    public static int[] shortestToChar(String s, char c) {
        /**
         * 两次遍历，第一次从左往右遍历到c之后更新数组内容
         * 第二次遍历去第一次遍历结果和当前遍历结果的最小值
         */
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;

//        int [] result = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            if (c == s.charAt(i)) {
//                result[i] = 0;
//                continue;
//            }
//            int pre = i - 1, after = i + 1;
//            while (pre >=0 || after < s.length()) {
//                if (pre >= 0) {
//                    if (s.charAt(pre) == c) {
//                        result[i] = i - pre;
//                        break;
//                    }else {
//                        pre--;
//                    }
//                }
//
//                if (after < s.length()) {
//                    if (s.charAt(after) == c) {
//                        result[i] = after - i;
//                        break;
//                    }else {
//                        after++;
//                    }
//                }
//            }
//        }
//        return result;
    }

    public static void main(String[] args) {
        shortestToChar("loveleetcode",'e');
    }
}
