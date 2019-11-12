package searchPractice;

public class CyclicSortedArray {
	
	public static void main(String[] args) {
		int[] arr = {103,203,220,234,279,368,378,478,550,631};
		int index = findTheStartOfCycle(arr);
		System.out.println(index);
	}

	private static int findTheStartOfCycle(int[] arr) {
		int left = 0, right = arr.length-1;
		while(left < right){
			int mid = left + ((right - left) / 2);
			if(arr[mid] > arr[right]){
				left = mid + 1;
			}else{
				right = mid;
			}
		}
		return left;
	}
	
	

}
