package basiccs;

public class PrefixSumMultipleQueries {

	public static void main(String[] args) {
		int []arr= {2,4,1,5,3};
		//prefixsum[2,6,7,12,15]
		int [][]queries= {
				{1,3},
				{0,2},
				{2,4}
		};
		int n=arr.length;
		int[]prefix=new int[n+1];
		for(int i=0;i<arr.length;i++)
		{
			prefix[i+1]=prefix[i]+arr[i];
			
		}
		for(int[]q:queries)
		{
			int left =q[0];
			int right=q[1];
			int sum=prefix[right+1]-prefix[left];
			System.out.println(sum);//10,7,9
		}
		

	}

}
