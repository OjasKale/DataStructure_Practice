package stringStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SplitStringInBalacedString {

	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		//List<List<Integer>> res = new ArrayList<List<Integer>>();
		int res = balancedStringSplit(s);
		System.out.println(res);
	}
	
	public static int balancedStringSplit(String s) {
        int totalPartitions = 0;
        char c = s.charAt(0);
        Stack<Character> st = new Stack<>();
        st.push(c);
        for(int i=1; i < s.length(); ++i){
        	
        	if(st.isEmpty()){
                c = s.charAt(i);
            }    
        	
        	if(s.charAt(i) != c) {
                    if(!st.isEmpty()){
                        st.pop();    
                    }
                    
                }else{
                    st.push(s.charAt(i));
                }   
            
            if(st.isEmpty()){
                totalPartitions++;
            }
            
        }
        
        return totalPartitions;
    }
	
}
