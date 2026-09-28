package basiccs;
import java.util.Arrays;

public class RemoveElementsFromArray {

	public static int removeElement(int[] arr , int value)
	{
		int slow = 0;
		
		for(int fast=0;fast < arr.length;fast++)//O(n)
		{
			if(arr[fast] != value)
			{
				arr[slow] = arr[fast];
				slow++;
			}
		}
		return slow;
	}
	public static void main(String[] args) {
		int[] arr = {3,2,2,3,5,3,8};
		
		int n = removeElement(arr , 3);
		
//		System.out.println(n);
		for(int i=0;i<n;i++) //O(n)
		{
			System.out.print(arr[i]+" "); //2 2 5 8 
		}

	}

}

// O(n) + O(n) => O(2n) => O(n)
