package leetcode;

/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). 
 * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. 
 * There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 * 
 * 
 * Solution: 
 * Maintain two pointers pApA and pBpB initialized at the head of A and B, respectively. 
 * Then let them both traverse through the lists, one node at a time.
 * When pApA reaches the end of a list, then redirect it to the head of B (yes, B, that's right.); 
 * similarly when pBpB reaches the end of a list, redirect it the head of A.
 * If at any point pApA meets pBpB, then pApA/pBpB is the intersection node.
 * To see why the above trick would work, consider the following two lists: A = {1,3,5,7,9,11} and B = {2,4,9,11}, 
 * which are intersected at node '9'. Since B.length (=4) < A.length (=6), 
 * pBpB would reach the end of the merged list first, because pBpB traverses exactly 2 nodes less than pApA does. 
 * By redirecting pBpB to head A, and pApA to head B, we now ask pBpB to travel exactly 2 more nodes than pApA would. 
 * So in the second iteration, they are guaranteed to reach the intersection node at the same time.
 * If two lists have intersection, then their last nodes must be the same one. 
 * So when pApA/pBpB reaches the end of a list, record the last element of A/B respectively. 
 * If the two last elements are not the same one, then the two lists have no intersections.
 * 
 * Complexity Analysis
 * Time complexity : O(m+n)O(m+n).
 * Space complexity : O(1)O(1).
 * 
 * */

class ListNode{
	ListNode next;
	int val;
	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}
public class IntersectionLinkedList {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null; 
		
		ListNode a = headA;
		ListNode b = headB;
		
		while(a != b) {
			a = a==null? headB : a.next;
			b = b==null? headA : b.next;
		}
		
		return b;
	}

}
