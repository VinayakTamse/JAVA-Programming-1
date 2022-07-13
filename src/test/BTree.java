package test;

public class BTree {
	
	public void preOrderTraversal(ConstructTree root)
	{
		if (root != null)
		{
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		BTree b = new BTree();
		ConstructTree root = ConstructTree.createBinaryTree();
		b.preOrderTraversal(root);
		
		
	}
	
	

}
