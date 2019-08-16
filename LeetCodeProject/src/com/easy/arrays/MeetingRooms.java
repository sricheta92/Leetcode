package com.easy.arrays;

import java.util.Arrays;

public class MeetingRooms {

	public static void main(String[] args) {
		
	}
	
	public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
           public int compare(int[] a, int[] b) {
               return a[0] - b[0];
           } 
        });
        
       for(int i =1;i< intervals.length;i++) {
           
           if(intervals[i-1][1] > intervals[i][0]) return false;
       }
        return true;
        
    }
}
