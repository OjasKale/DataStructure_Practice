package hashMapStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

	public static void main(String[] args) {
		System.out.println(letterCombinations("999"));
	}
	
	public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
		if(digits == null || digits.length() == 0){
			return res;
		}
		HashMap<Integer, String> mapping = new HashMap<>();
        mapping.put(2, "abc");
        mapping.put(3, "def");
        mapping.put(4, "ghi");
        mapping.put(5, "jkl");
        mapping.put(6, "mno");
        mapping.put(7, "pqrs");
        mapping.put(8, "tuv");
        mapping.put(9, "wxyz");
        letterCombinationsByRecursion(res, digits, mapping, "", 0);
        
        return res;
    }

	private static void letterCombinationsByRecursion(List<String> res, String digits, HashMap<Integer, String> mapping,
			String curr, int index) {
		if(index == digits.length()){
			res.add(curr);
			return;
		}
		
		String letters = mapping.get(digits.charAt(index) - '0');
		for(int i=0; i < letters.length(); ++i){
			letterCombinationsByRecursion(res, digits, mapping, curr + letters.charAt(i), index + 1);
		}
		
	}
	
}
