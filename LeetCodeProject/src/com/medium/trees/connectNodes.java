package com.medium.trees;

import java.util.LinkedList;
import java.util.Queue;

public class connectNodes {
	
	 public void connect(TreeLinkNode root) {
	        
	        if(root == null){
	            return;
	        }
	        
	        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
	        q.add(root);
	        
	        while(!q.isEmpty()) {
	        	TreeLinkNode node = q.poll();
	        	
	        	if(node.left!=null) {
	        		node.left.next = node.right;
	        		q.add(node.left);
	        	}
	        	if(node.right!=null) {
	        		node.right.next = (node.next == null) ? null : node.next.left;
	        		q.add(node.right);
	        	}
	        }
	        
	    }
	 
	 public void connectIterative(TreeLinkNode root) {
	        
	        if(root == null){
	            return;
	        }
	        
	        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
	        q.add(root);
	        q.add(null);
	        while(!q.isEmpty()) {
	        	
	        	TreeLinkNode p = q.peek();
	        	q.remove();
	        	
	        	if(p!=null) {
	        		p.next = q.peek();
	        		if(p.left!=null) {
	        			q.add(p.left);
	        		}
	        		if(p.right!=null) {
	        			q.add(p.right);
	        		}
	        	}
	        	
	        	else if (!q.isEmpty()) {
	        		q.add(null);
	        	}
	        	
	        }
	        
	    }
}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) { val = x; }
}