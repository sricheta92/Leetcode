package com.easy.trees;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

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

		Queue<BinaryTreeNode> q  =new LinkedList<BinaryTreeNode>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		q.add(root);
		int max =0;
		while(!q.isEmpty()) {
			BinaryTreeNode node = q.poll();
			if(map.containsKey(node.data)) {
				map.put(node.data, map.get(node.data)+1);
			}else {
				map.put(node.data,1);
			}
			max = Math.max(max, map.get(node.data));
			if(node.left!=null) {
				q.add(node.left);
			}
			if(node.left!=null) {
				q.add(node.right);
			}

		}
		
		  List<Integer> list = new LinkedList<>();
	        for (int key : map.keySet()) {
	            if (map.get(key) == max)
	                list.add(key);
	        }
	        int[] res = new int[list.size()];
	        for (int i = 0; i < res.length; i++)
	            res[i] = list.

		

	}
}
