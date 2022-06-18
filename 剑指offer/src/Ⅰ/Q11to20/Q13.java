package Ⅰ.Q11to20;

/**
 * @author zouzh
 * @date 2022/2/26 19:00
 */

//机器人的运动
//机器人是否可达，每逢坐标发生进位的时候发生突变
//可达的形状类似多个等腰三角
    /*
    m = 4,n = 12 , k = 3
    由图可得，机器人只要尝试向右和向下两种方向，就可以得到所有解
    [1,1,1,0,0,0,0,0,0,0,2,2]  1为可达
    [1,1,0,0,0,0,0,0,0,0,2,0]  0为不满足数位
    [1,0,0,0,0,0,0,0,0,0,0,0]  2为满足数位但不可达
    [0,0,0,0,0,0,0,0,0,0,0,0]
     */
public class Q13 {

    public  int movingCount(int m, int n, int k) {
        int result = 0;
        int[][] map = new int[m][n];
        result = dfs(map, 0, 0, k);
        return result;
    }

    private int dfs(int[][] map, int i, int j, int k) {
        if (i < 0 || j < 0 || i >= map.length || j >= map[0].length || !judge(i, j, k)) {
            return 0;
        }
        if (map[i][j] == 0) {
            map[i][j] = 1;
        } else {
            return 0;
        }

        return 1 + dfs(map, i + 1, j, k) + dfs(map, i, j + 1, k);
    }

    private boolean judge(int m, int n, int k) {
        int sum = 0;
        while (m > 0 || n > 0) {
            sum = sum + (n % 10) + (m % 10);
            if (sum > k) {
                return false;
            }
            n = n / 10;
            m = m / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Q13 q13 = new Q13();
        System.out.println(q13.movingCount(7,2,3));
    }
}
