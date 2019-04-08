import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionGreedy {


	public static void main(String[] args) {
		findMinArrowShots(null);
	}


	public static int findMinArrowShots(int[][] points) {

		int i =0;
		int count=0;
		Activity[] ac = new Activity[points.length];
		for(int[] p : points) {
			ac[count++]  = new Activity(p[0], p[1]);
		}
		count =0;
		Arrays.sort(ac);
		for(int j =1;j< points.length;j++) {
			if(ac[j].start >= ac[i].finish) {
				count++;
				i =j;

			}
		}
		return count;
	}
}

class Activity implements Comparable<Activity>{
	int start;
	int finish;

	public Activity(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}

	public int compare(Activity a , Activity b) {
		return a.finish - b.finish;
	}
}