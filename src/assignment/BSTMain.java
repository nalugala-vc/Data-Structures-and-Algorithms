package assignment;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BSTMain extends BSTree {
	
	public BSTNode root;
	 //iterative postorder
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 
	    // An iterative function to do postorder traversal
	    // of a given binary tree
	    ArrayList<Integer> postOrderIterative(BSTNode node)
	    {
	        Stack<BSTNode> S = new Stack<BSTNode>();
	 
	        // Check for empty tree
	        if (node == null)
	            return list;
	        S.push(node);
	        BSTNode prev = null;
	        while (!S.isEmpty()) {
	            BSTNode current = S.peek();
	 
	            /* go down the tree in search of a leaf an if so
	            process it and pop stack otherwise move down */
	            if (prev == null || prev.left == current || prev.right == current) {
	                if (current.left != null)
	                    S.push(current.left);
	                else if (current.right != null)
	                    S.push(current.right);
	                else {
	                    S.pop();
	                    list.add(current.data);
	                }
	 
	                /* go up the tree from left node, if the
	                child is right push it onto stack otherwise
	                process parent and pop stack */
	            }
	            else if (current.left == prev) {
	                if (current.right != null)
	                    S.push(current.right);
	                else {
	                    S.pop();
	                    list.add(current.data);
	                }
	 
	                /* go up the tree from right node and after
	                coming back from right node process parent
	                and pop stack */
	            }
	            else if (current.right == prev) {
	                S.pop();
	                list.add(current.data);
	            }
	 
	            prev = current;
	        }
	 
	        return list;
	    }
	 // An iterative process to print preorder traversal of Binary tree
	    public void iterativePreorder(BSTNode node)
	    {
	 
	        // Base Case
	        if (node == null) {
	            return;
	        }
	 
	        // Create an empty stack and push root to it
	        Stack<BSTNode> nodeStack = new Stack<BSTNode>();
	        nodeStack.push(root);
	 
	        /* Pop all items one by one. Do following for every popped item
	         a) print it
	         b) push its right child
	         c) push its left child
	         Note that right child is pushed first so that left is processed first */
	        while (nodeStack.empty() == false) {
	 
	            // Pop the top item from stack and print it
	            BSTNode mynode = nodeStack.peek();
	            System.out.print(mynode.data + " ");
	            nodeStack.pop();
	 
	            // Push right and left children of the popped node to stack
	            if (mynode.right != null) {
	                nodeStack.push(mynode.right);
	            }
	            if (mynode.left != null) {
	                nodeStack.push(mynode.left);
	            }
	        }
	       }
	 // An iterative process to print inorder traversal of Binary tree
	    public void IterativeInorder()
	    {
	        if (root == null)
	            return;
	 
	 
	        Stack<BSTNode> s = new Stack<BSTNode>();
	        BSTNode curr = root;
	 
	        // traverse the tree
	        while (curr != null || s.size() > 0)
	        {
	 
	            /* Reach the left most Node of the
	            curr Node */
	            while (curr !=  null)
	            {
	                /* place pointer to a tree node on
	                   the stack before traversing
	                  the node's left subtree */
	                s.push(curr);
	                curr = curr.left;
	            }
	 
	            /* Current must be NULL at this point */
	            curr = s.pop();
	 
	            System.out.print(curr.data + " ");
	 
	            /* we have visited the node and its
	               left subtree.  Now, it's right
	               subtree's turn */
	            curr = curr.right;
	        }
	    }


	//method to create a new binary tree
	public void newBinaryTree() {
		//creating the various nodes
		BSTNode firsTree=new BSTNode(9);
		BSTNode secndTree=new BSTNode(2);
		BSTNode thirdTree=new BSTNode(4);
		BSTNode fourthTree=new BSTNode(7);
		BSTNode fifthTree=new BSTNode(8);
		BSTNode sixthBstNode=new BSTNode(5);
		BSTNode sevenTree=new BSTNode(3);
		BSTNode eighthTree=new BSTNode(8);
		
		//creating the relationship between the various nodes
		root=firsTree;
		firsTree.right=thirdTree;
		firsTree.left=secndTree;
		secndTree.left=fourthTree;
		secndTree.right=fifthTree;
		thirdTree.left=sixthBstNode;
		thirdTree.right=sevenTree;
		//sixthBstNode.left=eighthTree;
		
	}
	

	public static void main(String[] args) {
		
		//preorder
		BSTMain main=new BSTMain();
		main.newBinaryTree();
		System.out.println("Recursive preorder");
		main.preorder(main.root);
		System.out.println(" ");
		System.out.println("iterative preorder");
		main.iterativePreorder(main.root);
		
		System.out.println("");
		
		//postorder
		BSTMain main2=new BSTMain();
		main2.newBinaryTree();
		System.out.println("recursive postorder");
		main2.postorder(main.root);
		System.out.println(" ");
		System.out.println("iterative postorder");
		System.out.println(main2.postOrderIterative(main.root));
		
		//indoder
		BSTMain main3=new BSTMain();
		main3.newBinaryTree();
		System.out.println("recursive inorder");
		main3.inorder(main3.root);
		System.out.println(" ");
		System.out.println("iterative inorder");
		main3.IterativeInorder();
		
	

	}

}
