package treeStudy;

import java.util.LinkedList;
import java.util.Queue;

public class FindAnElementInTree {
	
	
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        tree.right.right.left = new Node<Integer>(4); 
        
        
        //boolean result = findTheElementByRecursion(tree, 19);
        boolean result = findTheElementByIteration(tree,1);
        System.out.println(result);
        
        
	}
	
	public static boolean findTheElementByRecursion(Node<Integer> root, int ele){
		if(root == null){
			return false;
		}
		if((int)root.data == ele){
			return true;
		}
		
		return findTheElementByRecursion(root.left,ele) || findTheElementByRecursion(root.right, ele);
	}
	
public static boolean findTheElementByIteration(Node<Integer> root, int ele){
		
		if(root == null){
			return false;
		}
		
		Queue<Node<Integer>> visited = new LinkedList<Node<Integer>>();
		
		visited.offer(root);
		
		while(!visited.isEmpty()){
			Node<Integer> temp = visited.poll();
			if((int)temp.data == ele){
				return true;
			}
			if(temp != null){
				if(temp.left != null){
					visited.offer(temp.left);
				}
				if(temp.right != null){
					visited.offer(temp.right);
				}
			}
			
		}
		
		return false;
	}
	

}
