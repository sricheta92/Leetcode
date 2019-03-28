package com.easy.trees;

public class InorderPredecessor {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(3);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(4));
		tree.root.getLeft().setLeft(new BinaryTreeNode(1));
		tree.root.getRight().setRight(new BinaryTreeNode(5));
		System.out.println(inorderPredecessor(tree.root, tree.root.getLeft().getLeft()));
	}

	private static int inorderPredecessor(BinaryTreeNode root, BinaryTreeNode p) {
		
		if(root == null) {
			return -1;
		}
		if(p.left!=null) {
			return maxNode(p.left);
		}else {
			BinaryTreeNode predeccor = null;
			BinaryTreeNode ansector = root;
			BinaryTreeNode curr = p;
			while(ansector != curr) {
				if(curr.data> ansector.data) {
					predeccor = ansector;
					ansector = ansector.right;
				}else {
					ansector = ansector.left;
				}
			}
			return predeccor.data;
			
		}
		
	}

	private static int maxNode(BinaryTreeNode root) {
		while(root.right!=null) {
			root = root.right;
		}
		return root.data;
	}
	
}
