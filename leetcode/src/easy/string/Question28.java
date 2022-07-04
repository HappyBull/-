package easy.string;

/**
 * @Author zouz
 * @Date 2022/6/23 15:19
 */
public class Question28 {
    public static int strStr(String haystack, String needle) {
        if (haystack == "" || haystack.equals(needle)) {
            return 0;
        } else if (haystack.length() < needle.length()) {
            return -1;
        }

        boolean result = false;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                result = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (!(haystack.charAt(i + j) == needle.charAt(j))) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        strStr("abc", "c");
    }
}
