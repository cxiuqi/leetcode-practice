package leetcode75;

public class DeleteMiddleNodeOfLinkedList {

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode deleteMiddle(ListNode head) {
		if(head == null){
			return head;
		}
		int count = 0; 
		ListNode curr = head;
		while(curr != null){
			count++;
			curr = curr.next;
		}
		if(count == 1){
			head = null;
			return head;
		}
		int index = count/2;
		curr = head;
		for(int i = 0; i < index-1; i++){
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}
	
	public ListNode deleteMiddle1(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
