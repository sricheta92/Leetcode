package com.medium.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

	PriorityQueue<Integer> lowers = null;
	PriorityQueue<Integer> highers = null;
	public MedianFinder() {
		lowers = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				return - (a-b);
			}
		});
		highers = new PriorityQueue<Integer>();     
	}

	public void addNum(int num) {
		if(lowers.isEmpty() || num < lowers.peek()){
			lowers.offer(num);
		}else{
			highers.offer(num);
		}
		PriorityQueue<Integer> bigger = (lowers.size()>highers.size()) ?lowers : highers;
		PriorityQueue<Integer> smaller = (lowers.size()>highers.size()) ?highers : lowers;
		while(bigger.size() - smaller.size() >=2){
			smaller.offer(bigger.poll());
		}
	}


	public double findMedian() {
		PriorityQueue<Integer> bigger = (lowers.size()>highers.size()) ?lowers : highers;
		PriorityQueue<Integer> smaller = (lowers.size()>highers.size()) ?highers : lowers;
		if(bigger.size() == smaller.size()){
			return ((double)bigger.poll() + smaller.poll()) /2;
		}else{
			return (double)bigger.poll();
		}
	}

	public static void main(String[] args) {
		MedianFinder medianFinder = new MedianFinder();
		medianFinder.addNum(2);
		medianFinder.addNum(3);
	//	medianFinder.addNum(4);
		System.out.println(medianFinder.findMedian());
	}

}
