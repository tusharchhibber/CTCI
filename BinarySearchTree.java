/*
Implement a function to check if a binary tree is a binary search tree
*/

public class BinarySearchTree {

	//Attempt 1: Failed, this thing only checks if current node in correctly placed in terms of 
	//the left and right node but doesn't check the node's value as a whole in Binary tree.
	public boolean isBinarySearchTree(TreeNode node) {

		if(node == null)
			return true;

		int val = node.getVal();
		int leftVal = ((node.getLeft() != null)? node.getLeft().getVal() : Integer.MIN_VALUE); 
		int rightVal = ((node.getRight() != null)? node.getRight().getVal() : Integer.MAX_VALUE); 

		if((val < leftVal) || (val > rightVal)
			return false;
		else
			return (isBinarySearchTree(node.getLeft()) && isBinarySearchTree(node.getRight()));
				
	}


	//In order traversal method
	public static int prev = Integer.MIN_VALUE;

	public boolean isBSTInOrderTraversal(TreeNode node) { 

		if(node == null) return true;

		if(!isBSTInOrderTraversal(node.getLeft())) return false;

		if(node.getVal() >= prev)
			prev = node.getVal();
		else
			return false;

		if(!isBSTInOrderTraversal(node.getRight())) return false;

		return true;
	}


	//MIN/MAX method
	//int min = Integer.MIN_VALUE;
	//int max = Integer.MAX_VALUE;
	public boolean isBSTMinMax(TreeNode node, int min, int max) {
		if(node == null)
			return true;

		int val = node.getVal();
		if((val > min) && (val < max) &&
		isBSTMinMax(node.getLeft(), min, node.getVal()) && 
		isBSTMinMax(node.getRight(), node.getVal(), max))
			return true;

		return false;
	}

}