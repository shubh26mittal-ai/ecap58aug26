//package basiccs;
//public class ArrayBasicPrograms {
//
//	public static void main(String[] args) {
//		int size = 8;
//		int[] arr = new int[size];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
//		arr[7] = 80;
//		
//		
//		
//		// OR
//		int[] arr1 = {10,20,30,40,50,60,70,80};
//		System.out.println(arr1.length);//8
//		int first = arr1[0];
//		System.out.println("first element in the array : "+ first);//first element in the array : 10
//		int last = arr1[arr1.length-1];
//		System.out.println("last element in the array : "+ last);//last element in the array : 80
//
//	}
//
//}

//public class ArrayBasicPrograms {
//
//	public static void main(String[] args) {
//
//		int[] arr = {1,2,3,4,5};
//		int sum = 0; // O(1)
//		for(int i=0;i<arr.length;i++) // O(n)
//		{
//			sum+=arr[i];
//		}
//		System.out.println(sum);//15
//	}
//	
//	//Time complexity -  O(1) + O(n) =  O(1+n) => O(1n) => O(n)
//	//Space complexity- O(1) + O(n) = O(n)
//
//}

//public class ArrayBasicPrograms {
//
//	public static void main(String[] args) {
//
//		int[] arr = {1,2,3,4,5,6,7,8};
//		for(int i=0;i<arr.length;i++) //O(n)
//		{
//			int count = 0;   // O(1)
//			for(int j=1;j<=arr[i];j++)  // O(n)
//			{
//				if(arr[i]%j == 0)
//				{
//					count = count+1;
//				}
//			}
//			if(count == 2)
//			{
//				System.out.println(arr[i] + " is a prime numbers");
//			}//2 is a prime numbers,3 is a prime numbers,5 is a prime numbers,7 is a prime numbers
//		}
//		
//	}
//	
//	//Time complexity -  O(1) * O(n) * O(n) =  O(1*n*n) => O(n^2)
//	//Space complexity- O(1) * O(n) * O(n) = O(n^2)
//
//}

//public class ArrayBasicPrograms {
//
//	public static void main(String[] args) {
//
//		int[] arr = {1,2,3,4,5,6,7,8};
//		for(int i=0;i<arr.length;i++) //O(n)
//		{
//			int num = arr[i];
//			int sum = 0;   // O(1)
//			for(int j=1;j< num;j++)  // O(n)
//			{
//				if(num%j == 0)
//				{
//					sum = sum+j;
//				}
//			}
//			if(sum == num)
//			{
//				System.out.println(arr[i] + " is a perfect numbers");//6 is a perfect numbers
//			}
//		}
//		
//	}
//	
//	//Time complexity -  O(1) * O(n) * O(n) =  O(1*n*n) => O(n^2)
//	//Space complexity- O(1) * O(n) * O(n) = O(n^2)
//
//}