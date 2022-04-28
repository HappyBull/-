package mid.string;

/**
 * @author zouzh
 * @date 2022/4/26 22:37
 */

public class Question14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }else if (strs.length == 1) {
            return strs[0];
        }
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || first.charAt(i) != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
