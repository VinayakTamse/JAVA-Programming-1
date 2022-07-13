package test;

public class TRee {
	
	
	class TreeNode {
		
		TreeNode right;
		TreeNode left;
		int data;
		
		public TreeNode(int data)
		{
			this.data = data;
		}
		
	}
	
	public static TreeNode createBinaryTree()
	{
		TRee t = new TRee();
		TreeNode rootnode = t.new TreeNode(90);
		TreeNode node20 = t.new TreeNode(20);
		TreeNode node56 = t. new TreeNode(56);
		TreeNode node40 = t.new TreeNode(40);
		
		rootnode.right = node20;
		rootnode.left = node56;
		
		node56.left = node40;
		
		return rootnode;
		
	}
	
	public void preOrderTraversal(TreeNode node)
	{
		if (node != null)
		{
			System.out.println(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public static void main(String[] args) {
		TRee t = new TRee();
		TreeNode root = createBinaryTree();
		t.preOrderTraversal(root);
	}
	

}
