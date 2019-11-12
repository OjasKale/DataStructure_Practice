package stackStudy;

import java.util.ArrayList;

public class RainWaterTrapped {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(2);
		arr.add(1);
		arr.add(0);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(0);
		System.out.println("Result: " + trapWater(arr));
	}
	
	public static int trapWater(ArrayList<Integer> A){
		int[] left_max = new int[A.size()];
		int[] right_max = new int[A.size()];
		int result = 0;
		left_max[0] = A.get(0);
		for(int i=1; i<A.size(); i++){
			left_max[i] = Math.max(left_max[i-1], A.get(i));
		}
		
		right_max[A.size()-1] = A.get(A.size()-1);
		for(int j=A.size()-2; j >= 0; j-- ){
			right_max[j] = Math.max(right_max[j+1], A.get(j));
		}
		
		for(int k=0; k < A.size(); k++){
			result += (Math.min(left_max[k], right_max[k]) - A.get(k));
		}
		return result;
	}
	
}
