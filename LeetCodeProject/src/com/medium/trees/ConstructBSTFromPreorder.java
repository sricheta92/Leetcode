package com.medium.trees;

import com.easy.trees.BinaryTreeNode;

public class ConstructBSTFromPreorder {
	static int count=0;
	public static void main(String[] args) {
		int pre[] = new int[]{8,5,1,7,10,12};
		buildTree(pre, 0, pre.length-1);
	}

	private static BinaryTreeNode buildTree(int[] preorder, int low, int high) {

        if(low>high) {
        	return null;
        }
        
        int rootVal = preorder[low];
        int startIndex = low+1;
        BinaryTreeNode root  = new BinaryTreeNode(rootVal); 
        while(startIndex < high && preorder[startIndex] < rootVal) {
        	startIndex++;
        }

        root.left = buildTree(preorder, low+1,startIndex-1 );
        root.right = buildTree(preorder, startIndex,high );
        return root;
    }
    
    public static int findPivot(int[] pre, int val, int j, int high) {
        
        for(int i =j;i<=high;i++){
            if(pre[i] > val ){
                return i;
            }
        }
        return -1;
    }
		
	}


