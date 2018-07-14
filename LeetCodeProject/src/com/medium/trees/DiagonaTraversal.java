package com.medium.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class DiagonaTraversal {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		diagonalView(tree.root);
	}

	private static void diagonalView(BinaryTreeNode root) {
		
		Queue<QItem> queue = new LinkedList<QItem>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		queue.add(new QItem(root,0));
		
		while(!queue.isEmpty()) {
			QItem node = queue.poll();
			
			if(map.containsKey(node.hd)) {
				map.get(node.hd).add(node.node.getData());
			}else{
				List<Integer> l = new ArrayList<Integer>();
				l.add(node.node.getData()); 
				map.put(node.hd, l);
			}
			
			if(node.node.getLeft()!=null) {
				queue.add(new QItem(node.node.getLeft(),node.hd+1));
			} 
			
			if(node.node.getRight()!=null) {
				queue.add(new QItem(node.node.getRight(),node.hd));
			}
			
		
		}
		
		for(Map.Entry<Integer, List<Integer>> m : map.entrySet()) {
			System.out.println(m.getValue());
		}
	}

}
