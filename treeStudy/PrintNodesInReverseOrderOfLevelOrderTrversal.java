package treeStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintNodesInReverseOrderOfLevelOrderTrversal {
	
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        tree.right.right.left = new Node<Integer>(4);
        
        ArrayList<Integer> res = printTree(tree);
        System.out.println(res);
	}

	private static ArrayList<Integer> printTree(Node<Integer> root) {
		Stack<Integer> retStack = new Stack<>();
		if(root == null){
			return null;
		}
		
		Queue<Node<Integer>> q = new LinkedList<Node<Integer>>();
		q.offer(root);
		while(!q.isEmpty()){
			Node<Integer> temp = q.poll();
			if(temp!=null){
				retStack.push((int)temp.data);
				if(temp.left != null){
					q.offer(temp.left);
				}
				if(temp.right != null){
					q.offer(temp.right);
				}
			}
		}
		
		ArrayList<Integer> retList = new ArrayList<>();
		while(!retStack.isEmpty()){
			retList.add(retStack.pop());
		}
		return retList;
	}
	
	
	

}
