package stringStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPalindrome {

	public static void main(String[] args) {
		String A = "";
		System.out.println(isPalindrome(A));
	}
	
	public static int isPalindrome(String A) {
		
		
        System.out.println(A.replaceAll("[^a-zA-Z]",""));
        String S = A.replaceAll("[^a-zA-Z]","").toLowerCase();
        if(S.length() == 0)
        	return 1;
        int begin = 0;
        int end = S.length() - 1;
        int middle = (begin + end)/2;
        
        for(int i=begin; i <= middle; i++){
            if(S.charAt(begin) == S.charAt(end)){
                begin++;
                end--;
            }else{
                return 0;
            }
        }
        
        return 1;
    }
	
}
