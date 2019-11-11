package linkedListPractive;

import java.util.LinkedList;

public class AddTwoLinkedLists {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(3);
		l1.add(1);
		l1.add(4);
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(7);
		l2.add(0);
		l2.add(9);
		
		LinkedList<Integer> res = GiveTheSum(l1,l2);
		System.err.println(res);
	}
	
	public static LinkedList<Integer> GiveTheSum(LinkedList<Integer> l1, LinkedList<Integer> l2){
		return null;
	}
	
}
