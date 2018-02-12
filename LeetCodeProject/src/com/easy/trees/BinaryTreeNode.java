package com.easy.trees;

public class BinaryTreeNode {
	
	private int data;
	private BinaryTreeNode left,right;
	
	BinaryTreeNode(int data){
		this.data = data;
		left=  right = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	

}
