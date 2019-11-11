package matrixStudy;

import java.util.ArrayList;
import java.util.List;

public class PascleTriangle {

	public static void main(String[] args) {
		List<List<Integer>> res = givePascleTriangle(5);
		System.out.println(res);
	}
	
	public static List<List<Integer>> givePascleTriangle(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		for(int i=0; i<numRows; ++i){
			List<Integer> curr = new ArrayList<>();
			for(int j = 0; j <= i; ++j){
				if(j == 0 || j==i){
					curr.add(1);
				}else{
					curr.add(res.get(i-1).get(j) + res.get(i-1).get(j-1));
				}
			}
			res.add(curr);
		}
		
		
		return res;
	}
}
