package stackpackage;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "HELLO"; //O(1)
		
		Stack<Character> stack = new Stack<>(); // O(1)
		
		for(char ch : s.toCharArray()) // O(n)
		{
//			System.out.println(ch);
			stack.push(ch);
		}
		
		System.out.println(stack);//[H, E, L, L, O]
//		System.out.println(stack.isEmpty());
		
		String reversedStr = ""; //O(1)
		
		while(!stack.isEmpty()) //O(n)
		{
			reversedStr += stack.pop();
		}
		System.out.println("Original String is : "+s);//Original String is : HELLO
		System.out.println("Reversed String is : "+reversedStr);//Reversed String is : OLLEH
	}

}

// TC - O(1)+O(1)+O(n)+O(1)+O(n) = O(1+1+n+1+n) = O(5n) => O(n)
