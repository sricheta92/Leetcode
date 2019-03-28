package com.medium.trees.traversals.iterative;

import java.util.Stack;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class InorderTraversal {

	public static void main(String[] args) {


		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		inorderInterative(tree.root);

	}

	private static void inorderInterative(BinaryTreeNode root) {

		/*BinaryTreeNode curr = root;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while(true) {
			while(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}
			if(stack.size() ==0) {
				break;
			}
			BinaryTreeNode node = stack.pop();
			System.out.println(node.data);
			curr = node.right;*/
		
		
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode curr = root;
		
		while(true) {
			while(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			if(stack.size() == 0) {
				break;
			}
			
			BinaryTreeNode node1 = stack.pop();
			System.out.println(node1.data);
			curr = node1.right;
			
		}
		
	}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		}


	


