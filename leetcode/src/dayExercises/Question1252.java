package dayExercises;

/**
 * @Author zouz
 * @Date 2022/7/12 17:04
 */
public class Question1252 {
    /**
     * 直接模拟一个矩阵
     * @param m
     * @param n
     * @param indices
     * @return
     */
    public int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] temp = new int[m][n];
        for (int[] indice : indices) {
            for (int i = 0; i < n; i++) {
                temp[indice[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                temp[i][indice[1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (temp[i][j] % 2 == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * 模拟空间优化，用两个数组记录每行每列各被加了几次
     * @param m
     * @param n
     * @param indices
     * @return
     */
    public int oddCells2(int m, int n, int[][] indices) {
        int result = 0;
        int[] rows = new int[m];
        int[] lines = new int[n];
        for (int[] index : indices) {
            rows[index[0]]++;
            lines[index[1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + lines[j]) % 2 == 1) {
                    result++;
                }
            }
        }
        return result;
    }
}
