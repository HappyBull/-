package dayExercises;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author zouz
 * @Date 2022/7/13 16:56
 */
public class Question735 {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int aster : asteroids) {
            boolean isAlive = true;//当前星星是否爆炸了
            while (isAlive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
                isAlive = stack.peek() < -aster;
                if (stack.peek() <= -aster) {
                    stack.pop();//栈顶行星爆炸
                }
            }
            if (isAlive) {
                stack.push(aster);
            }
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
