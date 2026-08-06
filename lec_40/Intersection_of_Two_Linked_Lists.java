package lec_40;

//import lec_40.Merge_Two_Sorted_Lists.ListNode;

public class Intersection_of_Two_Linked_Lists {


		// TODO Auto-generated method stub
		public class ListNode {
			      int val;
			      ListNode next;
			      ListNode(int x) {
			          val = x;
			          next = null;
			      }
			  }
			 

	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode temp1 = headA;
	        ListNode temp2 = headB;
	        while(headA != headB) {
	        	if(headA == null) {
	        		headA = temp2;
	        	}else{
                    headA = headA.next;
                }
	        	if(headB == null) {
	        		headB = temp1;
	        	}else{
                    headB = headB.next;
                }
	        }
	        return headA;
	    }
	}

}
