package com.medium.trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class TopViewOfTree {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		topView(tree.root);
	}

	
	private static void topView(BinaryTreeNode root) {
		
		Queue<QItem> queue = new LinkedList<QItem>();
		Set<Integer> topView = new HashSet<Integer>();
		queue.add(new QItem(root, 0));
		
		while(!queue.isEmpty()) {
			
			QItem n = queue.poll();
			if(!topView.contains(n.hd)) {
				topView.add(n.hd);
				System.out.print(n.node.getData()+" ");
			}
			
			if(n.node.getLeft()!=null) {
				queue.add(new QItem(n.node.getLeft(), n.hd-1));
			}
			
			if(n.node.getRight()!=null) {
				queue.add(new QItem(n.node.getRight(), n.hd+1));
			}
		}
		
		
		
	}
	

}


class QItem{
	
	BinaryTreeNode node;
	int hd;
	
	QItem(BinaryTreeNode data, int hd){
		this.node = data;
		this.hd = hd;
	}
}
