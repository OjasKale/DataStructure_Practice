package stackStudy;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		
	}
	
	
	public static int evalRPN(ArrayList<String> A) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i< A.size(); i++){
        	if(A.get(i).matches("+") || A.get(i).matches("-") || A.get(i).matches("*") || A.get(i).matches("/") ){
        		if(st.isEmpty()){
        			return -1;
        		}
        		int firstNum = st.pop();
        		int secondNum = st.pop();
        		if(A.get(i).matches("+")){
        			st.push(firstNum + secondNum);
        		}
        		
        		if(A.get(i).matches("-")){
        			st.push(firstNum - secondNum);
        		}
        		
        		if(A.get(i).matches("*")){
        			st.push(firstNum * secondNum);
        		}
        		
        		if(A.get(i).matches("/")){
        			st.push(firstNum / secondNum);
        		}
        		
        		
        	}else{
        		st.push(Integer.parseInt(A.get(i)));
        	}
        }
        if(st.isEmpty() || st.size() > 1){
        	return -1;
        }
        return st.pop();
    }
	
	
}
