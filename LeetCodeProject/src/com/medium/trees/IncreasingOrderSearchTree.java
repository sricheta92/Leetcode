package com.medium.trees;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class IncreasingOrderSearchTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		increasingBST(tree.root);
	}


public static BinaryTreeNode increasingBST(BinaryTreeNode root) {
	  if(root == null){
          return null;
      }
      List<Integer> arr = new ArrayList<Integer>();
      increasingBSTInorder(root,arr);
      BinaryTreeNode node = new BinaryTreeNode(arr.get(0));
      BinaryTreeNode curr = node;
      for(int i =1;i<arr.size();i++){
          curr.right = new BinaryTreeNode(arr.get(i));
          curr = curr.right;
      }
      return node;
}

public static void increasingBSTInorder(BinaryTreeNode root,  List<Integer> arr){
	  if(root ==null){
          return;
      }
	  Queue q = new
      increasingBSTInorder(root.left, arr);
      arr.add(root.data);
      increasingBSTInorder(root.right, arr);
}

}