package matrix;

import java.util.List;

public class McKinsey {

	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		/*
		 * 
		 * temp=[]
    for i in range(len(inputArray)-1):
        curr_temp=inputArray[i]
        next_temp=inputArray[i+1]
        curr_x=curr_temp[0]
        next_x=next_temp[0]
        interval=next_x-curr_x
        j=0
        while(j<interval):
            temp.append(curr_temp[1])
            j+=1
        
    a=[0 for i in range(len(temp))]
    b=[0 for i in range(len(temp))]
    a[0]=temp[0]
    b[-1]=temp[-1]
    for i in range(1,len(temp)):
        a[i]=max(temp[i],a[i-1])
    for i in range(len(temp)-2,-1,-1):
        b[i]=max(temp[i],b[i+1])
    result=0
    for i in range(len(temp)):
        result+=min(a[i],b[i]-temp[i])
    return result
		 */
	}
	  static int findArea(List<List<Integer>> inputArray) {
          int[] temp = new int[inputArray.size()];
          int interval =0;
          int result =0;
          int count=0;
          for(int i =0;i< inputArray.size();i++){
              List<Integer> curr_temp  = inputArray.get(i);
              List<Integer> next_temp = inputArray.get(i+1);
              int curr_x = curr_temp.get(0);
              int next_x = next_temp.get(0);
              interval  = next_x- curr_x;
              int j =0;
              while(j<interval){
                  temp[count++] = curr_temp.get(i);
                  j++;
              }
              int[] a = new int[temp.length];
              int[] b = new int[temp.length];
              a[0] = temp[0];
              b[b.length-1] = temp[temp.length-1];
              for(int k =1;i<temp.length;i++){
                  a[i] = Math.max(temp[i], a[i-1]);
              }
              
              for(int k =temp.length-1;i>-1;i--){
                  b[i] = Math.max(a[i], b[i+1]);
              }
              for(int k =0;i<temp.length;i++){
                  result+= Math.min(a[i], b[i] - temp[i]);
              }
              
              
              
          }
          return result;
  }
}
