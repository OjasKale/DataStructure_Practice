package mockPracticeLeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertStringToGoatLatin {
	
	public static void main(String[] args) {
		String s = "The quick brown fox jumped over the lazy dog";
		System.out.println(toGoatLatin(s));
		
	}

	public static String toGoatLatin(String S) {
        HashSet<Character> vow = new HashSet<Character>();
        List<StringBuilder> sbArr = new ArrayList<>();
        for(String si : S.split(" ")){
        	sbArr.add(new StringBuilder(si));
        }
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        
        for(int i=0; i < sbArr.size(); i++){
        	StringBuilder sb = sbArr.get(i); 
        	Character c = sb.charAt(0); 
        	if(!vow.contains(Character.toLowerCase(c))){
        		sb = sb.deleteCharAt(0);
        		sb.append(c);
        	}
        	sb.append("ma");
        	int cnt = i;
        	while(cnt >= 0){
        		sb.append("a");
        		cnt--;
        	}
        	sbArr.set(i, sb);
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : sbArr){
        	res.append(sb + " ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
