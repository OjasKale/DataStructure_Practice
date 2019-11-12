package treeStudy;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxNumberInBinaryTree {

	
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
         
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        tree.right.right.left = new Node<Integer>(4); 
        
        //int max = findMaxByRecursion(tree);
        int max = findMaxByBFS(tree);
        System.out.println(max);
	}
	
	
	private static int findMaxByBFS(Node<Integer> root) {
		Integer max = Integer.MIN_VALUE;
		if(root == null){
			return max;
		}
		
		Queue<Node<Integer>> visited = new LinkedList<Node<Integer>>();
		visited.offer(root);
		
		while(!visited.isEmpty()){
			Node<Integer> temp = visited.poll();
			if((Integer)temp.data > max){
				max = temp.data;
			}
			
			if(temp.left != null){
				visited.offer(temp.left);
			}
			if(temp.right !=null){
				visited.offer(temp.right);
			}
 		}
		return max;
	}


	public static int findMaxByRecursion(Node<Integer> root) {
		Integer max = Integer.MIN_VALUE;
		if(root == null){
			return max;
		}
		int left_max = findMaxByRecursion(root.left);
		int right_max = findMaxByRecursion(root.right);
		
		if(left_max > right_max){
			max = max > left_max ? max : left_max;
		}else{
			max = max > right_max ? max : right_max;
		}
		
		if((Integer)root.data > max){
			max = (Integer)root.data;
		}
		return max;
	}
	 
}
