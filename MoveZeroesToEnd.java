package basiccs;
import java.util.Arrays;

public class MoveZeroesToEnd {
	
	public static void moveZeroes(int[] arr)
	{
		int slow=0;
		for(int fast=0;fast<arr.length;fast++)
		{
			if(arr[fast] != 0)
			{
				int temp = arr[slow];
				arr[slow] = arr[fast];
				arr[fast] = temp;
				slow++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));//[1, 3, 12, 0, 0]

	}

}
//time complexity :- O(n)