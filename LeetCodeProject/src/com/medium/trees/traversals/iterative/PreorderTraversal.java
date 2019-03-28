package com.medium.trees.traversals.iterative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class PreorderTraversal {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		preorderInterative(tree.root);
	}

	private static void preorderInterative(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		List<Integer> list = new ArrayList<Integer>();
		Collections.max(list);
		while(!stack.isEmpty()) {
			BinaryTreeNode node = stack.pop();
			System.out.println(node.data);
			if(node.right!=null) {
				stack.push(node.right);
			}
			if(node.left!=null) {
				stack.push(node.left);
			}
		}
		
		
		
	}
}
