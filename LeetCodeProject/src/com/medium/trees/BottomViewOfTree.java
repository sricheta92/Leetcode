package com.medium.trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class BottomViewOfTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		bottomView(tree.root);
	}

	private static void bottomView(BinaryTreeNode root) {
		
		Queue<QItem> queue = new LinkedList<QItem>();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		queue.add(new QItem(root, 0));
		
		while(!queue.isEmpty()) {
			
			QItem n = queue.poll();
			
			map.put(n.hd, n.node.getData());
			if(n.node.getLeft()!=null) {
				queue.add(new QItem(n.node.getLeft(),n.hd-1));
			}
			
			if(n.node.getRight()!=null) {
				queue.add(new QItem(n.node.getRight(),n.hd+1));
			}
		}

		for(Map.Entry<Integer, Integer> m : map.entrySet() ) {
			System.out.print(m.getValue()+" ");
		}

	}

	
}


