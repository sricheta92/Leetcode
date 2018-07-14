package com.medium.trees;

import com.easy.linkedlist.DLLNode;
import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class BinaryTreetoDLL {

	static BinaryTreeNode prev =null;
	static BinaryTreeNode head = null;
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		binaryTreeToDLL(tree.root);
	}

	private static void binaryTreeToDLL(BinaryTreeNode root ) {	
		
		if(root == null) {
			return ;
		}
		
		binaryTreeToDLL(root.getLeft());
		if(prev == null) {
			head = root;
		}else {
			root.left = prev;
			prev.right = root;
			
		}
		
		binaryTreeToDLL(root.getRight());
	}
}
