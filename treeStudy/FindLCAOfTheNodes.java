package treeStudy;

public class FindLCAOfTheNodes {
	
	public static void main(String[] args) {
		Node<Integer> tree = new Node<Integer>(2); 
        tree.left = new Node<Integer>(7); 
        tree.right = new Node<Integer>(5); 
        tree.left.right = new Node<Integer>(6); 
        Node<Integer> node1 = tree.left.right.left = new Node<Integer>(1); 
        tree.left.right.right = new Node<Integer>(11); 
        tree.right.right = new Node<Integer>(9); 
        Node<Integer> node2 = tree.right.right.left = new Node<Integer>(4); 
        
        //Node<Integer> node1 = new Node<Integer>(1);
        //Node<Integer> node2 = new Node<Integer>(11);
        Status res = findTheLCA(tree,node1, node2);
        System.out.println(res.ancestor.data);
	}
	
	private static class Status {
		public int numTargetNodes;
		Node<Integer> ancestor;
		
		public Status(int numTargets, Node<Integer> node){
			this.numTargetNodes = numTargets;
			this.ancestor = node;
		}
	}
	
	public static Status findTheLCA(Node<Integer> root, Node<Integer> node1, Node<Integer> node2){
		if(root == null){
			return new Status(0, null);
		}
		
		Status leftSubTree = findTheLCA(root.left, node1, node2);
		if(leftSubTree.numTargetNodes == 2){
			return new Status(leftSubTree.numTargetNodes, leftSubTree.ancestor);
		}
		
		Status rightSubTree = findTheLCA(root.right, node1, node2);
		if(rightSubTree.numTargetNodes == 2){
			return rightSubTree;
		}
		
		int numTargets = leftSubTree.numTargetNodes + rightSubTree.numTargetNodes + (root == node1 ? 1 : 0) + (root == node2 ? 1 : 0);
		return new Status(numTargets, numTargets == 2 ? root : null);
	}

}
