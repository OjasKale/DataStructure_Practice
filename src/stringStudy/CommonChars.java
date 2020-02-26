package stringStudy;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

	public static void main(String[] args) {
		String[] A = {"bella","label","roller"};
		commonChars(A);
	}
	
	public static List<String> commonChars(String[] A){
		int[] di = new int[26];
        List<String> res = new ArrayList<>();
        for(String s : A){
            for(int i=0; i < s.length(); i++){
                di[s.charAt(i) - 'a' +1]++;
            }
        }
        
        for(int j = 0; j < di.length; j++){
        	if(di[j] == 3){
        		System.out.println(String.valueOf((char) j + 97));
        	}
        }
        return null;
	}
}
