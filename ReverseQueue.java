package queuepackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		System.out.println("origional collections");//origional collections
		System.out.println(q);//[10, 20, 30, 40, 50]
		Stack<Integer> s=new Stack<>();
		while (!q.isEmpty()) {
            s.push(q.poll());
        }

        System.out.println("Stack");//Stack
        System.out.println(s);//[10, 20, 30, 40, 50]

        System.out.println("Queue after removing elements:");//Queue after removing elements:
        System.out.println(q);//[]

        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        System.out.println("Queue after reversing");//Queue after reversing
        System.out.println(q);//[50, 40, 30, 20, 10]
	}

}
