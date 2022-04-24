package mid.linkList;

import common.ListNode;

/**
 * @Author zouz
 * @Date 2022/4/24 14:37
 */
public class Question19 {

    /**
     * 方法1 两次遍历，第一次求出长度，第二次去除指定节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode empty = new ListNode(0, head);//引入新的头节点
        while (head != null) {
            length++;
            head = head.next;
        }

        ListNode current = empty;
        for (int i = 0; i < length - n; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return empty.next;
    }

    /**
     * 方法2 双指针
     * 第一个指针比第二个指针快n
     * 当第一个指针遍历到尾部，第二个指针就遍历到需要跳过的节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode empty = new ListNode(0, head);//引入新的头节点
        ListNode pre = empty;
        for (int i = 0; i < n; i++) {
            pre = pre.next;
        }
        ListNode after = empty;
        while (pre.next != null) {
            pre = pre.next;
            after = after.next;
        }
        after.next = after.next.next;
        return empty.next;
    }

    /**
     * 第三种方法利用栈或者队列的思想
     * 类似于两次遍历
     * 第一次遍历后把节点压入队列中
     * 出队列的时候跳过第n个节点
     */

    public static void main(String[] args) {
        ListNode head5 = new ListNode(5,null);
        ListNode head4 = new ListNode(4,head5);
        ListNode head3 = new ListNode(3,head4);
        ListNode head2 = new ListNode(2,head3);
        ListNode head1 = new ListNode(1,head2);
        Question19 q = new Question19();
        q.removeNthFromEnd2(head1,2);
    }
}
