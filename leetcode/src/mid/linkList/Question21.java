package mid.linkList;

/**
 * @author zouzh
 * @date 2022/4/26 22:20
 */

import common.ListNode;

/**
 * 合并两个有序链表
 */
public class Question21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                temp.next = list1;
                list1 = list1.next;
            }else {
                if (list1.val > list2.val) {
                    temp.next = list2;
                    list2 = list2.next;
                }else {
                    temp.next = list1;
                    list1 = list1.next;
                }
            }
            temp = temp.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode list4 = new ListNode(4,null);
        ListNode list3 = new ListNode(3,null);
        ListNode list2 = new ListNode(2,list4);
        ListNode list1 = new ListNode(1,list3);
        mergeTwoLists(list1,list2);

    }
}
