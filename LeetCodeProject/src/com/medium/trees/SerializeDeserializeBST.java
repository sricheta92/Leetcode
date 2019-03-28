package com.medium.trees;

import com.easy.trees.BinaryTree;
import com.easy.trees.BinaryTreeNode;

public class SerializeDeserializeBST {
	static String str = "";
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
	}
	

    // Encodes a tree to a single string.
    public static String serialize(BinaryTreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root,sb);
        String str = sb.substring(0, sb.toString().length() -1);
        return str;
    }

    public static void preOrder(BinaryTreeNode root, StringBuilder sb){
        if(root == null){
            sb.append(",");
            return;
        }  
        sb.append(root.data).append(",");
        preOrder(root.left, sb);
        preOrder(root.right, sb);
    }
    
    // Decodes your encoded data to tree.
    public BinaryTreeNode deserialize(String data) {
        String[] pre = data.split(",");
        return deserializeUtil(pre, 0, pre.length-1);
    }
    
    public BinaryTreeNode deserializeUtil(String[] pre , int low, int high){
        if(low>high) return null;
        BinaryTreeNode root = new BinaryTreeNode(Integer.valueOf(pre[low]));
        int div = findDivision(root.data, pre, low+1, high);
        root.left = deserializeUtil(pre, low+1,div-1 );
         root.right = deserializeUtil(pre, div,high );
        return root;
    }
    
    public int findDivision(int val , String[] pre, int low, int high){
        for(int i =low;i<=high;i++){
            if(val < Integer.valueOf(pre[i])){
                return i;
            }
        }
        return 0;
    }
}
