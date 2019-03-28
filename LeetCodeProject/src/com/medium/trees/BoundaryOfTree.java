package com.medium.trees;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class BoundaryOfTree {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		boundary(tree.root);
	}

	private static void boundary(BinaryTreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		printLeftBoundary(root.left);
		printLeaf(root.left);
		printLeaf(root.right);
		printRightBoundary(root.right);	
	}

	private static void printRightBoundary(BinaryTreeNode node) {
		if(node!=null) {
			if(node.right!=null) {
				printRightBoundary(node.right);
				System.out.print(node.data+" ");
			}else if(node.left!=null) {
				printRightBoundary(node.left);
			}
		}
	}

	private static void printLeaf(BinaryTreeNode node) {
		if(node!=null) {
			printLeaf(node.left);
			if(node.left==null && node.right== null) {
				System.out.print(node.data+" ");
			}
			printLeaf(node.right);
		}
		
	}

	private static void printLeftBoundary(BinaryTreeNode node) {
		if(node!=null) {
			if(node.left!=null) {
				System.out.print(node.data+" ");
				printLeftBoundary(node.left);
			}else if(node.right!=null) {
				printLeftBoundary(node.right);
			}
		}
	}

}
