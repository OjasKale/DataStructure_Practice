package searchPractice;

public class FindTheClosestSquare {
	public static void main(String[] args) {
		int num = findTheNum(300);
		System.out.println(num);
	}

	private static int findTheNum(int num) {
		long left = 0, right = num;
		while(left <= right){
			long mid = left + ((right - left) / 2);
			long midSquare = mid * mid;
			if(midSquare <= num){
				left = mid + 1;
			}else{
				right = mid -1;
			}
		}
		return (int) left-1;
	}
	
	
}
