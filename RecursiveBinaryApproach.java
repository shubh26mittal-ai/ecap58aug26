package binarysearch;
public class RecursiveBinaryApproach {
	
	static int binarySearch(int[] arr , int target , int low , int high)
	{
		//base case 
		if(low > high)
		{
			return -1;
		}
		
		int mid = low + (high-low)/2;
		
		//element is in mid
		if(arr[mid] == target)
		{
			return mid;
		}
		
		//search in left
		if(target < arr[mid])
		{
			return  binarySearch(arr , target , 0,mid-1);
		}
		
		//search in right half
		if(target > arr[mid])
		{
			return  binarySearch(arr , target , mid+1,high);
		}
		
		return mid;
	}

	public static void main(String[] args) {
			int[] arr = {10,20,30,40,50,60,70};
	        int target = 90;

	        int result = binarySearch(arr , target , 0 , arr.length-1);

	        if(result != -1)
	        {
	        	System.out.println("Element found at index : "+ result);
	        }
	        else {
	        	System.out.println("Element not found");

	}

	}
}
