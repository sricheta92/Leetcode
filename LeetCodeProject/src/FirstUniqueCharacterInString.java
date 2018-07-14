
public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("loveleetcode"));
	}

	private static int firstUniqChar(String s) {
		
		char[] arr = s.toCharArray();
		char[] count = new char[256];
		
		for(int i =0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		for(int i =0;i<arr.length;i++) {
			if(count[arr[i]] ==1) {
				return i;
			}
		}
		
		return -1;
	}
}
