package com.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CutoffTreesForGolf {

	int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};
	public static void main(String[] args) {
		List<List<Integer>>  list = new ArrayList<List<Integer>>();
		List<Integer> sub1 = new ArrayList<Integer>();
		sub1.add(1);
		sub1.add(2);
		sub1.add(3);
		list.add(sub1);
		
		List<Integer> sub2 = new ArrayList<Integer>();
		sub2.add(0);
		sub2.add(0);
		sub2.add(4);
		list.add(sub2);
		
		List<Integer> sub3 = new ArrayList<Integer>();
		sub3.add(7);
		sub3.add(6);
		sub3.add(5);
		list.add(sub3);
		
		CutoffTreesForGolf g = new CutoffTreesForGolf();
		g.cutOffTree(list);
		
	}

	public int cutOffTree(List<List<Integer>> forest) {

		if(forest == null || forest.size() == 0 )return -1;

		int m = forest.size();
		int n = forest.get(0).size();

		PriorityQueue<Tree> q = new PriorityQueue<Tree>(new Comparator<Tree>(){
			public int compare(Tree t1,  Tree t2) {
				return t1.height - t2.height;
			}
		});

		for(int i =0;i< forest.size();i++) {
			for(int j =0;j< forest.get(0).size();j++) {
				q.offer(new Tree(i, j, forest.get(i).get(j)));
			}
		}

		int sum = 0;
		int[] start  = new int[2];
		while(!q.isEmpty()) {
			Tree tree = q.poll();
			int steps = minstep(forest, tree,start, m , n );

			if(steps< 0) return steps;
			sum += steps;
			start[0] = tree.x;
			start[1] = tree.y;

		}
		return sum;
	}

	public int minstep(List<List<Integer>> forest, Tree tree, int[] start, int m , int n) {
		boolean[][] visited = new boolean[m][n];
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(start);
		visited[start[0]][start[1]] = true;
		int steps =0;

		while(!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] polled = queue.poll();
				if(polled[0] == tree.x && polled[1] == tree.y) return steps;
				for(int[] d: dir) {
					int nr = d[0] + polled[0]; 
					int ny = d[1] + polled[1];
					if(nr <0 || nr >= m || ny<0 || ny >=n || visited[nr][ny] || forest.get(nr).get(ny) == 0) continue;
					queue.offer(new int[]{nr, ny});
					visited[nr][ny] = true;
				}
			}
			steps++;
		}
		return -1;
	}


}


class Tree {
	int x;
	int y;
	int height;

	public Tree(int x, int y, int height) {
		this.x = x;
		this.y = y;
		this.height = height;
	}
}
