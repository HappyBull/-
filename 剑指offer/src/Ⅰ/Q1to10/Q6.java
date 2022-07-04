package Ⅰ.Q1to10;

import common.Node;


/**
 * @author zouzh
 * @date 2022/2/23 16:43
 */
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回
public class Q6 {
    public static int[] reversePrint(Node head) {
//        Stack<Integer> temp = new Stack<>();
//        while (head != null) {
//            temp.push(head.val);
//            head = head.next;
//        }
//        int [] result = new int[temp.size()];
//        for (int i = 0; i <result.length ; i++) {
//            result[i] = temp.pop();
//        }
//
//        return result;

        //更高效方法，两次遍历，第一次遍历求出链表长度
        //第二次遍历，倒序将数据插入数组
        //更小的空间复杂度

        Node node = head;
        int count = 0;
        while (node != null) {
            ++count;
            node = node.next;
        }
        int[] nums = new int[count];
        node = head;
        for (int i = count - 1; i >= 0; --i) {
            nums[i] = node.val;
            node = node.next;
        }

        return nums;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(2);
        a.next = b;
        b.next = c;
        System.out.println(reversePrint(a));
    }
}
