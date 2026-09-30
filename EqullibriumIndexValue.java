package basiccs;

public class EqullibriumIndexValue {
	public static int findEquilibriumIndex(int[]arr)
	{
		int n = arr.length;
		int []prefix= new int[n+1];
		for(int i=0;i<n;i++)
		{
			prefix[i+1]=prefix[i]+arr[i];
		}
		int totalSum = prefix[n];
		for(int i=0;i<n;i++)
		{
			int leftSum = prefix[i];
			int rightSum = totalSum-prefix[i+1];
			if(leftSum==rightSum)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int []arr = {1,3,5,2,2};
		int res = findEquilibriumIndex(arr);
		System.out.println(res);//2

	}

}
