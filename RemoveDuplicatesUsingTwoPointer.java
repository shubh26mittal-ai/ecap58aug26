package basiccs;
//import java.util.Arrays;
//
//public class RemoveDuplicatesUsingTwoPointer {
//	
//	public static int removeDuplicateFromArr(int[] arr)
//	{
//		if(arr.length == 0) {
//			return 0;
//		}
//		
//		int slow = 0;
//		for(int fast =1;fast<arr.length;fast++)  //O(n)
//		{
//			if(arr[fast] != arr[slow]) {
//				slow++;
//				arr[slow] = arr[fast];
//			}
//		}
//		return slow + 1;
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {1,1,2,7,2,3,4,4,5};
//		Arrays.sort(arr);
//		
//		int n = removeDuplicateFromArr(arr);
//		System.out.println(n);
//		
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
//	}
//
//}//123457

