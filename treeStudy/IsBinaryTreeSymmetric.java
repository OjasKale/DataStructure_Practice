package treeStudy;

public class IsBinaryTreeSymmetric {

	public static void main(String[] args) {
		Node<Integer> tree1 = new Node<Integer>(2); 
//        tree1.left = new Node<Integer>(7); 
//        tree1.right = new Node<Integer>(5); 
//        tree1.left.right = new Node<Integer>(6); 
//        tree1.left.right.left = new Node<Integer>(1); 
//        tree1.left.right.right = new Node<Integer>(11); 
//        tree1.right.right = new Node<Integer>(9); 
//        tree1.right.right.left = new Node<Integer>(4);
		
		tree1.left = new Node<Integer>(6);
        tree1.right = new Node<Integer>(6);
        tree1.left.right = new Node<Integer>(2);
        tree1.left.right.right = new Node<Integer>(3);
        tree1.right = new Node<Integer>(6);
        tree1.right.left = new Node<Integer>(2);
        tree1.right.left.left = new Node<Integer>(3);
        boolean res = isTreeSymmetric(tree1.left, tree1.right);
        System.out.println(res);
	}
	
	public static boolean isTreeSymmetric(Node<Integer> root1, Node<Integer> root2){
		
		if(root1==null && root2==null){
			return true;
		}else if(root1 != null && root2 != null){
			return root1.data == root2.data && isTreeSymmetric(root1.left,root2.right) && isTreeSymmetric(root1.right,root2.left);
		}
		
		return false;
	}
}
