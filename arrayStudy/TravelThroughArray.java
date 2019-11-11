/*
 * Write a program to check if you can reach to the end of array.
 * {2,3,0,0,0} return true;
 * 
 */

package arrayStudy;

public class TravelThroughArray {

	
	public static void main(String[] args) {
		int[] nums = {2,1,0,0,0};
		boolean result = canReachEnd(nums);
		System.out.println(result);
	}

	private static boolean canReachEnd(int[] nums) {
		int farthestPoint = 0, index = nums.length -1;
		
		for(int i=0; i <= farthestPoint && farthestPoint <= index; ++i){
			farthestPoint = Math.max(farthestPoint, i + nums[i]);
		}
		return farthestPoint >= index;
	}
	
}
