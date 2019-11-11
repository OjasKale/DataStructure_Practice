package arrayStudy;

public class TrappedRainWater {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappedWater(arr));
	}
	
	public static int trappedWater(int[] height){
		int currMax = 0;
        int[] leftMax = new  int[height.length];
        int[] rightMax = new  int[height.length];
        for(int i = 0; i < height.length; i++){
            if(height[i] > currMax){
                leftMax[i] = height[i];
                
            }else{
                leftMax[i] = currMax;
            }
        }
        
        currMax = 0;
        
        for(int j = height.length-1; j >= 0; j--){
            if(height[j] > currMax){
                rightMax[j] = height[j];
                currMax = height[j];
            }else{
                rightMax[j] = currMax;
            }
        }
        
        int result = 0;
        for(int k=0; k < height.length; k++){
        	//System.out.print("Left Max: " + leftMax[k]);
            //System.out.print("right Max: " + rightMax[k]);
        	int temp = Math.abs(height[k] - Math.min(leftMax[k],rightMax[k]));
            //System.out.println(temp);
            result = result + temp;
        }
        
        return result;
	}
	
}
