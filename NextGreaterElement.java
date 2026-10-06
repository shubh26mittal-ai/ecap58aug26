package stackpackage;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	static int[] nextGreaterEle(int[] arr)
	{
		int n = arr.length;
		int[] result = new int[n];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=n-1; i>= 0;i--)
		{
			while(!stack.isEmpty() && stack.peek() <= arr[i])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
			{
				result[i] = -1;
			}else {
				result[i] = stack.peek();
			}
			
			stack.push(arr[i]);
			System.out.println(stack);
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {4,5,2,10,8};
		
		int[] res = nextGreaterEle(arr);
		System.out.println(Arrays.toString(res));//[5, 10, 10, -1, -1]
	}

}
