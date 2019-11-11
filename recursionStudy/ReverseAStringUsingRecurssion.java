package recursionStudy;

public class ReverseAStringUsingRecurssion {

	public static void main(String[] args) {
		String s = "ojaskale";
		String ans = reverseTheString(s);
		System.out.println(ans);
	}

	private static String reverseTheString(String s) {
		if(s.isEmpty()){
			return s;
		}
		return reverseTheString(s.substring(1)) + s.charAt(0);
	}
}
