package com.easy.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		levelOrder(tree.root);
	}
	
	  public static List<List<Integer>> levelOrder(BinaryTreeNode root) {
	        
	        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	        List<List<Integer>> l = new ArrayList<List<Integer>>();
	        List<Integer> l2 = new ArrayList<Integer>();
	        l2.add(root.getData());
	        l.add(l2);
	        
	        while(!q.isEmpty()){
	            int n = q.size();
	            List<Integer> l1 = new ArrayList<Integer>();
	            while(n-- > 0){
	                BinaryTreeNode node = q.poll();
	                
	                if(node.getLeft()!=null){
	                    q.add(node.getLeft());
	                    l1.add(node.getLeft().getData());
	                }
	                if(node.getRight()!=null){
	                    q.add(node.getRight()); 
	                    l1.add(node.getRight().getData());
	                }
	            }
	            l.add(l1);
	        }
	        
	        return l;
	    }

}
