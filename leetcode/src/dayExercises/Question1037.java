package dayExercises;

/**
 * @author zouzh
 * @date 2022/6/8 17:26
 */

public class Question1037 {
    public boolean isBoomerang(int[][] points) {
        int[] v1 = {points[1][0] - points[0][0], points[1][1] - points[0][1]};
        int[] v2 = {points[2][0] - points[0][0], points[2][1] - points[0][1]};
        return v1[0] * v2[1] - v1[1] * v2[0] != 0;
    }
    public static void main(String[] args) {

    }
}
