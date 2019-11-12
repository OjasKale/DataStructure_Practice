package treeStudy;

import java.util.LinkedList;
import java.util.Queue;

public class FindSizeOfATree {

	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        tree.right.right.left = new Node<Integer>(4); 
        
        //int size = findSizeByRecursion(tree);
        int size = findSizeByIterativeMethod(tree);
        
        System.out.println(size);
	}

	private static int findSizeByIterativeMethod(Node<Integer> root) {
		int size = 0;
		if(root == null){
			return 0;
		}
		
		Queue<Node<Integer>> q = new LinkedList<Node<Integer>>();
		q.offer(root);
		
		while(!q.isEmpty()){
			Node<Integer> temp = q.poll();
			size++;
			if(temp != null){
				if(temp.left != null){
					q.offer(temp.left);
				}
				if(temp.right != null){
					q.offer(temp.right);
				}
			}
		}
		return size;
		
	}

	private static int findSizeByRecursion(Node<Integer> root) {
		if(root == null){
			return 0;
		}
		
		int leftSize = findSizeByRecursion(root.left);
		int rightSize = findSizeByRecursion(root.right);
		
		return 1 + leftSize + rightSize;
	}
	
}
