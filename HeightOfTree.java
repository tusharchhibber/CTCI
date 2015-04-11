public class HeightOfTree {

	public int getHeight(TreeNode node){
		if(node == null)
			return 0;

		return 1+Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));

	}

}