// Code for "Find All Pairs less than Target" Coding Language: Java


package stringStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairsLessThan {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,3,5,6,7,8,9};
		int t = 6;
		System.out.println(solution(arr,t));
		
	}

	private static List<Integer> solution(Integer[] arr, int t) {

	List<Integer> result = new ArrayList<>();
	if(arr==null || arr.length==0){
			return result;
	}
    
/*  With Double For loop, Brute Force Approach.
//		
//		for(int i=0; i<arr.length;i++){
//			for(int j=i+1; j<arr.length;j++){
//				if(arr[i] + arr[j] < t){
//					result.add(arr[i]);
//					result.add(arr[j]);
//				}
//			}
//		}
*/		

		int firstPointer = 0;
		int lastPointer = arr.length -1;
		
		
		while(firstPointer < lastPointer){
            // Find out pair where the first time the sum is less than target, all the pairs //in between are potential pairs
            if(arr[firstPointer] + arr[lastPointer] >= t){
                lastPointer--;
            }else{
            	result = cartesianProduct(arr, firstPointer, lastPointer+1,t);
            	firstPointer = lastPointer+1;
            }
		}
		return result;
	}

	private static List<Integer> cartesianProduct(Integer[] arr, int firstPointer, int lastPointer, int t) {
		List<Integer> retResult = new ArrayList<>();
		for(int i=firstPointer; i <= lastPointer; i++){
			for(int j=i+1; j<=lastPointer; j++){
                // check if the sum is less than target.
				if(arr[i] + arr[j] < t){
					retResult.add(arr[i]);
					retResult.add(arr[j]);
				}
				
			}
		}
		return retResult;
	
	}
	
}
