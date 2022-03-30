package mid.string;

/**
 * @Author zouz
 * @Date 2022/3/28 15:43
 */

public class Question8 {
    public static int myAtoi(String s) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index++;
            }else {
                break;
            }
        }
        s = s.substring(index);

        String first = "";
        if (s.charAt(0) =='-' || s.charAt(0) =='+') {
            first = s.substring(0,1);
            s = s.substring(1);
        }

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp.append(s.charAt(i));
                long result = Long.parseLong(first+temp);
                if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }else {
                break;
            }
        }
        if (temp.length() == 0) {
            return 0;
        }
        long result = Long.parseLong(first+temp);

        return (int)result;
    }

    public static void main(String[] args) {
        myAtoi("20000000000000000000");
//        System.out.println(Long.parseLong("+100"));
    }
}
