class Node{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
	
}
public class Bst {
	Node root;
	Bst()
	{
		this.root = null;
	}
	public static void main(String[] args) {
		Bst ob = new Bst();
		int arr[] = {50,13,25,34,63,46,74,33};
		for(int data : arr)
		{
			ob.root = ob.insert(data,ob.root);
		}
		ob.inOrder(ob.root);
	}
	private Node insert(int data,Node root) {
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		else
		{
			if(root.data == data)
			{
				System.out.println("Duplicate");
				return root;
			}
			else if (data<root.data)
			{
				root.left = insert(data, root.left);
			}
			else
			{
				root.right = insert(data,root.right);
			}
			return root;
		}
	}
	void postOrder(Node root)
	{
		if (root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
			
	}
	void inOrder(Node root)
	{
		if (root != null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
			
		}
			
	}
	
}
