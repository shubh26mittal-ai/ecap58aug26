package basiccs;
import java.util.Arrays;

public class SortedSquareElements {
	
	public static int[] sortedSquare(int[] arr)
	{
		int[] result = new int[arr.length];
		
		int left = 0;
		int right = arr.length-1;
		
		for(int x=arr.length-1 ; x >= 0 ; x--)
		{
			int leftSquare = arr[left] * arr[left];
			int rightSqaure = arr[right] * arr[right];
			
			if(leftSquare > rightSqaure)
			{
				result[x] = leftSquare;
				left++;
			}else {
				result[x] = rightSqaure;
				right--;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		int[] arr = {-7 , -3 , 2 , 3 , 11};
		
		int[] res = sortedSquare(arr);
		
		System.out.println(Arrays.toString(res));//[4, 9, 9, 49, 121]
	}

}