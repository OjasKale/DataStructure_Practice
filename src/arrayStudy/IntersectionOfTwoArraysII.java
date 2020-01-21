package arrayStudy;

import java.util.ArrayList;

public class IntersectionOfTwoArraysII {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2,2,1};
		
		int[] res = intersect(nums1, nums2);
		
		for(int num: res){
			System.out.print(num + " ");
		}
		
		
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        int[] s1 = nums1.length > nums2.length ? nums1 : nums2;
        int[] s2 = nums2.length > nums1.length ? nums1 : nums2;
        ArrayList<Integer> result = new ArrayList<>();
        int startingNum = s2[0];
        int i = 0, j=0;
        while(i < s1.length && s1[i] != startingNum){
        	i++;
        }
        
        while(i < s1.length && j < s2.length){
        	if(s1[i] == s2[j]){
        		result.add(s1[i]);
        	}
        	i++;
    		j++;
        }
       int[] arr = new int[result.size()];
       for(int p=0; p < result.size(); p++){
    	   arr[p] = result.get(p);
       }
        return arr;
    }

}
