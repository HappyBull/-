package Q1to10;

import java.util.Stack;

/**
 * @author zouzh
 * @date 2022/2/25 15:30
 */

//用两个栈实现队列
public class Q9 {

    public static void main(String[] args) {

    }
}

class CQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            return -1;
        }

        return stack2.pop();
    }
}
