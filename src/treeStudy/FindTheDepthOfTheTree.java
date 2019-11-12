package treeStudy;

public class FindTheDepthOfTheTree {

	
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        tree.right.right.left = new Node<Integer>(4); 
        
        int depth = findDepthByRecursion(tree);
        System.out.println(depth);
	}
	
	public static int findDepthByRecursion(Node<Integer> root) {
		if(root == null)
			return 0;
		
		int leftDepth = findDepthByRecursion(root.left);
		int rightDepth = findDepthByRecursion(root.right);
		
		return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
	}
	
	public static int findDepthByStack(Node<Integer> root) {
		
		
		return 0;
	}
	
}
