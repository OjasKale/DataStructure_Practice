package stackStudy;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement {

	public static void main(String[] args) {
		ArrayList<Integer> inp = new ArrayList<>();
		inp.add(34);
		inp.add(35);
		inp.add(27);
		inp.add(42);
		inp.add(5);
		inp.add(28);
		inp.add(39);
		inp.add(20);
		inp.add(28);
		System.out.println(prevSmaller(inp));
	}
	
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> buffer = new Stack<>();
        
        for (int i = 0; i < A.size(); i++) {
			if(temp.isEmpty()){
				res.add(-1);
			}else{
				boolean valAssigned = false;
				while(!temp.isEmpty()){
					Integer curr = temp.pop();
					buffer.push(curr);
					if(curr < A.get(i)){
						res.add(curr);
						valAssigned = true;
						break;
					}
				}
				if(!valAssigned){
					res.add(-1);
				}
				while(!buffer.isEmpty()){
					temp.push(buffer.pop());
				}
				
			}
			temp.push(A.get(i));
		}
        return res;
    }
	
}
