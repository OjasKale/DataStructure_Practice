package stringStudy;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutations {
	private static List<String> res;
	public static void main(String[] args) {
		res = new ArrayList<>();
		getPermutations("Xyzzy","");
		System.out.println(res);
	}
	
	public static void getPermutations(String str, String ans){
		if( str.length() == 0){
			res.add(ans);
			return;
		}
		
		for(int i = 0; i < str.length(); ++i){
			char ch = str.charAt(i); 
			 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
 
            getPermutations(ros, ans + ch);
		}
	}

}
