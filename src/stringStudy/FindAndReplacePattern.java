package stringStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
	
	public static void main(String[] args) {
		String[] arr = {"abc","deq","mee","aqq","dkd","ccc"};
		String ptr = "mpp";
		List<String> ans =  findAndReplacePattern(arr,ptr);
		System.out.println(ans);
	}
	
	public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
		for(String st: words){
			if(checkIsomorphic(st,pattern)) {
				res.add(st);
			}
		}
		return res;
    }
    
    public static boolean checkIsomorphic(String s1, String s2) {
        
    	int[] map1 = new int[256], map2 = new int[256];
        for(int i=0; i<s1.length(); i++) {
            char ch1 = s1.charAt(i), ch2 = s2.charAt(i);  
            if(map1[ch1] != map2[ch2]) return false; 
            map1[ch1] = map2[ch2] = i+1;  
        }
        return true; 
    }

}
