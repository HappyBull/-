package easy.maths;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zouz
 * @Date 2022/4/20 14:11
 */
//罗马字母转整数
public class Q13 {

    public int romanToInt(String s) {
        Map<Character,Integer> roamn = new HashMap<>();
        roamn.put('I',1);
        roamn.put('V',5);
        roamn.put('X',10);
        roamn.put('L',50);
        roamn.put('C',100);
        roamn.put('D',500);
        roamn.put('M',1000);
        int result = 0;
        for (int i = s.length() - 1; i >= 0;i--) {
            if (i == s.length() - 1) {
                result+=roamn.get(s.charAt(i));
                continue;
            }
            if (roamn.get(s.charAt(i)) < roamn.get(s.charAt(i+1))) {
                result-=roamn.get(s.charAt(i));
            }else {
                result += roamn.get(s.charAt(i));
            }
        }
        return result;
    }
}
