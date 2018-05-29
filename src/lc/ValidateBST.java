/**
 * File created by csd on May 28, 2018
 * 
 * LC98: Validate Binary Search Tree
 */
package lc;

import java.util.Stack;

import cci.TreeNode;

public class ValidateBST {

	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;

		System.out.println("Validity of [2,1,3]: " + isValidBST(node1));

	}

	public static boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		// If a tree is a valid BST, then it's inOrder should be ascending
		Stack<TreeNode> s = new Stack<>();
		TreeNode pre = null;
		while (root != null || s.empty() == false) {
			// add left nodes to stack
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			root = s.pop();
			// check if the previous value is greater then current
			if (pre != null && root.val <= pre.val)
				return false;
			pre = root;
			root = root.right;
		}
		return true;
	}

}
