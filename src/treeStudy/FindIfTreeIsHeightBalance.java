package treeStudy;

public class FindIfTreeIsHeightBalance {
	
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        //tree.right.right = new Node<Integer>(9); 
        //tree.right.right.left = new Node<Integer>(4);
        
        if(tree == null){
        	System.out.println("Blanaced!!");
        }else{
        	int leftH = calculateHeight(tree.left);
        	int rightH = calculateHeight(tree.right);
        	System.out.println(leftH);
        	System.out.println(rightH);
        	if(Math.abs(rightH - leftH) >= 2 ){
        		System.out.println("Not Balaced");
        	}else{
        		System.out.println("Balaced!!");
        	}
        }
	}

	private static int calculateHeight(Node<Integer> root) {
		if(root == null){
			return 0;
		}
		
		int leftHeight = calculateHeight(root.left);
		int rightHeight = calculateHeight(root.right);
		
		return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1; 			
	}

}
