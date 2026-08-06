package lec_39;

public class LinkedList_Cycle_141_leetcode {

	
	// Floyed Cycle detection algorithm
	
	public class Solution{
		public boolean hasCycle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while( fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					return true;
				}
			}
			return false;
		}
	}
}
