//public class ArraysProgram {
  //public static void main(String[] args) {
    //int[]arr = {10,20,30,40,50};
    //System.out.println(arr[0]);//10
    //System.out.println(arr[1]);//20
    //System.out.println(arr[2]);//30
    //System.out.println(arr[3]);//40
    //System.out.println(arr[4]);//50
    //System.out.println(arr.length);//5
  //}  
//}

//public class ArraysProgram {
  //public static void main(String[] args) {
    //int[]arr = {10,20,30,40,50};
    //int first=arr[0];
    //int lastElement=arr[arr.length-1];
    //int sum=first+lastElement;
    //System.out.println(sum);//60
  //}
//}
//import java.util.Arrays;

//public class ArraysProgram {
  //public static void main(String[] args) {
    //int []arr={10,20,30,40,50,60};
    //System.out.println(Arrays.toString(arr));//[10, 20, 30, 40, 50, 60]
//int temp=arr[0];
//arr[0]=arr[arr.length-1];
//arr[arr.length-1]=temp;
  //  System.out.println(Arrays.toString(arr));//[60, 20, 30, 40, 50, 10]  
//}
//}
//import java.util.Arrays;

//public class ArraysProgram {
  //public static void main(String[] args) {
    //int[]arr={10,20,30,40,50,60};
    //arr[0]=arr[0]+arr[arr.length-1];
    //System.out.println(arr[0]);//70
    //arr[arr.length-1]=arr[0]-arr[arr.length-1];
    //arr[5]=70-60=10;
    //arr[0]=arr[0]-arr[arr.length-1];
    //arr[0]=70-10=60;
    //System.out.println(Arrays.toString(arr));//[60, 20, 30, 40, 50, 10]
  //}
//}

//public class ArraysProgram {
  //  public static void main(String[] args) {
       // int[]arr={1,6,5,9,3,2,8,4}; 
        //for(int i=0;i<arr.length;i++){
          //  if(arr[i]%2==0){
            //    System.out.println(arr[i]);//6 2 8 4
            //}
        //}
    //}
//}
//public class ArraysProgram {
    //public static void main(String[] args) {
      //  int[] arr = {1, 6, 5, 9, 3, 4};
        //int sum = 0;
        //for (int i = 0; i < arr.length; i++) {
          //  sum = sum + arr[i];
        //}
        //System.out.println(sum);
    //}
//}
//public class ArraysProgram {
  //  public static void main(String[] args) {
    //    int[] arr = {1, 2, 3, 4, 5, 6, 7};
      //  System.out.print("Prime numbers: ");
        //for (int i = 0; i < arr.length; i++) {
          //  if (isPrime(arr[i])) {
            //    System.out.print(arr[i] + " ");
            //}
        //}
    //}
    //public static boolean isPrime(int n) {
      //  if (n <= 1) {
        //    return false;
        //}
        //for (int i = 2; i < n; i++) {
          //  if (n % i == 0) {
            //    return false;
            //}
        //}
        //return true;//Prime numbers: 2 3 5 7 
    //}
//}
//import java.util.Arrays;   // ← Add this at the top

//public class ArraysProgram {
  //  public static void main(String[] args) {
     //   int[] arr = {5, 1, 4, 3, 6, 2};

       // System.out.println("Before sorting: ");
        //System.out.println(Arrays.toString(arr));   // Arrays (with 's')

        //for (int i = 0; i < arr.length - 1; i++) {
          //  for (int j = 0; j < arr.length - 1 - i; j++) {
            //    if (arr[j] > arr[j + 1]) {
                //    int temp = arr[j];
                  //  arr[j] = arr[j + 1];
                    //arr[j + 1] = temp;
                //}
            //}
        //}

        //System.out.println("After sorting: ");
        //System.out.println(Arrays.toString(arr));   // Arrays (with 's'), NOT Array
    //}
//}
//class Main {
//public static void main(String[]args)
//{
   // int [] arr = {5,1,4,3,6,2};
    //int target=3;
    //for(int i=0;i<=arr.length-1;i++)
    //{//
       // if(arr[i]==target){
         //   System.out.println(arr[i]+"is present");
          //  break;
        //}
        //else{
          //  System.out.println("Element not found");//Element not foundElement not foundElement not found3is present
        //}
    //}
//}  
//}  
//public static void main(String[]args){
  //  int []arr = {5,1,4,3,6,2};
    //int target=13;
    //boolean flag = false;
    //for (int i=0;i<=arr.length-1;i++){
       // if(arr[i]==target){
           // flag=true;
        //}
    //}
    //if(flag==true){
      //  System.out.println(target+"is present");
    //}else{
      //  System.out.println(target+"is not present");
    //}
//}
//}
//import java.util.Arrays;

//public class Main {
  //  public static void main(String[] args) {
       // int[] arr = {1, 2, 3, 2, 1};

        // Find and print duplicates
        //for (int i = 0; i <= arr.length - 1; i++) {
          //  for (int j = i + 1; j <= arr.length - 1; j++) {
            //    if (arr[i] != 0 && arr[i] == arr[j]) {
              //      System.out.println(arr[i]);
                //    arr[j] = 0;
                //}
            //}
       // }

        //System.out.println(Arrays.toString(arr));

        // Print non-zero (remaining) elements
        //for (int k = 0; k < arr.length; k++) {
          //  if (arr[k] != 0) {
            //    System.out.println(arr[k]);
            //}
        //}
    //}
//}