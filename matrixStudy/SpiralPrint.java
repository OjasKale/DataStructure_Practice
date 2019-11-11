package matrixStudy;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {

	public static void main(String[] args) {
		int[][] mat = {{1,9,33,73},{2,8,21,42},{3,6,16,59},{5,91,26,83}};
		List<Integer> res = printBySprialOrder(mat);
		System.out.println(res);
	}

	private static List<Integer> printBySprialOrder(int[][] mat) {
		List<Integer> result = new ArrayList<Integer>();
		int r1 = 0;
		int r2 = mat.length-1;
		int c1 = 0;
		int c2 = mat[0].length-1;
		
		while(r1 <= r2 && c1 <= c2){
			for(int c=c1; c <= c2; ++c){
				result.add(mat[r1][c]);
			}
			for(int r = r1 + 1; r <= r2; ++r){
				result.add(mat[r][c2]);
			}
			for(int c = c2-1; c >= c1; --c){
				result.add(mat[r2][c]);
			}
			for(int r = r2-1; r > r1; --r){
				result.add(mat[r][c1]);
			}
			
			r1++;
			r2--;
			c1++;
			c2--;
		}
		return result;
	}
	
	
}
