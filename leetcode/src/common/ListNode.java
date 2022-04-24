package common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zouz
 * @Date 2022/4/24 14:30
 */
@Data
public class ListNode {
    @Setter
    @Getter
    public int val;

    @Setter
    @Getter
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
