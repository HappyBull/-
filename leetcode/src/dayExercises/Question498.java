package dayExercises;

/**
 * @Author zouz
 * @Date 2022/6/14 10:13
 */
public class Question498 {
    public int[] findDiagonalOrder(int[][] mat) {
//        int[] result = new int[mat.length * mat[0].length];
//        int m = 0, n = 0, num = 0,sum = 1;//sum表示第几条对角线
//        while ((m < mat.length || n < mat[0].length) && m >= 0 && n >= 0) {
//            if (m < mat.length && n < mat[0].length) {
//                result[num] = mat[m][n];
//                num++;
//            }
//            if (m == 0 && sum % 2 !=0) {
//                n++;
//                sum++;
//            } else if (n == 0 && sum %2 == 0) {
//                m++;
//                sum++;
//            } else {
//                if (sum % 2 == 0) {
//                    m++;
//                    n--;
//                }else {
//                    n++;
//                    m--;
//                }
//            }
//        }
//        return result;
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int pos = 0;
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 1) {
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    res[pos] = mat[x][y];
                    pos++;
                    x++;
                    y--;
                }
            } else {
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    res[pos] = mat[x][y];
                    pos++;
                    x--;
                    y++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Question498 question498 = new Question498();
        question498.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
