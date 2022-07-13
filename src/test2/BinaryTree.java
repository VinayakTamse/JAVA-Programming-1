package test2;

public class BinaryTree {
	
	
	static class Treenode {													/*40
																		50				90
																		
																61			23			89		76
																
														10							*/
		
		int data;
		Treenode left;
		Treenode right;
		
		Treenode(int data)
		{
			this.data = data;
		}
		
		
	}
	
	public static Treenode createBinaryTree()
	{
		Treenode rootnode = new Treenode(40);
		Treenode node50 = new Treenode(50);
		Treenode node90 = new Treenode(90);
		Treenode node61 = new Treenode(61);
		Treenode node23 = new Treenode(23);
		Treenode node89 = new Treenode(89);
		Treenode node76 = new Treenode(76);
		Treenode node10 = new Treenode(10);
		
		rootnode.left = node50;
		rootnode.right = node90;
		
		node50.left = node61;
		node50.right = node23;
		
		node90.left = node89;
		node90.right = node76;
		
		node61.left = node10;
		
		return rootnode;
		
		
	}
	
	public void preOrderTraversal(Treenode root)
	{
		if (root != null)
		{
			System.out.print(root.data + " ");
			
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void inOrderTraversal(Treenode node)
	{
		if (node != null)
		{
			inOrderTraversal(node.left);
			System.out.print(node.data + " ");
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(Treenode node)
	{
		if (node != null)
		{
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		Treenode root = createBinaryTree();
		System.out.println("\nPre order traversal");
		b.preOrderTraversal(root);
		
		System.out.println("\nIn order traversal");
		b.inOrderTraversal(root);
		System.out.println("\nPost order traversal");
		b.postOrderTraversal(root);
	}
	

}
