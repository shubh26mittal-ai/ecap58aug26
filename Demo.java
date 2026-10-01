package linkedlistprograms;

//public class Demo {
//	static class Node
//	{
//		int data;
//		Node next;
//		Node(int data)
//		{
//			this.data=data;
//			this.next=null;
//		}
//	}
//
//	public static void main(String[] args) {
//		Node head=new Node(10);
//		 head.next = new Node(20);
//		head.next.next=new Node(30);
//		head.next.next.next=new Node(40);
//		Node temp =head;
//		while(temp!=null)
//		{
//			System.out.println(temp.data+" ");//10,20,30,40 
//			temp=temp.next;
//		}
//
//	}
//
//}
class Demo
{
	static class Node
	{
		int data ;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	static void traverseNodes(Node head)
	{
		Node temp = head;
		
		while(temp != null) // O(n)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		//create a nodes using linked list
		
		Node head = new Node(5);//head element
		head.next = new Node(10);
		head.next.next = new Node(15);
		head.next.next.next = new Node(20);
		
		traverseNodes(head);
		
		
		Node head1 = new Node(15);//head element
		head1.next = new Node(100);
		head1.next.next = new Node(150);
		head1.next.next.next = new Node(200);
		traverseNodes(head1);//10,15,20,15,100,150,200
		
	}
}
