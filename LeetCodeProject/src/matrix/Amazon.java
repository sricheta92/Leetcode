package matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Amazon {
	
	public static void main(String[] args) {	
		
		List<String> orders = new ArrayList<String>();
		orders.add("a1 alps cow bar");
		orders.add("mi2 jog mid pet");
		orders.add("wz3 34 54 398");
		orders.add("x4 45 21 7");
		   
		test(4,orders);
		
	}

	private static List<String> test(int i, List<String> orders) {
	
		List<String> res = new ArrayList<String>();
		
		List<String> orderDummy = orders;
		Collections.sort(orderDummy, new Comparator<String>(){
			public int compare(String a, String b) {
				
				
				String[] arr1 = a.split(" ");
				String[] arr2 = b.split(" ");
				
				if(!Character.isDigit(arr1[1].charAt(0))) {
					String a1 = a.substring(arr1[0].length()+1,a.length() );
					String a2 = b.substring(arr2[0].length()+1, b.length());
					 if(a1.equals(a2)) {
						 return arr1[0].compareTo(arr2[0]);
					 }else {
						 return a1.compareTo(a2);
					 }
				}
				return 0;
			}
			
		});
		
		return orderDummy;

		/*for(String str : orders) {
			if(Character.isDigit(str.split(" ")[1].charAt(0))){
				res.add(str);
			}else {
				
			}
		}*/
		
	}

}
