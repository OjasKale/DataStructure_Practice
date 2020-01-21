package arrayStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfUnsortedArr {

	public static void main(String[] args) {
		int[] arr1 = {9,2,3,1,5,4,6};
		int[] arr2 = {2,2,9,1,6};
		
		int[] res = intersectIt(arr1,arr2);
		//System.out.println(res);
		for(int i : res){
			System.out.print(i + " ");
		}
	}

	private static int[] intersectIt(int[] num1, int[] num2) {
		Arrays.sort(num1);
		Arrays.sort(num2);
		List<Integer> res = new ArrayList<Integer>();
		int i = 0, j =0;
		while(i < num1.length && j < num2.length){
			if(num1[i] == num2[j]){
				res.add(num1[i]);
				i++;
				j++;
			}else if(num1[i] < num2[j]){
				i++;
			}else{
				j++;
			}
				
		}
		int[] result = new int[res.size()];
		int cnt = 0;
		for(int num : res){
			result[cnt++] = num;
		}
		return result;
	}
	
	
	
	
}
