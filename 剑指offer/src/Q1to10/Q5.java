package Q1to10;

/**
 * @author zouzh
 * @date 2022/2/23 16:27
 */
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"
public class Q5 {

    public static String replaceSpace(String s) {
        if (s == null || s.equals("")) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result.append("%20");
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
