package leetcode75;

import leetcode75.DeleteMiddleNodeOfLinkedList.ListNode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            // curr = curr.next;
            curr = temp;
        }
        return prev;
    }
}
