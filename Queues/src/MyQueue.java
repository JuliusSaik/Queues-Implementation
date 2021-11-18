public class MyQueue<T> {

	public static void main(String[] args) {

	MyQueue<String> queue = new MyQueue<String>();
	
		queue.enqueue("julius");
		queue.enqueue("is");
		queue.enqueue("fucking");
		queue.enqueue("epic");

		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		
	}
	

	public static class Node<T>{
	
		private T data;
		private Node<T> next;
		private Node(T data) {
			this.data = data;
		}
		
	}
	
	private Node<T> head; //remove from head
	private Node<T> tail; //add to tail
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public T peek() {
		return head.data;
	}
	
	public void enqueue(T data) {
		Node<T> node = new Node<T>(data);
		if(tail != null) {
			tail.next = node;
		}
		tail = node;
		
		if(head == null) {
			head = node;
		}
		
	}
	
	public T dequeue() {
		
		if(head == null) {
			return null;
		}
		T data = head.data;
		
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		
		return data;
		
	}

}
