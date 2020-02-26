package mockPracticeLeetCode;

import java.util.ArrayList;
import java.util.List;

public class NestedIterator {
	
	public static void main(String[] args) {
		tryIt();
	}

	public static void tryIt(){
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(6);
		ints.add(99);
		ints.add(123);
		ints.add(4);
		List<List<Integer>> nT = new ArrayList<>();
		nT.add(ints);
		System.out.println(nT.toString());
	}
}
