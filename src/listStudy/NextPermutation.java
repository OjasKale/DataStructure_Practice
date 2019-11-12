package listStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(9);
		arr.add(2);
		arr.add(8);
		arr.add(7);
		arr.add(6);
		List<Integer> res = giveNextPermutation(arr);
		System.out.println(res);
	}

	private static List<Integer> giveNextPermutation(List<Integer> arr) {
		int inversion_index = arr.size()-2;
		
		while(inversion_index >= 0 && arr.get(inversion_index) > arr.get(inversion_index+1)){
			--inversion_index;
		}
		
		if(inversion_index == -1){
			Collections.reverse(arr);
			return arr;
		}
		
		for(int i = arr.size() -1; i >= inversion_index; --i){
			if(arr.get(i) > arr.get(inversion_index)){
				Collections.swap(arr, inversion_index, i);
				break;
			}
		}
		
		Collections.reverse(arr.subList(inversion_index+1, arr.size()));
		return arr;
	}
	
	

}
