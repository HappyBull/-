package dayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zouzh
 * @date 2022/5/29 14:02
 */

public class Question468 {
    public static String IPv4 = "IPv4";
    public static String IPv6 = "IPv6";
    public static String Neither = "Neither";
    public static List<Character> valid = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'A', 'B', 'C', 'D', 'E', 'F');

    public String validIPAddress(String queryIP) {
        if (queryIP.length() == 0 || queryIP.charAt(queryIP.length() - 1) == '.' || queryIP.charAt(queryIP.length() - 1) == ':') {
            return Neither;
        }
        if (queryIP.contains(".")) {
            return isIPv4(queryIP);
        } else {
            return isIPv6(queryIP);
        }
    }

    public String isIPv4(String queryIP) {
        String[] strings = queryIP.split("\\.");
        if (strings.length != 4) {
            return Neither;
        }
        int[] temp = new int[4];
        try {
            for (int i = 0; i < temp.length; i++) {
                if (strings[i].length() > 1 && strings[i].charAt(0) == '0') {
                    return Neither;
                }
                temp[i] = Integer.parseInt(strings[i]);
                if (temp[i] < 0 || temp[i] > 255) {
                    return Neither;
                }
            }
        } catch (Exception e) {
            return Neither;
        }
        return IPv4;
    }

    public String isIPv6(String queryIP) {
        String[] strings = queryIP.split("\\:");
        if (strings.length != 8) {
            return Neither;
        }
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            if (temp.length() > 4 || temp.length() < 1) {
                return Neither;
            } else {
                for (int j = 0; j < temp.length(); j++) {
                    if (!valid.contains(temp.charAt(j))) {
                        return Neither;
                    }
                }
            }
        }
        return IPv6;
    }

    public static void main(String[] args) {
        Question468 q = new Question468();
        System.out.println(q.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }
}
