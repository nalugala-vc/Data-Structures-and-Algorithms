package assignment;

public class Question4 {
	/*Write a Java class that implements stacks based on a linked list.
b) Write a test class for the class in (a). This class should have a main method. Push 5 elements and pop 
four elements.
c) Implement an underflow testing and give appropriate message for it.
*/
	//address for the 1st node/top node
	private Node topNode;
	//variable for the size of the list
	private int size;
	
	private class Node{
		private int data;
		//address for the next node
		private Node nextNode;
		
		//constructor for the node class
		public Node(int data) {
			this.data=data;
			this.nextNode=null;
		}
		
	}
	//creating a method to add/push items into the stack
		public void push(int i) {
			//creating a new node=>tempNode
			Node tempNode=new Node(i);
			//current node is pushed down
			tempNode.nextNode=topNode;
			//newly inserted node is now the top
			topNode=tempNode;
			//after inserting a node the size has to increament by 1
			size++;
			
			
		}
		//function to remove/pop items from the stack
		public int pop() {
			//check if the stack is empty
			if(isempty()) {
				System.out.println("Stack is empty");
			}
			int result=  topNode.data;
			//moving the pointer to the next node
			topNode=topNode.nextNode;
			//decrease size by 1
			size--;
			return result; 
			
		}
		
		//function to check the size of the stack
		public int size() {
			return size;
		}
		//returns true if size==0
		public boolean isempty() {
			return size==0;
			
		}
		//function to print the items in our stack
		public void show() {
			//creating a current node which is the top node in the stack
			Node curentNode=topNode;
			//as long as the current node is not null we print out the data in the stack
			while(curentNode!=null) {
				System.out.print(curentNode.data+" ");
				//switching the pointer to the next node in the stack
				curentNode=curentNode.nextNode;
			}
		}
		
	
	public static void main(String [] args) {
		//initializing the New Stack Class 
		Question4 class1=new Question4();
		//pushing 5 elements onto the stack
		class1.push(12);
		class1.push(34);
		class1.push(4);
		class1.push(24);
		class1.push(8);
		//function to print out the results
		class1.show();
		System.out.println("");
		//popping 4v elements from the stack
		class1.pop();
		class1.pop();
		class1.pop();
		class1.pop();
		//function to show the result
	    class1.show();
		
	}

}
