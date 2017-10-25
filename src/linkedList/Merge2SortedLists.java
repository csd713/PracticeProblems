/**
 * File created by csd on Oct 24, 2017
 * 
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
package linkedList;

import linkedList.Node;

public class Merge2SortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l1 = new Node(1);
		Node l2 = new Node(1);
		l1.next = new Node(2);
		l2.next = new Node(4);

		Node sorted = merge2Lists(l1, l2);

		while (sorted != null) {
			System.out.println(sorted.value);
			sorted = sorted.next;
		}

	}

	public static Node merge2Lists(Node l1, Node l2) {
		Node head = null, temp = null;
		// check if any one of the list is null
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		// assign head value

		if (l1.value <= l2.value) {
			head = l1;
			l1 = l1.next;
		} else {
			head = l2;
			l2 = l2.next;
		}
		// use temp to compare and link
		temp = head;
		while (l1 != null && l2 != null) {
			if (l1.value <= l2.value) {
				temp.next = l1;
				l1 = l1.next;
				temp = temp.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
				temp = temp.next;
			}
		}
		// make sure both lists are null
		if (l1 != null) {
			temp.next = l1;
		}
		if (l2 != null) {
			temp.next = l2;
		}
		return head;

	}
}