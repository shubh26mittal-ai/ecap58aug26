package collections.queue;
import java.util.PriorityQueue;
public class QueueExamples {

	public static void main(String[] args) {
//		PriorityQueue p = new PriorityQueue();
//		System.out.println(p);//[]
//		p.offer(10);
//		p.offer(20);
//		p.offer(30);
//		p.offer(40);
//		p.offer(50);
//		System.out.println(p);//[10, 20, 30, 40, 50]
//		System.out.println(p.peek());//10
//		p.poll();
//		System.out.println(p);//[20, 40, 30, 50]
		
		PriorityQueue p = new PriorityQueue();
		System.out.println(p);//[]
		p.offer(3);
		p.offer(2);
		p.offer(7);
		p.offer(4);
		p.offer(5);
		System.out.println(p);//[2, 3, 7, 4, 5]
		

	}

}
