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
		
		int[] a = {1,2,2,4,5,6};
		int[] b = new int[a.length+1];
		System.out.print("Before");
		for(int num : b){
			System.out.print(num);
		}
		b = Arrays.copyOf(a, a.length+1);
		System.out.print("After");
		for(int num : b){
			System.out.print(num);
		}
		List<Integer> result = plusOne(A);
		System.out.println(result);
	}
	
	public static List<Integer> plusOne(List<Integer> A) {
		
		int n = A.size()-1;
		
		A.set(n, A.get(n)+1);
		for(int i = n; i > 0 && A.get(i) == 10; --i){
			
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
