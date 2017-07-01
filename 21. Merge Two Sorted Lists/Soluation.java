/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode ListHead = null;
		// 两链表为空的情况
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		// 设定好头结点
		if (l1.val < l2.val) {
			ListHead = l1;
			l1 = l1.next;
			ListHead.next = null;

		} else {
			ListHead = l2;
			l2 = l2.next;
			ListHead.next = null;

		}
		ListNode now = ListHead;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				now.next = l1;
				now = now.next;
				l1 = l1.next;
				now.next = null;

			} else {
				now.next = l2;
				now = now.next;
				l2 = l2.next;
				now.next = null;
			}

		}
		if (l1 == null) {
			now.next = l2;
		} else {
			now.next = l1;
		}
		return ListHead;

	}
}