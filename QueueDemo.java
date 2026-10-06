package queuepackage;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		System.out.println(q);//[10, 20, 30, 40, 50]
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		System.out.println(q);//[]
		q.poll();
		q.poll();
		q.poll();
		q.poll();
		q.poll();
		System.out.println(q.peek());//null
		System.out.println(q.poll());//null
		System.out.println(q.peek());//null
		System.out.println(q.isEmpty());//true

	}

}
