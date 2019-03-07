package Execute;
import Execute.ListNode;
import Solutions.Solution2;

public class addTwoNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(2);
		list.next = new ListNode(4);
		list.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		
		Solution2 test = new Solution2();
		System.out.println(" 1"+test.addTwoNumbers(list, list2));
	}

}
