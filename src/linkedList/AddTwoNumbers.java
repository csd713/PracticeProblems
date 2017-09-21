/**
 * File created by csd on Sep 20, 2017
 * 
 * given two non-empty linked lists representing two non-negative integers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit.
 *   Add the two numbers and return it as a linked list.
 *   Assume the two numbers do not contain any leading zero, except the number 0 itself.
 *   Input: (1) + (9 -> 9)
 *   Output: 0 -> 0 -> 1
 * 
 */
package linkedList;

import linkedList.Node;

public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(9);
		n2.next = new Node(9);

		Node sum = add(n1, n2);
		while (sum != null) {
			System.out.println(sum.value);
			sum = sum.next;
		}
		// System.out.println(add(n1,n2));
	}

	public static Node add(Node n1, Node n2) {
		Node head = null, temp = null, sum = null;
		int carry = 0;
		// add each node till the smallest number gets null
		while (n1 != null && n2 != null) {
			temp = new Node((carry + n1.value + n2.value) % 10);

			if (sum == null) {
				sum = temp;
				head = temp;
			} else {
				sum.next = temp;
				sum = temp;
			}

			carry = (carry + n1.value + n2.value) / 10;
			n1 = n1.next;
			n2 = n2.next;
		}
		// check if first number has more nodes
		if (n1 != null) {
			if (carry != 0) {
				while (n1 != null) {
					temp = new Node((carry + n1.value) % 10);
					sum.next = temp;
					sum = temp;
					carry = (carry + n1.value) / 10;
					n1 = n1.next;
				}

			} else {
				sum.next = n1;
			}
		}
		// check if second number has more nodes
		if (n2 != null) {
			if (carry != 0) {
				while (n2 != null) {
					temp = new Node((carry + n2.value) % 10);
					sum.next = temp;
					sum = temp;
					carry = (carry + n2.value) / 10;
					n2 = n2.next;
				}

			} else {
				sum.next = n2;
			}
		}
		// at the end if carry is not 0 then add it as last node to sum
		if (carry != 0) {

			sum.next = new Node(carry);
		}

		return head;
	}

}