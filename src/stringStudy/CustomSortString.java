package stringStudy;

public class CustomSortString {
	
	public static void main(String[] args) {
		String S = "abc";
		String T = "aabaaa";
		System.out.println("Result: " + customSortString(S,T));
	}

	
	public static String customSortString(String S, String T) {
		StringBuilder sb1 = new StringBuilder(S);
		StringBuilder sb2 = new StringBuilder(T);
		for(int i=0; i<S.length();++i){
			int charIndex = sb2.indexOf(""+S.charAt(i));
			if(charIndex != -1) {
				sb2.deleteCharAt(charIndex);
				
			}else{
				sb1.deleteCharAt(sb1.indexOf(""+S.charAt(i)));
			}
		}
		
		sb1.append(sb2);
        return sb1.toString();
    }
}
