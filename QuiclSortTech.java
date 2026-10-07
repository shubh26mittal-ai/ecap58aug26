package sorting;
import java.util.Arrays;

public class QuiclSortTech {
	static void quickSort(int[] arr , int left , int right)
	{
		if(left < right)
		{
			//find the pivot position
			int pi =pivotPosition(arr,left , right);
			System.out.println(pi);
			
			// sort the left part of the pivot
			quickSort(arr , left , pi-1);
			//sort the right part of the pivot
			quickSort(arr, pi+1 , right);
		}
	}

	static int pivotPosition(int[] arr , int left , int right)
	{
		//consider last element as the pivot element
		int pivot = arr[right];
		int i = left-1; //0-1=-1 
		for(int j=left;j<right;j++)
		{
			if(arr[j] <= pivot)
			{
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		// we need to place pivot position in correct place
		
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		int[] arr = {10 , 7 , 8 , 9, 1 , 5};
		System.out.println("Before sorting : " + Arrays.toString(arr));//Before sorting : [10, 7, 8, 9, 1, 5]

		quickSort(arr ,0 , arr.length-1);
		
		
		System.out.println("After sorting : " + Arrays.toString(arr));//After sorting : [1, 5, 7, 8, 9, 10]

	}

}
