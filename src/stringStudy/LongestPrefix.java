package stringStudy;

import java.util.ArrayList;

public class LongestPrefix {
	
	public static void main(String[] args) {
		ArrayList<String> st = new ArrayList<>();
		st.add("aaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		st.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		//System.out.println(longestCommonPrefix(st));
		System.out.println(longestPrefix(st));
		
		
	}
	
	public static String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder sb = new StringBuilder(A.get(0));
        
        for (String singleString : A) {
        	if(singleString.length() < sb.length()){
				sb.delete(singleString.length(), sb.length());
			}
        	int smallerString = singleString.length() > sb.length() ? sb.length() : singleString.length();
        	System.out.println(smallerString);
			for(int i=0;i<smallerString;i++){
				if(sb.charAt(i) != singleString.charAt(i)){
					sb.delete(i,sb.length());
					break;
				}
				
			}
			
		}
        
        return sb.toString();
    }
	public static String longestPrefix(ArrayList<String> strs){
		StringBuilder prefix = new StringBuilder(strs.get(0));
        for(String st: strs){
            int i = 0;
            while(i < st.length() && i < prefix.length() && prefix.charAt(i) == st.charAt(i)){
                i++;
            }
            prefix.delete(i,prefix.length());
        }
        
        return prefix.toString();
	}
}
