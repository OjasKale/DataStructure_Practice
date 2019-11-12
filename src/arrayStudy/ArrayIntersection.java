package arrayStudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayIntersection {

	
	public static void main(String[] args) {
		int[] nums1 = {1,33,2,91,2,3};
		int[] nums2 = {2,3,2};
		int[] res = intersect(nums1,nums2);
		for(int i: res){
			System.out.println(i);
		}
		
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
	       List<Integer> res = new ArrayList<>();
	       HashSet<Integer> numSet = new HashSet<>();
	       for(int num : nums1){
	    	   numSet.add(num);
	       }
	       
	       for(int i =0; i < nums2.length; ++i){
	    	   if(numSet.contains(nums2[i])){
	    		   numSet.remove(nums2[i]);
	    		   res.add(nums2[i]);
	    	   }
	       }
	       
	       
	       int[] result = new int[res.size()];
	       for(int i=0; i< res.size();++i){
	    	   result[i] = res.get(i);
	       }
	       return result;
	}
}
