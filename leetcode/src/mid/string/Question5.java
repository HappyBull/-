package mid.string;

/**
 * @Author zouz
 * @Date 2022/3/18 15:45
 */
//最长回文子串
/**
 * 暴力法
 * 中心扩展法
 * 动态规划
 * 高级Manacher 一般不考察，太高级
 */
public class Question5 {

    /*
    动态规划：如果一个字符串是回文  他的子串也是回文
    所以状态转移方程p(i,j) = p(i+1,j-1) & Si == Sj
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) { //回文串一直从2开始到整个字符串长度
            for (int i = 0; i < len; i++) {//枚举左边界
                //由i和L可以去确定又边界
                int j = i+ L - 1;
                if (j >= len) {
                    break;//右边界越界
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                }else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    /*
    中心扩展发，选定一个中心，同时向两边开始扩展，每次扩展的两边如果字母相同就可以继续扩展
     */
    public String lp(String s) {
        if (s == null) {
            return "";
        }else if (s.length() == 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s,i,i);
            int len2 = expand(s, i, i+1);
            int len = Math.max(len1,len2);
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expand(String s,int left,int right) {
        while (left >= 0 && right <s.length() && s.charAt(left) ==s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static void main(String[] args) {

    }
}
