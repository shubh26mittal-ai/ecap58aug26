package basiccs;
import java.util.Arrays;
public class BasicPrefixSumArray {
	public static int []demoPrefixSum(int[]arr)
	{
		int[] prefix  =new int [arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			prefix[i]=arr[i]+prefix[i-1];
		}
		return prefix;
	}

	public static void main(String[] args) {
		int []arr= {2,4,1,5,3};
		int []res=demoPrefixSum(arr);
		System.out.println(Arrays.toString(res)); //[2, 6, 7, 12, 15]

	}

}
