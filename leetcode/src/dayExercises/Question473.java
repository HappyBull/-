package dayExercises;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author zouzh
 * @date 2022/6/1 14:38
 */

public class Question473 {
    public boolean makesquare(int[] matchsticks) {
        int sum = IntStream.of(matchsticks).sum();
        if (sum % 4 != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        /**
         * 从大到小进行排序
         */
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }
        int[] edges = new int[4];//记录四条边已有的长度；
        return dfs(0, matchsticks, edges, sum / 4);
    }

    public boolean dfs(int index, int[] matchsticks, int[] edges, int len) {
        if (index == matchsticks.length) {
            return true;
        }
        for (int i = 0; i < edges.length; i++) {
            edges[i] += matchsticks[index];
            if (edges[i] <= len && dfs(index + 1, matchsticks, edges, len)) {
                return true;
            }
            edges[i] -= matchsticks[index];
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
