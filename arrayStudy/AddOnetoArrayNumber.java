package arrayStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * 
 * Given an array of integer add one to the array Number
 * e.g. [1,2,9] => [1,3,0]
 * 
 * 
 */


public class AddOnetoArrayNumber {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		A.add(9);
		A.add(9);
		A.add(9);
		
		List<Integer> result = plusOne(A);
		System.out.println(result);
	}
	
	public static List<Integer> plusOne(List<Integer> A) {
		
		int n = A.size()-1;
		
		A.set(n, A.get(n)+1);
		for(int i = n; i > 0 && A.get(i) == 10; --i){
			System.out.println("I am here with " + i + " And A of I " + A.get(i) );
			A.set(i, 0);
			A.set(i-1, A.get(i-1)+1);
		}
		
		if(A.get(0) == 10){
			A.set(0, 1);
			A.add(0);
		}
		return A;
	}
	
	
}
