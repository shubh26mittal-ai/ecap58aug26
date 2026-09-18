package collections.queue;
import java.util.ArrayDeque;
public class ArrayDequeexample {

	public static void main(String[] args) {
//		ArrayDeque a = new ArrayDeque();
//		a.offer(10);
//		a.offer("hii");
//		a.offer(true);
//		a.offer(4.4);
//		a.offerFirst(101);
//		a.offerLast(201);
//		System.out.println(a);//[101, 10, hii, true, 4.4, 201]
		
//		ArrayDeque a = new ArrayDeque();
//		a.offer(10);
//		a.offer("hii");
//		a.offer(true);
//		a.offer(4.4);
//		a.offerFirst(null);
//		a.offerLast(201);
//		System.out.println(a);
		
		ArrayDeque a = new ArrayDeque();
		a.offer(10);
		a.offer("hii");
		a.offer(true);
		a.offer(4.4);
		a.offerFirst(50);
		a.offerLast(20);
		System.out.println(a);//[50, 10, hii, true, 4.4, 20]
		System.out.println(a.peek());//50
		System.out.println(a.peekFirst());//50
		System.out.println(a.peekLast());//20
		
		a.pollFirst();
		System.out.println(a);//[10, hii, true, 4.4, 20]
		a.pollLast();
		System.out.println(a);//[10, hii, true, 4.4]

	}

}
