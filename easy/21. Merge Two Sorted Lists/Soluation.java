/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


//合并两个单链表。比我常用的模拟方法代码量较少一点，先用一个fake头部。后序判断方法就一样了。假头部的后一个指针返回即可。
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode fake=new ListNode(0);
		ListNode now=fake;
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
		return fake.next;

	}
}