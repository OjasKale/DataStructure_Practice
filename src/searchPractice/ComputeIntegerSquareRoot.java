package searchPractice;

public class ComputeIntegerSquareRoot {

	
	public static void main(String[] args) {
		int result = squareRoot(99);
		System.out.println(result);
	}
	
	public static int squareRoot(int k) {
		long left = 0,right = k;
		while(left <= right ){
			long mid = left + ((right - left)/2);
			long midSquare = mid * mid;
			if(midSquare <= k){
				left = mid + 1;
			}else{
				right = mid-1;
			}
		}
		return (int) left -1;
	}
	
}
