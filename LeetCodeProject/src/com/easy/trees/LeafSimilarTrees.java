package com.easy.trees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		
		
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new BinaryTreeNode(1);
		tree1.root.setLeft(new BinaryTreeNode(2));
		tree1.root.setRight(new BinaryTreeNode(3));
		tree1.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree1.root.getLeft().setRight(new BinaryTreeNode(5));
		tree1.root.getRight().setLeft(new BinaryTreeNode(6));
		tree1.root.getRight().setRight(new BinaryTreeNode(7));
		
		leafSimilar(tree.root, tree1.root);
		
	}
	  public static boolean leafSimilar(BinaryTreeNode root1, BinaryTreeNode root2) {
	        
	       List<Integer> leaf1 = new ArrayList<Integer>();
		   getLeaves(root1, leaf1);
	        return false;
	    }
	private static List<Integer> getLeaves(BinaryTreeNode root1, List<Integer> leaf1) {
		
		if(root1 == null){
			return null;
		}
		
		if(root1.left == null && root1.right == null) {
			leaf1.add(root1.getData());
			
		}
		
		getLeaves(root1.left, leaf1);
		getLeaves(root1.right, leaf1);
		return leaf1;
	}
	  
}
