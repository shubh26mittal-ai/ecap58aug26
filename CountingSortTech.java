package sorting;

import java.util.Arrays;

public class CountingSortTech {
	static void countingSort(int[] arr)
	{
		//find the max element in the array
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
//		System.out.println(max);//8
		//count array
		int[] count = new int[max+1];
		
		// count occurance of an elements
		for(int num : arr)
		{
			count[num]++;
		}
		//System.out.println(Arrays.toString(count));//[0, 1, 2, 2, 1, 0, 0, 0, 1]
//	System.out.println(count.length);//9
	    // sorted array with counts
		
		int index = 0;
		for(int i=0;i<count.length;i++)
		{
			while(count[i] > 0)
			{
				arr[index] = i;
				index++;
				count[i]--;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr  = {4,2,2,8,3,3,1};
		
		countingSort(arr);
		
		System.out.println(Arrays.toString(arr));//[1, 2, 2, 3, 3, 4, 8]

	}

}
