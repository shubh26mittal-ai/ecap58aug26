package stackpackage;
import java.util.Stack;
public class Demo {

	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		System.out.println(s);//[]
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);//[10, 20, 30]
		System.out.println("Top element:"+s.peek());//Top element:30
		System.out.println("remove element:"+s.pop());//remove element:30
		System.out.println(s);//[10, 20]

	}

}
