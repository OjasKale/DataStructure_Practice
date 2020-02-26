package treeStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLevelByLevelTree {
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        tree.right.right.left = new Node<Integer>(4); 
        
        System.out.println(printLevelByLevel(tree));
	}
	
	public static List<List<Integer>> printLevelByLevel(Node<Integer> root) { 
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<Node<Integer>> q = new LinkedList<>();
		if(root != null){
			q.offer(root);
			while(!q.isEmpty()){
				Queue<Node<Integer>> temp = new LinkedList<>();
				List<Integer> resTemp = new ArrayList<>();
				while(!q.isEmpty()){
					Node<Integer> nd = q.poll();
					resTemp.add(nd.data);
					if(nd.left != null){
						temp.offer(nd.left);
					}
					if(nd.right != null){
						temp.offer(nd.right);
					}
				}
				q = temp;
				res.add(resTemp);
			}
			
		}
		
		return res;
	}

}
