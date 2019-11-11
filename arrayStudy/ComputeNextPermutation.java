package arrayStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputeNextPermutation {
	public static void main(String[] args) {
		int[] nums = {6,2,1,5,4,3,0};
		List<Integer> res = computerNextPermutation(nums);
		System.out.println(res);
	}

	private static List<Integer> computerNextPermutation(int[] num) {
		if(num == null || num.length == 0){
			return new ArrayList<Integer>();
		}
		List<Integer> nums = new ArrayList<>();
		for(int i=0; i< num.length;++i){
			nums.add(num[i]);
		}
		int inversionPt = nums.size() -2;
		while(inversionPt >= 0){
			if(num[inversionPt] < num[inversionPt+1]){
				break;
			}
			inversionPt--;
		}
		if(inversionPt == -1){
			Collections.reverse(nums);
			return nums;
		}
		for(int i= nums.size()-1; i > inversionPt; --i ){
			if(nums.get(i) > nums.get(inversionPt)){
				Collections.swap(nums, inversionPt, i);
				break;
			}
		}
		
		Collections.reverse(nums.subList(inversionPt+1, nums.size()));
		
		return nums;
	}
}
