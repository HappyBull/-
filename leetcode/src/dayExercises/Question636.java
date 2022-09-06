package dayExercises;

/**
 * @author zouzh
 * @date 2022/8/7 20:26
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * 函数独占时间
 */
public class Question636 {
    public static void main(String[] args) {

    }

    public int[] exclusiveTime(int n, List<String> logs) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] res = new int[n];
        for (String log : logs) {
            String[] splits = log.split("\\:");
            int idx = Integer.parseInt(splits[0]);
            String type = splits[1];
            int timeStamp = Integer.parseInt(splits[2]);
            if ("start".equals(type)) {
                //判断是否有线程在运行，有的话就停止他
                if (!stack.isEmpty()) {
                    res[stack.peek()[0]] += timeStamp - stack.peek()[1];
                }
                stack.push(new int[]{idx, timeStamp});
            } else {
                int[] t = stack.pop();
                res[t[0]] += timeStamp - t[1] + 1;
                //每次执行完一个之后，都认为他上一个执行的是重新开始执行
                if (!stack.isEmpty()) {
                    stack.peek()[1] = timeStamp + 1;
                }
            }
        }
        return res;
    }
}
