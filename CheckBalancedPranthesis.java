package stackpackage;
import java.util.Stack;

public class CheckBalancedPranthesis {
	static boolean isBalanced(String str)
	{
		Stack<Character> stack = new Stack<>();
//		System.out.println(stack);
		for(char ch : str.toCharArray())
		{
			//push only opening brackets
			if(ch =='(' || ch == '{' || ch =='[')
			{
				stack.push(ch);
			}
			 //closing brackets
			else if(ch ==')' || ch == '}' || ch ==']')
			{
				// no opening brackets available 
				if(stack.isEmpty())
				{
					return false;
				}
				char top = stack.pop();
				
				//check matching pair
				if((ch==')' && top != '(') ||
						(ch=='}' && top != '{') ||
						(ch==']' && top != '['))
				{
					return false;
				}
			}
		}
		System.out.println(stack);//[{, [, (]
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "{[()]}";//Paranthesis is balanced
		//String str = "{[()}";//Paranthesis is not balanced
		if(isBalanced(str))
		{
			System.out.println("Paranthesis is balanced");//Paranthesis is balanced
		}else {
			System.out.println("Para`nthesis is not balanced");
		}

	}

}
