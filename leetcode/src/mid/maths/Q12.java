package mid.maths;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouzh
 * @date 2022/4/10 21:16
 */

//整数转罗马数字
public class Q12 {

    //模拟实际的转换过程，类似于贪心算法，每次都取最大的部分
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        for (int i = 0; i < values.length; ++i) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }


    //将1-3999编码出来
//    String[] thousands = {"", "M", "MM", "MMM"};
//    String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//    String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//    String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//    public String intToRoman(int num) {
//        StringBuffer roman = new StringBuffer();
//        roman.append(thousands[num / 1000]);//千位
//        roman.append(hundreds[num % 1000 / 100]); 百位
//        roman.append(tens[num % 100 / 10]); 十位
//        roman.append(ones[num % 10]); 个位
//        return roman.toString();
//    }

    public static void main(String[] args) {

    }
}
