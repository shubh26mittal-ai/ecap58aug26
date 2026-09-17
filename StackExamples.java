package collections.listcollections;
import java.util.Stack;
public class StackExamples {

	public static void main(String[] args) {
		//Stack s = new Stack();
		//s.add(10);
		//s.add(20);
		//s.add(30);
		//s.add("hii");
		//s.add(null);
		//s.add(20);
		//System.out.println(s);//[10, 20, 30, hii, null, 20]
		
		Stack s = new Stack();
		s.push(10);
		s.push("hii");
		s.push(50);
		s.push(100);
		s.push(120);
		s.push(130);
		System.out.println(s);//[10, hii, 50, 100, 120, 130]
		System.out.println(s.peek());//130
		System.out.println(s.pop());//130
		System.out.println(s);//[10, hii, 50, 100, 120]
		s.pop();
		System.out.println(s);//[10, hii, 50, 100]
		System.out.println(s.get(0));//10

	}

}
