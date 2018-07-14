package com.medium.trees;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class LeftViewOfBinaryTree {
	
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
		leftView(tree.root);
	}

	private static void leftView(BinaryTreeNode root) {
		
		leftViewUtil(root,1);
		
	}

	private static void leftViewUtil(BinaryTreeNode root, int i) {
		
		  // Base Case
        if (root==null) return;
		if( i> max_level) {
			System.out.print(root.getData()+" ");
			max_level = i;
		}
		
		leftViewUtil(root.getLeft(),i+1);
		leftViewUtil(root.getRight(),i+1);
	}

}
