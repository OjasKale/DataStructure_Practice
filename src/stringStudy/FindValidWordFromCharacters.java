package stringStudy;

import java.util.ArrayList;

public class FindValidWordFromCharacters {
	
	public static void main(String[] args) {
		
		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		
		int res = countCharacters(words,chars);
		
		System.out.println(res);
	}
	
	public static int countCharacters(String[] words, String chars) {
        ArrayList<Character> dictionary = new ArrayList<>();
        int resultLen = 0;
        for (Character ch : chars.toCharArray()) {
			dictionary.add(ch);
		}
        
        for(String currStr : words){
        	System.out.println(currStr.length() + " :: " + dictionary.size());
        	if(currStr.length() < dictionary.size()){
        		ArrayList<Character> temp = new ArrayList<>(dictionary);
            	int len = currStr.length()-1;
            	
            	//System.out.println("Current String: " + currStr + " Its Length: " + len);
            	while(len >= 0){
            		Character ch = currStr.charAt(len);
            		if(!temp.isEmpty() && temp.contains(ch)){
            			//System.out.println("Removing!!" + ch);
            			temp.remove(ch);
            			if(len == 0){
            				System.out.println("And the String we are putting in is: " + currStr + " Len " + currStr.length());
            				resultLen += currStr.length(); 
            			}
            		}else{
            			len = 0;
            		}
            		len--;
            	}
        	}
        }
        
        return resultLen;
    }

}
