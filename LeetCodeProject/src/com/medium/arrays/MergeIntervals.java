package com.medium.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals {

	public static void main(String[] args) {
	//	[[1,3],[2,6],[,10],[15,18]]
	}

	public static  List<Interval> merge(List<Interval> intervals) {

		Stack<Interval> res = new Stack<Interval>();

		if(intervals ==  null || intervals.size() == 0){
			return res;
		}

		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i , Interval it) {

				return i.start - it.start;
				
			}
				
		}); 
			

		res.push(intervals.get(0));

		for(int i =1;i<intervals.size();i++){

			// if they dont overlap add to stack

			if(res.peek().end < intervals.get(i).start){
				res.push(intervals.get(i));
			}else if(res.peek().end < intervals.get(i).end){

				Interval it =  res.pop();
				it.end =  intervals.get(i).end;
				res.push(it);

			}


		}

		return res;
	}
}

