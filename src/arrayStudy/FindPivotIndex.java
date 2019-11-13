package arrayStudy;

public class FindPivotIndex {

	
	public static void main(String[] args) {
		int[] arr = {1, 7, 3, 6, 5, 6};
		
		int ind = pivotIndex(arr);
		System.out.println(ind);
	}
	
	public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for(int x : nums){
        	sum += x;
        }
        
        for(int i = 0; i < nums.length; ++i){
        	if(leftSum == sum - leftSum - nums[i])
        		return i;
        	leftSum += nums[i];
        }
        return -1;
    }
}
