package com.easy.trees;

import java.util.Stack;

public class BinaryTree {
	
	public BinaryTreeNode root;
	
	public BinaryTree(){
		root = null;
	}
		
	public void printRecursivePreOrder(BinaryTreeNode root){
		
		if(root != null) {
			System.out.print(root.getData() +" ");
			printRecursivePreOrder(root.getLeft());
			printRecursivePreOrder(root.getRight());
		}
	}
	
	public void printIterativePreOrder(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			BinaryTreeNode temp= stack.pop();
			System.out.print(temp.getData() +" ");
			if(temp.getRight()!=null) {
				stack.push(temp.getRight());
			}
			if(temp.getLeft()!=null) {
				stack.push(temp.getLeft());
			}
		}
		
		
	}
	
	public void printRecursiveInOrder(BinaryTreeNode root) {
		if(root!=null) {
			printRecursiveInOrder(root.getLeft());
			System.out.print(root.getData()+" ");
			printRecursiveInOrder(root.getRight());
		}
	}
	
	public void printIterativeInOrder(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode node = root;
		while(node!=null) {
			stack.push(node);
			node = node.getLeft();
		}
		
		while(!stack.isEmpty()) {
			
			 node = stack.pop();
			System.out.print(node.getData()+" ");
			if(node.getRight()!=null) {
				node = node.getRight();
				while(node!=null) {
					stack.push(node);
					node = node.getLeft();
				}
			}
			
			
		}
		
	}
	
	private void printIterativePostOrder(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode node = root;
		
		while(node!=null) {
		}
				
	}
	
	private void printRecursivePostOrder(BinaryTreeNode root) {

		if(root!=null) {
			printRecursivePostOrder(root.getLeft());
			printRecursivePostOrder(root.getRight());
			System.out.print(root.getData()+" ");
		}
		
	}

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		
		tree.printRecursivePreOrder(tree.root);
		System.out.println();
		tree.printIterativePreOrder(tree.root);
		System.out.println();
		tree.printRecursiveInOrder(tree.root);
		System.out.println();
		tree.printIterativeInOrder(tree.root);
		System.out.println();
		tree.printRecursivePostOrder(tree.root);
	}

}
