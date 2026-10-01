package linkedlistprograms;
public class DoubleLinkedListTravers {
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head;
	
	
	void insert(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = newNode; //20
		newNode.prev=temp; // 10 20 30 40
	}
	
	 void displayForward()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	public static void main(String[] args) {
		 DoubleLinkedListTravers d = new DoubleLinkedListTravers();
		d.insert(10);
		d.insert(20);
		d.insert(30);
		d.insert(40);
		d.insert(50);
		
		d.displayForward();//10,20,30,40,50

	}

}
	public class DoubleLinkedListTravers {
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head;
	Node tail;
	
	
	void insert(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	 void displayForward()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	 
	 void displayBackward()
		{
			Node temp = tail;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.prev;
			}
			
		}

	public static void main(String[] args) {
		
		 DoubleLinkedListTravers d = new DoubleLinkedListTravers();
			d.insert(10);
			d.insert(20);
			d.insert(30);
			d.insert(40);
			d.insert(50);
			
			System.out.println("Forward : ");
			d.displayForward();//10,20,30,40,50
			
			System.out.println("Backward : ");
			d.displayBackward();//50,40,30,20,10

	}

}