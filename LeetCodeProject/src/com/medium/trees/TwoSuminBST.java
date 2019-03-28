package com.medium.trees;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class TwoSuminBST {
	
	public static void main(String[] args) {
		//  
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		twoSumInBST(tree.root, 5);
		
	}

	private static int[] twoSumInBST(BinaryTreeNode root, int sum) {

		if(root == null) {
			return null;
		}
		
		if(sum < root.val) {
			twoSumInBST(root.left, sum)
		}
		
	}

}
