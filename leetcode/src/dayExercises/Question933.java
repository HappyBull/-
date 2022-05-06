package dayExercises;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author zouzh
 * @date 2022/5/6 22:15
 */

public class Question933 {
    Queue<Integer> queue;

    public Question933() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {

    }
}
