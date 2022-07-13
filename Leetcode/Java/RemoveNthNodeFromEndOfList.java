
public class RemoveNthNodeFromEndOfList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode iter = head;
        while(iter.next != null){
            iter = iter.next;
            count++;
        }
        if(count == 1){
            return null;
        }
        count = count - n;
        iter = head;
        while(count > 1){
            iter = iter.next;
            count--;
        }
        
        iter.next = iter.next.next;
        return head;
    }

	public static void main(String[] args) {
		//ListNode listnode = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, null)))));
		
		

	}

}
