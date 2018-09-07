package com.easy.trees;

public class ModeofBST {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(2));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(2));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		modeOfTree(tree.root);
	}

	private static void modeOfTree(BinaryTreeNode root) {
		
		
		
	}
}
