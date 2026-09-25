package basiccs;
//public class SecondLargestElement {
//
//	public static void main(String[] args) {
//		int[] arr = {10 , 5, 20 , 8 , 20 , 15};
//		
//		int largest = 0; // O(1)
//		int secondLargest =0;//O(1)
//		System.out.println(largest);
//		
//		for(int i=0 ; i<arr.length;i++) // O(n)
//		{
//			System.out.println(arr[i]);
//			if(arr[i] > largest)
//			{
//				secondLargest = largest;
//				largest = arr[i];
//			}
//			else if(arr[i] > secondLargest && arr[i]!=largest)
//			{
//				secondLargest = arr[i];
//			}
//			System.out.println(largest);
//			System.out.println(secondLargest);
//		}
//		System.out.println("First largest element is  : "+ largest);//First largest element is  : 20
//		System.out.println("Second largest element is : " + secondLargest);//Second largest element is : 15
//	}
//}
// time complexity :-  O(1) + O(1) + O(n) = O(1+1+n) => O(2n) => O(n)

