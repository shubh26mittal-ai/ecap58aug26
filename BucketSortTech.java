package sorting;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class BucketSortTech {
//	static void bucketSort(int[] arr)
//	{
//		int n = arr.length;//9
//		//create buckets
//		List<Integer>[] buckets = new ArrayList[n];
//		
//		for(int i=0;i<n;i++)
//		{
//			buckets[i] = new ArrayList<>();
//		}
//		System.out.println(Arrays.toString(buckets));//[[], [], [], [], [], [], [], [], []]
//	
//		int max = arr[0];
//		for(int num : arr)
//		{
//			max = Math.max(max, num);
//		}
//		System.out.println(max);//52
//	
//		//store the elements into buckets
//		for(int num : arr)
//		{
//			int index = (num*n)/(max+1);
//			buckets[index].add(num);
//		}
//		System.out.println(Arrays.toString(buckets));
//		
//		//sort the elements inside individual bucket
//		for(int i=0;i<n;i++)
//		{
//			Collections.sort(buckets[i],Collections.reverseOrder());
//		}
//		System.out.println(Arrays.toString(buckets));
//	
//		// merge the buckets into single sorted array
//		int index = 0;
//		for(int i=n-1;i>=0;i--)
//		{
//			System.out.println(buckets[i]);
//			for(int num:buckets[i])
//			{
//				System.out.println(num);
//				arr[index++] = num;
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {42,32,33,52,37,47,51,19,14};
//		
//		bucketSort(arr);
//
//		System.out.println(Arrays.toString(arr));//[52, 51, 47, 42, 37, 33, 32, 19, 14]
//	}
//
//}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSortTech {
	static void bucketSort(int[] arr)
	{
		int n = arr.length;//9
		//create buckets
		List<Integer>[] buckets = new ArrayList[n];
		
		for(int i=0;i<n;i++)
		{
			buckets[i] = new ArrayList<>();
		}
		System.out.println(Arrays.toString(buckets));//[[], [], [], [], [], [], [], [], []]
	
		int max = arr[0];
		for(int num : arr)
		{
			max = Math.max(max, num);
		}
		System.out.println(max);//52
	
		//store the elements into buckets
		for(int num : arr)
		{
			int index = (num*n)/(max+1);
			buckets[index].add(num);
		}
		System.out.println(Arrays.toString(buckets));
		
		//sort the elements inside individual bucket
		for(int i=0;i<n;i++)
		{
			Collections.sort(buckets[i],Collections.reverseOrder());
		}
		System.out.println(Arrays.toString(buckets));
	
		// merge the buckets into single sorted array
		int index = 0;
		for(int i=1;i<n;i++)
		{
			System.out.println(buckets[i]);
			for(int num:buckets[i])
			{
				System.out.println(num);
				arr[index++] = num;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {42,32,33,52,37,47,51,19,14};
		
		bucketSort(arr);

		System.out.println(Arrays.toString(arr));//[14, 19, 32, 33, 37, 42, 47, 51, 52]

	}

}