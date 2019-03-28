package com.medium.trees;

import com.easy.trees.BinaryTreeNode;

public class isCousins {
	
	BinaryTreeNode xParent = null;
	BinaryTreeNode yParent = null;
	int xDepth = 0;
	int yDepth  =0;
	public static void main(String[] args) {
		BinaryTreeNode node = new BinaryTreeNode(0);
		isCousins counsins = new isCousins();
		System.out.println("Are they cousins? + "+ counsins.isCousins(node, 2, 3));
	}

	private  boolean isCousins(BinaryTreeNode root, int x, int y) {
		getDepthAndParent(root, x, y, 0, null );
		return (xDepth == yDepth && xParent!=yParent)  ?  true :  false;
	}

	private  void getDepthAndParent(BinaryTreeNode root, int x, int y, int depth, BinaryTreeNode parent) {
		if(root == null) {
			return;
		}
		
		if(root.data == x) {
			xParent=parent;
			xDepth = depth;
		}
		if(root.data == y) {
			yParent=parent;
			yDepth = depth;
		}
		getDepthAndParent(root.left, x, y, depth+1, root);
		getDepthAndParent(root.right, x, y, depth+1, root);
	}
	
}
