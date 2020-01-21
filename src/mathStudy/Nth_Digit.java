package mathStudy;

public class Nth_Digit {

	public static void main(String[] args) {
		int ans = findNthDigit(99);
		System.out.println(ans);
	}
	
	public static int findNthDigit(int n) {
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		while(sb.length() <= n ){
			sb.append(cnt);
			cnt++;
		}
		
		return Character.getNumericValue((sb.charAt(sb.length()-1))); 
        //return -1;
    }
	
}
