package com.medium.trees.traversals.iterative;

import java.util.Stack;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class PostorderTraversal {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		postorderInterative2Stacks(tree.root);
		postorderInterative1Stacks(tree.root);
	}

	private static void postorderInterative1Stacks(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode curr = root;
		while(curr!=null || stack.size()>0) {
			if(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}else {
				BinaryTreeNode node = stack.peek();
				if(node.right== null) {
					System.out.println(node.data);
					 stack.pop();
					 node = stack.peek();
				}
				while(stack.size()>0 && node.right!=null) {
					
				}
			}
		}
		
	}

	private static void postorderInterative2Stacks(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack1 = new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> stack2 = new Stack<BinaryTreeNode>();
		
		stack1.push(root);
		
		while(!stack1.isEmpty()) {
			BinaryTreeNode node = stack1.pop();
			stack2.push(node);
			if(node.left!=null) {
				stack1.push(node.left);
			}
			if(node.right!=null) {
				stack1.push(node.right);
			}
		}
		
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop().data);
		}
		
	}

}
