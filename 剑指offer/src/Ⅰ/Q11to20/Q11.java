package Ⅰ.Q11to20;

/**
 * @author zouzh
 * @date 2022/2/25 16:43
 */

public class Q11 {

    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]) {
                return numbers[i+1];
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {

    }
}
