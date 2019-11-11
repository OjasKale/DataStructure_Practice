package stackStudy;

import java.util.Stack;

public class CheckPrathesis {

	public static void main(String[] args) {
		String A = "({[[]]()})}";
		System.out.print("Result" );
		System.out.println(isValid(A));
	}
	
	 public static int isValid(String A) {
	        
	        Stack<Character> st = new Stack<>();
	        for(int i=0;i<A.length();i++){
	            if(A.charAt(i) == '}' || A.charAt(i) == ']' || A.charAt(i) == ')'){
	            	if(st.isEmpty())
	            		return 0;
	            	Character c = st.pop();
	            	if(A.charAt(i) == '}' && c != '{') {
	            		return 0;
	            	}else if(A.charAt(i) == ']' && c != '[') {
	            		return 0;
	            	}else if(A.charAt(i) == ')' && c != '(') {
	            		return 0;
	            	}
	            }else{
	            	st.push(A.charAt(i));
	            }
	        }
	        if(st.isEmpty()){
	        	return 1;
	        }else{
	        	return 0;
	        }
	        
	        
	    }
	
}
