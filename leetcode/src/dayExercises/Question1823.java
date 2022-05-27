package dayExercises;

/**
 * @author zouzh
 * @date 2022/5/4 19:30
 */

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 找出游戏胜利者
 * 约瑟夫环问题
 * 模拟环形链表
 */
public class Question1823 {
    public int findTheWinner(int n, int k) {
        Queue<Integer> temp = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            temp.offer(i + 1);
        }
        while (temp.size() > 1) {
            for (int i = 1; i < k; i++) {
                temp.offer(temp.poll());//转过k-1个人，每次转一个就把他移到队列最上方
            }
            temp.poll();//第k个出去
        }
        return temp.peek();
    }

    /**
     * 递归
     * f(n, k) = (k + f(n - 1, k) - 1) mod n + 1
     *
     * @param args
     */
//    public int findTheWinner(int n, int k) {
//        if (n == 1) {
//            return 1;
//        }
//        return (k + findTheWinner(n - 1, k) - 1) % n + 1;
//    }
    public static void main(String[] args) {

    }
}
