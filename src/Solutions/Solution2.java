package Solutions;

import Execute.ListNode;

public class Solution2 {
	ListNode reverse(ListNode node) { 
		ListNode prev = null; 
		ListNode current = node; 
		ListNode next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Solution2 test1 = new Solution2();
		ListNode result = new ListNode((l1.val + l2.val) % 10);
		result.next     = new ListNode((l1.next.val + l2.next.val) % 10);
		result.next.next     = new ListNode((l1.next.next.val + l2.next.next.val) % 10);
		return test1.reverse(result);
    }
	
//	http://www.cnblogs.com/grandyang/p/4129891.html
}
