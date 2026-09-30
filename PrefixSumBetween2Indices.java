package basiccs;

public class PrefixSumBetween2Indices {
	public static int sumRange(int[]arr,int left,int right)
	{
		int []prefix=new int [arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			prefix[i]=prefix[i-1]+arr[i];
		}
		if(left==0)
		{
			return prefix[right];
		}
		return prefix[right]-prefix[left-1];
	}

	public static void main(String[] args) {
		int[]arr= {2,4,1,5,3};
		int left=0;
		int right=2;
		int res=sumRange(arr,left,right);
		System.out.println(res); //7
		

	}

}
