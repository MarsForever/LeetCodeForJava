package Solutions;

import Execute.ListNode;

public class Solution206ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution206ReverseLinkedList test = new Solution206ReverseLinkedList();
		ListNode data = new ListNode(1);
		data.next = new ListNode(2);
		data.next.next = new ListNode(3);
		data.next.next.next = new ListNode(4);
		data.next.next.next.next = new ListNode(5);
		System.out.println(test.reverseList(data));

	}

}
