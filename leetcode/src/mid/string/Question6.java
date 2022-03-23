package mid.string;

/**
 * @Author zouz
 * @Date 2022/3/23 15:33
 */

/**
 * Z 字形变换
 * 给定字符串 PAYPALISHIRING 行数为3时
 * 排序P A H N
 *     APLSIIG
 *     Y I R
 * 输出PAHNAPLSIIGYIR 水平逐行输出
 *
 * 分析：行数为输入n 那列数即为 1+（n-2） = n-1为一组
 * 一组有n+n-2 = 2n-2个字符
 * 变换后数组水平长度  字符串长度/(2n-2) * (n-1) + (n-1)最后一个n-1可以通过具体运算剩余字符数来规定
 * 定义char[i][j]
 * 当j%(n-1) = 0时，填入char[i][j]
 * 否则填入char[n-(j%(n-1)-1)]
 */
public class Question6 {
    public static String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows==1) {
            return s;
        }
        int len = (s.length()/(2*numRows-2)) * (numRows-1 )+ numRows -1;
        char[][] temp = new char[numRows][len];
        int start = 0;
        for (int i = 0; i < len; i++) {
            if (start == s.length()) {
                break;
            }
            if (i%(numRows-1) == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (start == s.length()) {
                        break;
                    }
                    temp[j][i] = s.charAt(start);
                    start++;
                }
            }else {
                temp[numRows-1-(i%(numRows - 1))][i] = s.charAt(start);
                start++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < len; j++) {
                char c = temp[i][j];
                if (temp[i][j] > 0) {
                    result.append(temp[i][j]);
                }
            }

        }
        return result.toString();
    }


    //直接构造法，研究每个非空字符会对应到s的哪个下标
    //变换周期t = 2r-2
    //矩阵第一行下表idx为t倍数
    //最后一行idx 对t取余后为 r-1
    //对于矩阵的其余行（行号设为 i），每个周期内有两个字符，第一个字符满足idx=i(modt)，第二个字符满足 idx=t−i(modt)
    public static String convertIndex(String s, int numRows) {
        int len = s.length();
        int r = numRows;
        if (r == 1 || r>len) {
            return s;
        }
        int t = 2*r-2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < r; i++) {
            int index = i;
            if (i == 0 || i == (r-1)) {//第一行或最后一行
                while (index< len) {
                    result.append(s.charAt(index));
                    index +=t;
                }
            }else {//其他行
                int next = t-i;
                while (index< len) {
                    result.append(s.charAt(index));
                    if (next < len) {
                        result.append(s.charAt(next));
                        next+=t;
                    }
                    index +=t;
                }
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING",3));
        System.out.println(convertIndex("PAYPALISHIRING"
                ,4));

    }
}
