package stringStudy;

public class LongestValidSubstring {
	public static void main(String[] args) {
		String test = "abcabcbb";
		boolean res = isValidSubStringPattern(test);
		System.out.println(res);
	}

	private static boolean isValidSubStringPattern(String test) {
		int len = test.length();
		
		for(int i = len/2; i >= 0; i-- ){
			int m = len/i;
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < m; j++){
				sb.append(test.substring(0, i));
			}
			
			if(sb.toString().equals(test)){
				return true;
			}
		}
		return false;
	}
	
	
	
}
