/*
Implement a function to check if a binary tree is balanced. For the purposes of
this question, a balanced tree is defined to be a tree such that the heights of the
two subtrees of any node never differ by more than one.

*/

public class BalancedTree {

	public static void main(String[] args){


	}

	public boolean isBalancedTree(TreeNode root){

		if(root == null)
			return true;

		int heightDifference = getHeight(root.getLeft()) - getHeight(root.getRight());

		if(Math.abs(heightDifference) > 1)
			return false;
		else
			return (isBalancedTree(root.getLeft()) && isBalancedTree(root.getRight()));

	}

	public int getHeight(TreeNode node){
		if(node == null)
			return 0;

		return 1+Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));

	}

}


class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private int val;
	
	public TreeNode(int val){
		this.val = val;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
}
