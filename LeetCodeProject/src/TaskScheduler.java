
public class TaskScheduler {
	public static void main(String[] args) {
		
		leastInterval(new char[] {'A','A','A','B','B','B'}, 2);
	}
	
	 public static int leastInterval(char[] tasks, int n) {
	 
		 int counter[] = new int[26];
		 int max =0;
		 int maxCount =0;
		 
		 for(char c : tasks) {
			 counter[c-'A']++;
			 if(max == counter[c-'A']) {
				 maxCount++;
			 }
			 if(max< counter[c-'A']) {
				 max = counter[c-'A'];
				 maxCount =1;
			 }
		 }
		 
		 int partCount =  max-1;
		 int partLength = n - (maxCount-1);
		 int emptySlot = partCount  * partLength;
		 int availableSlots = tasks.length - max*maxCount;
		 int idles = Math.max(0, emptySlot - availableSlots);
		 return idles + tasks.length;
	 }
	 
}
