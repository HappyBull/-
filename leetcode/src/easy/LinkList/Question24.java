package easy.LinkList;

import common.ListNode;

/**
 * @Author zouz
 * @Date 2022/6/23 15:35
 */
public class Question24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
