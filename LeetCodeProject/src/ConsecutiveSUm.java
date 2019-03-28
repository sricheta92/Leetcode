import java.util.List;

public class ConsecutiveSUm {

	public static void main(String[] args) {
		
		sum(21);
		
	}

	private static void sum(int N) {
		
		int start =1;
		int end = (N +1)/2;
		
		
		while(start<end) {
			int sum =0;
			for(int i = start;i<=end;i++) {
				
				sum = sum +i;
				
				if(sum == N) {
					for(int j =start;j<=i;j++) {
						System.out.print(j + " " );
					}
					System.out.println("");
					break;
				}
				if(sum>N) {
					break;
				}
			}
			start++;
			sum =0;
			
		}
		
	
	}
	
}

