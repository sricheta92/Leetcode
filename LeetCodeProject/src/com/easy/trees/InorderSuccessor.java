package com.easy.trees;

/**
 * Time complexity : O(H)
 * @author Sricheta's computer
 *
 */
public class InorderSuccessor {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(3);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(4));
		tree.root.getLeft().setLeft(new BinaryTreeNode(1));
		tree.root.getRight().setRight(new BinaryTreeNode(5));
		System.out.println(inorderSuccessor(tree.root, tree.root.getLeft()));
	}

	private static int inorderSuccessor(BinaryTreeNode root, BinaryTreeNode p) {
		
		if(root == null) {
			return -1;
		}
		
		if(p.right!=null) {
			return minNode(p.right);
		}else {
			BinaryTreeNode successor = null;
			BinaryTreeNode  ancestor = root;
			BinaryTreeNode curr = p;
			while(curr != ancestor ) {
				if(curr.data<ancestor.data) {
					successor = ancestor;;
					ancestor = ancestor.left;
				}else {
					ancestor = ancestor.right;
				}
				
			}
			return successor.data;
		}
	}

	private static int minNode(BinaryTreeNode root) {
		
		while(root.left!=null) {
			root = root.left;
		}
		return root.data;
	}
}
