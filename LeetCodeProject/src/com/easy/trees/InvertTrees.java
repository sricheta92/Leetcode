package com.easy.trees;

public class InvertTrees {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		invertTree(tree.root);
		
	}

	private static BinaryTreeNode invertTree(BinaryTreeNode root) {
		  
        if(root == null){
            return null;
        }
      
        BinaryTreeNode left = invertTree( root.getLeft());
        BinaryTreeNode right = invertTree( root.getRight());
        root.setRight(left);
        root.setLeft(right);
         return root;
		
	}
}
