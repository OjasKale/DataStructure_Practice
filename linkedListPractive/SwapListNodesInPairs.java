package linkedListPractive;

public class SwapListNodesInPairs {
	
	public static void main(String[] args) throws Exception {
		ListNode<Integer> A = new ListNode<Integer>(1, null);
		ListNode<Integer> tracker = A;
		for(int i=2; i< 5; i++){
			ListNode<Integer> temp = new ListNode<Integer>(i, null);
			tracker.next = temp;
			tracker = tracker.next;
		}
		
		ListNode Res = swapPairs(A);
		
		
	}
	
	
	
	public static ListNode<Integer> swapPairs(ListNode<Integer> A) throws Exception{
		ListNode<Integer> prev = A;
        ListNode<Integer> curr = A.next;
        
        if(curr == null){
            return A;
        }
        
        while(curr.next != null){
            prev.next = curr.next;
            curr.next = prev;
            prev = prev.next;
            curr = curr.next.next;
        }
        
        
        return A;
	}

}
