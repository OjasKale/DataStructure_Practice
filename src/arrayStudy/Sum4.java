package arrayStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import javafx.util.Pair;

public class Sum4 {
	public static void main(String[] args) {
		int[] nums = {-4,-3,-2,-1,0,0,1,2,3,4};
		List<List<Integer>> res = get4Sum(nums, 0);
		for (List<Integer> list : res) {
			System.out.println(list);
		}
	}

	private static List<List<Integer>> get4Sum(int[] nums, int target) {
		//List<Pair<Integer, Integer>> motherList = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j<nums.length; j++){
				List<Pair<Integer, Integer>> sums = hasTwoSum(nums, ((target - nums[i])-nums[j]), i, j);
				if(sums != null){
					for(Pair<Integer, Integer> sum : sums ){
						List<Integer> tempList = new ArrayList<>();
						tempList.add(nums[i]);
						tempList.add(nums[j]);
						tempList.add(sum.getKey());
						tempList.add(sum.getValue());
						Collections.sort(tempList);
						if(!res.contains(tempList)){
							res.add(tempList);
						}
					}
				}
			}
		}
		
		return res;
	}

	private static List<Pair<Integer, Integer>> hasTwoSum(int[] nums, int t,int i, int j) {
		HashSet<Integer> set = new HashSet<>();
		List<Pair<Integer, Integer>> res = new ArrayList<>();
		for(int p = 0; p < nums.length; p++){
			if(p != i && p != j){
				if(set.contains(t - nums[p])){
					res.add(new Pair<Integer, Integer>(nums[p], t -nums[p]));
				}else{
					set.add(nums[p]);
				}
			}
		}
		return res;
	}

}
