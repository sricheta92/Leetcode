package com.easy.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListoflevelsfromTrees {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		convertToLinkedList(tree.root);
	}

	private static void convertToLinkedList(BinaryTreeNode root) {
		
		List<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(root.getData());
		list.add(l);
		queue.add(root);
		
		
		while(!queue.isEmpty()) {
			int q = queue.size();
		
			
			LinkedList<Integer> curr = new LinkedList<Integer>();
			while(q-->0) {
				BinaryTreeNode node = queue.poll();
				if(node.left!=null) {
					queue.add(node.left);
					curr.add(node.left.getData());
				}
				if(node.right!=null) {
					queue.add(node.right);
					curr.add(node.right.getData());
				}
			}
			list.add(curr);
		}
		
		
		print(list);
		
	}

	private static void print(List<LinkedList<Integer>> list) {
		
		
		for(LinkedList l : list) {
			Iterator it = l.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+"=> ");
			}
			System.out.println("");
		}
		
	}
}
