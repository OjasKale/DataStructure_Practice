package searchPractice;

public class FindElementEqualToIndex {
	public static void main(String[] args) {
		int[] arr = {-2,-1,0,0,2,2,6};
		int index = findTheElementWithIndex(arr);
		System.out.println(index);
	}

	private static int findTheElementWithIndex(int[] arr) {
		int left = 0,right = arr.length-1;
		while(left <= right){
			int mid = left + ((right - left) /2);
			int diff = arr[mid] - mid;
			if(diff == 0){
				return mid;
			}else if(diff > 0){
				right = mid -1;
			}else{
				left = mid+1;
			}
		}
		return -1;
	}
}
