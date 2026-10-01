package linkedlistprograms;

public class InsertValueToNode {
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public static Node insertValueTotheStart(Node head , int value)
	{
		Node newNode = new Node(value); // Node newNode = new Node(5);
		newNode.next = head;  // link current head that is 10 to the new head 5
		head = newNode; // make 5 as the current head
		
		return head;
	}
	
	static void display(Node head)
	{
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		
		head = insertValueTotheStart(head , 5);
		
		display(head);//5,10,20,30,40


	}

}
public class InsertValueToNode {

	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public static Node insertValueTotheEnd(Node head , int value)
	{
		Node newNode = new Node(value); // Node newNode = new Node(50);
		
		if(head == null)
		{
			return newNode;
		}
		
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = newNode;
		
		return head;
		
	}
	
	static void display(Node head)
	{
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		
		head = insertValueTotheEnd(head , 50);
		
		display(head);//10,20,30,40,50

	}

}