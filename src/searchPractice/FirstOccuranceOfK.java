package searchPractice;


public class FirstOccuranceOfK {

	public static void main(String[] args) {
		int[] arr = {-14,-10,2,108,108,243,285,285,285,285,401};
		
		int index = findTheK(108 ,arr);
		
		System.out.println(index);
		
	}

	private static int findTheK(int i, int[] arr) {
		int left = 0,right = arr.length-1, result = -1;
		
		while(left <= right){
			int mid = left + ((right - left) / 2);
			
			if(arr[mid] > i){
				right = mid -1;
			}else if(arr[mid] == i){
				result = mid;
				right = mid -1;
			}else{
				left = mid + 1;
			}
		}
		return result;
	}
	
	
	
	
}
