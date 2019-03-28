package com.medium.trees;

import com.easy.trees.BinaryTreeNode;

public class ConstructTreeFromInOrderandPreOrder {
	
	static int index =0;
	public static void main(String[] args) {
	//	BinaryTreeNode node = new BinaryTreeNode();
		char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        buildTree(in , pre, 0, in.length-1);
	}

	private static BinaryTreeNode buildTree( char[] in, char[] pre, int start, int end) {
		
		if(start>end) {
			return null;
		}
		BinaryTreeNode node = new BinaryTreeNode(pre[index++]);
		
		if(start == end) {
			return node;
		}
		int index = searchIndexInnorder(node.getData(), in);
		
		if(index == -1) {
			try {
				throw new Exception("Improper input");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		node.left = buildTree(in, pre, start, index-1);
		node.right = buildTree(in,pre,index+1, end);
		
		return node;
	}

	private static int searchIndexInnorder(int data, char[] in) {
		
		for(int i =0;i<in.length;i++) {
			if(in[i] == data) {
				return i;
			}
		}
		
		return -1;
		
	}
}
