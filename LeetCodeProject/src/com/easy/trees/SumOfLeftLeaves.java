package com.easy.trees;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));

		System.out.println(sum(tree.root));
	}

	private static int sum(BinaryTreeNode root) {
		int ans =0;
		
		if(root == null) {
			return 0;
		}
		if(root.getLeft()!=null) {
			if(root.getLeft().getLeft() == null && root.getLeft().getRight() == null) {
				ans = ans + root.getLeft().getData();
			}else {
				 ans = ans + sum(root.getLeft());
			}
		}
		
		if(root.getRight()!=null) {
			 ans = ans + sum(root.getRight());
		} 
		return ans;
		
	
		
	}

}
