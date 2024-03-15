class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() { root = null; }

	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}
	
	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node node)
	{
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left subtree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	 /* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
  void printPostorder(Node node)
  {
      if (node == null)
          return;

      // first recur on left subtree
      printPostorder(node.left);

      // then recur on right subtree
      printPostorder(node.right);

      // now deal with the node
      System.out.print(node.key + " ");
  }
	// Wrappers over above recursive functions
	void printPreorder() { printPreorder(root); }

	// Wrappers over above recursive functions
	void printInorder() { printInorder(root); }
	
	// Wrappers over above recursive functions
	void printPostorder() { printPostorder(root); }

	// Driver code
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(6);
		tree.root.right.left.left = new Node(7);
		tree.root.right.left.right = new Node(8);

		// Function call
		System.out.println(
			"\nInorder traversal of binary tree is ");
		tree.printInorder();
		
		// Function call
		System.out.println(
			"\nPreorder traversal of binary tree is ");
		tree.printPreorder();
		
		// Function call
		System.out.println(
			"\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}
}