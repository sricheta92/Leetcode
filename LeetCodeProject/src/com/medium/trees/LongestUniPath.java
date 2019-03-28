package com.medium.trees;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class LongestUniPath {
	static int ans =0;

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(1));
		tree.root.setRight(new BinaryTreeNode(1));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		System.out.println(longestUniPath(tree.root));
	}

	private static int longestUniPath(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		 longestUniPathUtil(root, -1);
		 return ans;
	}

	private static int longestUniPathUtil(BinaryTreeNode curr, int val) {

		if(curr == null) {
			return 0;
		}
		int l = longestUniPathUtil(curr.left, curr.data);
		int r = longestUniPathUtil(curr.right, curr.data);
		ans = Math.max(ans, l+r);
		if(curr.data== val) {
			return 1 + Math.max(l, r);
		}else {
			return 0;
		}

	}
}
