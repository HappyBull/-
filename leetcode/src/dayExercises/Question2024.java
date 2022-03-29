package dayExercises;

/**
 * @author zouzh
 * @date 2022/3/29 11:04
 */

//滑动窗口
public class Question2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(max(answerKey, k, 'T'), max(answerKey, k, 'F'));
    }

    //这种方法要维护两个滑动窗口
    public int max(String answerKey, int k, char ch) {
        int n = answerKey.length();
        int ans = 0;
        for (int left = 0, right = 0, sum = 0; right < n; right++) {
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while (sum > k) {
                sum -= answerKey.charAt(left) != ch ? 1 : 0;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return 0;
    }

    //维护一个滑动窗口，在窗口内如果t和f都大于k返回结果
    public int max(String answerKey, int k) {
        int n = answerKey.length();
        int ans = 0;
        for (int left = 0, right = 0, numT = 0, numF = 0; right < n; right++) {
            if (answerKey.charAt(right) == 'T') {
                numT += 1;
            } else {
                numF += 1;
            }
            while (numT > k && numF > k) {
                if (answerKey.charAt(left) == 'T') {
                    numT -= 1;
                } else {
                    numF -= 1;
                }
                left--;
            }
            ans = Math.max(ans, numT + numF);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
