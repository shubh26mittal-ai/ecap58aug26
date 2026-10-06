package sorting;
import java.util.Arrays;

public class MergeSortTech {
	
	static void merge(int[] arr , int left , int mid , int right)
	{
		int[] temp = new int[right-left +1];
		int i = left;
		int j = mid+1;
		int k=0;
		
		while(i <= mid && j <= right)
		{
			if(arr[i] <= arr[j])
			{
				temp[k++]=arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i<=mid)
		{
			temp[k++] = arr[i++];
		}
		while(j<=right)
		{
			temp[k++] = arr[j++];
		}
		for(int x =0; x<temp.length;x++)
		{
			arr[left+x] = temp[x];
		}
	}
	
	static void mergeSort(int[] arr , int left  , int right)
	{
		if(left >= right)
		{
			return;
		}
		
		int mid = left +(right-left)/2;
		
		// recursion
		mergeSort(arr, left, mid); //left portion
		mergeSort(arr, mid+1, right);//right portion
		merge(arr , left , mid , right);
		
	}

	public static void main(String[] args) {
		int[] arr = {8,4,2,6,1,5};
		mergeSort(arr , 0 , arr.length-1);

		System.out.println(Arrays.toString(arr));//[1, 2, 4, 5, 6, 8]
		for(int n : arr)
		{
			System.out.println(n);//1,2,4,5,6, 8
		}

	}

}
