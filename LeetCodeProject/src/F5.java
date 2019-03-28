import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F5 {

	public static void main(String[] args) {
	
		System.out.println(winner("EHH",  "EME" ));
		List<String> arr = new ArrayList<String>();
		arr.add("yy");
		arr.add("u");
		arr.add("oe");
		arr.add("awe");
		arr.add("bbbbu");
		List<String> arr1 = new ArrayList<String>();
		arr1.add("1-2");
		arr1.add("2-3");
		hasViwels(arr, arr1);
	}

	private static String winner(String erica, String bob) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('E', 1);
		map.put('M', 3);
		map.put('H', 5);
		
		int sumErica=0;
		int sumBob=0;
		
		for(char a : erica.toCharArray()) {
			sumErica+= map.get(a);
		}
		
		for(char a : bob.toCharArray()) {
			sumBob+= map.get(a);
		}
		
		if(sumErica > sumBob) {
			return "Erica";
		}else if(sumErica < sumBob) {
			return "Bob";
		}else {
			return "Tie";
		}
	}
	
	public static List<Integer> hasViwels(List<String> strArr, List<String> query){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(String a : query) {
			int count=0;
			String[] interval = a.split("-");
			int start = Integer.parseInt(interval[0]);
			int end = Integer.parseInt(interval[1]);
			for(int i = start-1;i<=end-1;i++) {
				if(startEndsWithVowel(strArr.get(i))) {
					count++;
				}
			}
			
			list.add(count);
		}
		
		return list;
	}

	private static boolean startEndsWithVowel(String str) {
		String  vowels = "aeiou";
		if(vowels.indexOf(str.charAt(0)) !=-1  &&  vowels.indexOf(str.charAt(str.length()-1))!=-1 ){
			return true;
		}else {
			return false;
		}
	}
	
}
