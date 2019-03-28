package com.medium.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class VerticalOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		verticalOrderTraversal(tree.root);
	//	verticalOrderTraversalRecursive(tree.root, 0);
	}

	private static void verticalOrderTraversalRecursive(BinaryTreeNode root) {
		if(root == null) {
			return;
		}
		
		
	}

	private static void verticalOrderTraversal(BinaryTreeNode root) {
		
		
		
		if(root == null) {
			return;
		}
		Map<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		LinkedList<Integer> level = new LinkedList<Integer>();
		 
		queue.offer(root);
		level.offer(0);
		 
		int minLevel=0;
		int maxLevel=0;

		    
		while(!queue.isEmpty()) {
			BinaryTreeNode node = queue.poll();
			Integer l = level.poll();
			
			//track min and max levels
	        minLevel=Math.min(minLevel, l);
	        maxLevel=Math.max(maxLevel, l);
	        
	        if(map.containsKey(l)) {
	        	map.get(l).add(node.getData());
	        	
	        }else {
	        	ArrayList<Integer> li = new ArrayList<Integer>();
	        	li.add(node.getData());
	        	map.put(l, li);
	        }
	        
			if(node.getLeft()!=null) {
				queue.offer(node.getLeft());
				level.offer(l-1);
			}
			if(node.getRight()!=null) {
				level.offer(l+1);
				queue.offer(node.getRight());
			}
			
		}
		
		for(int i=minLevel; i<=maxLevel; i++){
	        if(map.containsKey(i)){
	           System.out.println(map.get(i));
	        }
	    }
	 
		
	}
}
