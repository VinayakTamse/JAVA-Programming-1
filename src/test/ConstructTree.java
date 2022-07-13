package test;

public class ConstructTree {
	
	 int data;
	 ConstructTree left;
	 ConstructTree right;
	
	public ConstructTree(int data)
	{
		this.data = data;
	}
	
	public static ConstructTree createBinaryTree()
	{
		ConstructTree rootnode = new ConstructTree(20);
		ConstructTree node20 = new ConstructTree(20);
		ConstructTree node78 = new ConstructTree(78);
		
		rootnode.left = node20;
		node20.right = node78;
		
		return rootnode;
	}

}
