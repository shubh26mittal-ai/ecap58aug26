package binarysearch;
//public class RecursiveDemo {
//	 static void printNum(int n)
//	{
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println(i);
//		}
//	}
//	 static void printNum(int n)
//	{
//		if( n == 0)
//		{
//			return;
//		}
//		System.out.println(n);
//		printNum(n-1);//recursive case
//	}
//	 static void printNum(int n)
//	{
//		if( n == 6)
//		{
//			return;
//		}
//		System.out.println(n);
//		printNum(n+1);//recursive case
//	}
//	public static void main(String[] args) {
//		printNum(5);
//		printNum(1);
//	}
//	}

//public class RecursiveDemo {
//
//    static void printNum(int n) {
//        if (n == 0) {
//            return;
//        }
//
//        System.out.println(n);
//        printNum(n - 1);
//    }
//
//    public static void main(String[] args) {
//        printNum(5);
//    }
//}


public class RecursiveDemo {
	static int factorial(int n)
	{
		//base condition
		if(n==0 || n==1)
		{
			return 1;
		}
		//5*4*3*2*1
		return  n*factorial(n-1);
	}
	
public static void main(String[] args) {
	int n = factorial(5);
	System.out.println(n);//120
}	
	
}