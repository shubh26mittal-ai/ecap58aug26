package basiccs;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class Demo {
//
//	public static void main(String[] args) {
//		int[] arr = {10 , 4 , -1 , 5 , 15};
//		
//		int x = 15;//O(1)
//		for(int i=0;i<arr.length;i++)//O(n)
//		{
//			for(int j=0;j<arr.length;j++)//O(n)
//			{
//				if(arr[i] == arr[j]) 
//					{System.out.println("Element found"); //Element found
//					}
//					
//				else 
//			{System.out.println("Element not found"); //Element not found
//			}
//			}
//		}
//		
//	}
//
//}


// public class Demo {

// 	public static void main(String[] args) {
// 		int[] arr = {10 , 4 , -1 , 5 , 15};
		
// 		int target = 15;//O(1)
// 		System.out.println(Arrays.toString(arr));//[10, 4, -1, 5, 15]
// 		Arrays.sort(arr);
// 		System.out.println(Arrays.toString(arr));//[-1, 4, 5, 10, 15]
		
// 		int left = 0;// O(log n) space compexity
// 		int right = arr.length-1;//// O(log n) space compexity
		
// 		while(left <= right)  
// 		{
// 			int mid = left+(right-left)/2;//// O(log n) space compexity
// 			System.out.println(mid);
// 			if(arr[mid] == target)
// 			{
// 				System.out.println(target+ " element is found at index : "+ mid);//15 element is found at index : 4
// 			   break;
// 			}
// 			else if(target < arr[mid]) {
// 				right = mid-1;
// 			}
// 			else {
// 				left = mid+1;
// 			}
// 		}
		
// 		}
		
	//}