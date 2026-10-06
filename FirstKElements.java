package queuepackage;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class FirstKElements {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		int k=3;
		Stack<Integer> s = new Stack<>();

        // Move first k elements to stack
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        System.out.println("Stack: " + s);//Stack: [10, 20, 30]

        // Put elements back into queue
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

       System.out.println("Queue after stack: " + q);//Queue after stack: [40, 50, 30, 20, 10]

        // Move remaining elements to the back
        int rem = q.size() - k;

        for (int i = 0; i < rem; i++) {
            q.offer(q.poll());
        }

        System.out.println("Final Queue: " + q);//Final Queue: [30, 20, 10, 40, 50]
	}

}
