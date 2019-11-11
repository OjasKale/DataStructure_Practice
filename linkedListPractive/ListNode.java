package linkedListPractive;

public class ListNode<T> {

	public T data;
	public ListNode<T> next;
	
	ListNode (T val, ListNode<T> next){
		this.data = val;
		this.next = next;
	}
	
}
