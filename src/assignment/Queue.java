package assignment;

public class Queue<T> {
	/*Write a Java class that implements queues based on a linked list.
b) Write a test class for the class in (a). This class should have a main method. Queue 5 elements and 
dequeue four elements.
c) Implement an underflow testing and give appropriate message for it.
d) Is overflow testing necessary in this case? Explain.*/
	//address for the front node
	private Node<T> front;
	//address for the back node
	private Node<T> back;
	//variable for the length of our queue
	private int len;
	
	//creating the Node class
	private static class Node<T>{
		//generic data type
		private final T data;
		//address for the next node
		private Node<T> Next;
		
		
		//creating the constructor for our node class
		public Node(T data) {
			super();
			this.data=data;
			this.Next=null;
		}
	}
	
	public void enqueue(T data) {
	    //check if the front nod is null or if the queue is empty
		if(front==null) {
			back=new Node<T>(data);
			//if queue has only one item then both front and rear nodes will point to the same node
			front=back;		
	   }else {
		   back.Next=new Node<T>(data);
		   //Incrementing the back node by 1 once an item is added to the queue
		   back=back.Next;
	   }
		//increment the length of the queue by 1
		len++;
	}
	public T dequeue() {
		//underflow testing
		if(isempty()) {
			System.out.println("Queue empty:Cannot remove any more items");
		}
		//if there is some data in the queue
		if(front!=null) {
			T result= front.data;
			//front should be moved to the next node in the queue
			front=front.Next;
			//decrement the length by 1
			len--;
			return result;			
		}
		
		return null;
		
	}
	//returns the current size of the queue
	public int length() {
		return len;
	}
	//function to display the items in the queue
	public void show() {
		//assign the current node to the front node
		Node<T>currentNode=front;
		//as long as there is some data in the queue
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			//moving the current node pointer to the next node
			currentNode=currentNode.Next;
		}
		
	}
	public boolean isempty() {
		return len==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing the queue class
		Queue<Integer> queue=new Queue<>();
		//adding items to the queue
		queue.enqueue(10);
		queue.enqueue(3);
		queue.enqueue(17);
		queue.enqueue(35);
		queue.enqueue(70);
		
		//displaying the items in our queue
		queue.show();
		System.out.println("");
		
		//removing items from the queue
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		
		//displaying the remaining items in our queue
		queue.show();
		
		
		//overflow testing is not necessary since the max-size is not defined
		
		
		

	}

}
