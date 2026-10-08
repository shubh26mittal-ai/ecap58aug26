package binarysearch;
public class IterativeBinaryApproach {
static int binarySearch(int[] arr , int target)
{
	int low = 0;
	int high = arr.length-1;
	while(low <= high)
	{

		int mid = low + (high-low)/2;
		
		if(arr[mid] == target)
		{
			return mid;
		}
		
		else if(target < arr[mid])
		{
			high = mid-1;
		}
		else {
			low = mid+1;
		}
	}
	
	return -1;
}
public static void main(String[]args) {
	int[] arr = {10,20,30,40,50,60,70};
    int target = 50;
    
    int binaryIndex = binarySearch(arr , target);


    if(binaryIndex != -1)
    {
  	  System.out.println("Element found at index : "+ binaryIndex);//Element found at index : 4
    }else {
  	  System.out.println("Element Not found");
    }
}
}

