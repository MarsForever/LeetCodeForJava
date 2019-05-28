package Solutions;

import Execute.ListNode;

public class Solution876MiddleofTheLinkedList {
	public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int i = 0;
        while(cur != null){
            i++;
//            System.out.println(cur);
            cur = cur.next;
            
        }
        for(int j = 0 ; j < i/2 ; j++){
            head = head.next;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution876MiddleofTheLinkedList test = new Solution876MiddleofTheLinkedList();
		ListNode data = new ListNode(1);
		data.next = new ListNode(2);
		data.next.next = new ListNode(3);
		data.next.next.next = new ListNode(4);
		data.next.next.next.next = new ListNode(5);
		System.out.println(test.middleNode(data));
	}

}
