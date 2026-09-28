package basiccs;
public class SlidingWindowEx1 {
	
	public static int maxSumSubArray(int[] arr , int k)
	{
		int windowSum=0;
		int maxSum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			windowSum += arr[i];
			//window size becomes k value
			if(i >= k-1)
			{
				maxSum = Math.max(maxSum, windowSum);
				//remove the element leaving the window
				
				windowSum -=arr[i-k+1];
			}
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		int ms = maxSumSubArray(arr, k);
		System.out.println(ms);//9
	}

}
