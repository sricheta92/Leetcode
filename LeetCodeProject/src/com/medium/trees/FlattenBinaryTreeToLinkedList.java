package com.medium.trees;

import java.util.Stack;

import com.easy.linkedlist.ListNode;
import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		flattenBinaryTreetoLinkedList(tree.root);
	}

	private static void flattenBinaryTreetoLinkedList(BinaryTreeNode root) {
		
		if(root == null || root.left== null && root.right==null ) {
			return;
		}
		
		if(root.left!=null) {
			flattenBinaryTreetoLinkedList(root.left);
			BinaryTreeNode tmpright = root.right;
			root.right = root.left;
			root.left = null;
			BinaryTreeNode t = root.right;
			while(t.right!=null) {
				t = t.right;
			}
			t.right = tmpright;
		}
		
		flattenBinaryTreetoLinkedList(root.right);
		
	}
}
