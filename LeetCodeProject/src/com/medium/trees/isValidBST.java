package com.medium.trees;

import com.easy.trees.BinaryTreeNode;

public class isValidBST {

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(2);
		 isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isValidBST(BinaryTreeNode root, int minValue, int maxValue) {
		if(root == null) {
			return true;
		}
		
		if(root.data<=minValue || root.data >= maxValue) {
			return false;
		}
		return isValidBST(root.left, minValue, root.data) && isValidBST(root.right, root.data, maxValue);
	}

}
