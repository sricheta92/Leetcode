package com.medium.trees;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class SerializeAndDeserializeBinaryTree {
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTreeNode(1);
		tree.root.setLeft(new BinaryTreeNode(2));
		tree.root.setRight(new BinaryTreeNode(3));
		tree.root.getLeft().setLeft(new BinaryTreeNode(4));
		tree.root.getLeft().setRight(new BinaryTreeNode(5));
		tree.root.getRight().setLeft(new BinaryTreeNode(6));
		tree.root.getRight().setRight(new BinaryTreeNode(7));
		System.out.println(serialize(tree.root));
		System.out.println(serialize(tree.root));
		
	}
   
	
	 // Encodes a tree to a single string.
    public static String serialize(BinaryTreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root,sb);
        deserialize(sb.toString());
        return sb.toString();
    }
    
    public static void preOrder(BinaryTreeNode root, StringBuilder sb ){
        if(root == null){
            sb.append("null").append(",");
        }else {
        sb.append(root.data).append(",");
        preOrder(root.left, sb);
        preOrder(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public static BinaryTreeNode deserialize(String data) {
        Deque<String> list = new LinkedList<String>();
        list.addAll(Arrays.asList(data.split(",")));
        return buildTree(list);
    }
    
    public static BinaryTreeNode buildTree(Deque<String> list){
        String val = list.remove();
        if(val.equals("null")) {
            return null;
        }else{
        	BinaryTreeNode node = new BinaryTreeNode(Integer.valueOf(val));
            node.left = buildTree(list);
            node.right = buildTree(list);
            return node;
        }
    }
    
}
