package leetcode75;

import leetcode75.DeleteMiddleNodeOfLinkedList.ListNode;

public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        if (head.next.next == null) return head;

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddCurr = oddHead;
        ListNode evenCurr = evenHead;

        while(oddCurr != null){
            ListNode temp = oddCurr.next; // since it got removed
            if(oddCurr.next != null){
                oddCurr.next = oddCurr.next.next;
            }
            evenCurr.next = temp;
            evenCurr = evenCurr.next;
            if(oddCurr.next == null) break;
            oddCurr = oddCurr.next;
        }        
        oddCurr.next = evenHead;
        return oddHead;
    }
}
