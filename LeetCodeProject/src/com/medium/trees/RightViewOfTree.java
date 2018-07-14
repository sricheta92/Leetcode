package com.medium.trees;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class RightViewOfTree {
	static int max_level =0;
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		rightView(tree.root);
	}

	private static void rightView(BinaryTreeNode root) {
		rightViewUtil(root,1);
		
		
	}

	private static void rightViewUtil(BinaryTreeNode root, int i) {
		
		  // Base Case
        if (root==null) return;
		if( i> max_level) {
			System.out.print(root.getData()+" ");
			max_level = i;
		}
		
		rightViewUtil(root.getRight(),i+1);
		rightViewUtil(root.getLeft(),i+1);
		
	}
}
