package arrayStudy;

public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,1,2,3,3};
		int res = removeDuplicates(arr);
		System.out.println(res);
	}
	
	public static int removeDuplicates(int[] nums) {
        if(nums.length < 2)
        	return 0;
        
        int result = nums.length;
        int pt1 = 0, pt2 = 2;
        while(pt2 < nums.length){
        	if(nums[pt1] == nums[pt2])
        		result--;
        	pt1++;
        	pt2++;
        }
        return result;
    }

}
