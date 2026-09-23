package DSAProgram1;

public class DSAProgram1 {
	   public static void main(String[] args) {
	        //int arr[] = {18,10,25,7,45,32,5,4,10,30,54,18,95,30,17,43,99,101,320,500};
	        int arr[] = {45, 18, 10, 25, 7, 32};
	        int largest = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                System.out.println("comparisons:" + i);
	                largest = arr[i];
	            }
	        }
	        System.out.println("largest = " + largest);
	    }
	}
//public class DSAProgram1 {
//
//    public static void main(String[] args) {
//        int arr[] = {18,10,25,7,45,32,5,4,10,30,54,18,95,30,17,43,99,101,320,500};
//        int largest = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                System.out.println("comparisons:" + i);
//                largest = arr[i];
//            }
//        }
//        System.out.println("largest = " + largest);
//    }
//}
//output
//comparisons:2
//comparisons:4
//comparisons:10
//comparisons:12
//comparisons:16
//comparisons:17
//comparisons:18
//comparisons:19
//largest = 500