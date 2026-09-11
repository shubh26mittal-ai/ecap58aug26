// public class Demo {
    // public static void main(String[]args){
        // try{
            // Thread.sleep(millis:1000);
        // }catch (Exception e)
        // {

        // }


    // }
    
// }

//public class Demo{
  //  public static void main(String[]args)
    //{
      //   int a = 100;
         //int b = 0;
         //int res = a/b;
        //  System.out.println(res);//java.lang.ArithmeticException

    // }
// }
//public class Demo {
    // public static void main(String[] args) {

        // try {
            // int a = 100;
            // int b = 0;
            // int res = a / b;
            // System.out.println(res);
        // }
        // catch (ArithmeticException e) {
            // System.out.println("Number cannot divide by 0");//Number cannot divide by 0
        // }
    // }
// }
//public class Demo {
  //  public static void main(String[] args) {

    //    try {
      //      int a = 100;
        //    int b = 0;

          //  int res = a / b;

            //System.out.println(res);
            //System.out.println("try block is executing");
        //}
        //catch (ArithmeticException e) {
          //  System.out.println("Number cannot be divided by zero");
           // System.out.println("catch block is executing");
        //}
        //finally {
          //  System.out.println("Finally is printing with try");
        //}
    //}
//}
 public class Demo {
    public static void main(String[] args) {

        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {10, 20, 30, 40, 50};
            arr[8] = 90;
            System.out.println(arr[9]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        // 2. StringIndexOutOfBoundsException
        try {
            String s1 = "ExcelR";
            System.out.println(s1.charAt(7));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index");
        }

        // 3. Number conversion
        String s2 = "101";
        int t1 = Integer.parseInt(s2);
        System.out.println(t1 + 5);

        // 4. NumberFormatException
        try {
            String s3 = "ExcelR";
            int t2 = Integer.parseInt(s3);
            System.out.println(t2);
        }
        catch (NumberFormatException e) {
            System.out.println("String cannot be converted to number");
        }

        // 5. NullPointerException
        try {
            String s4 = null;
            System.out.println(s4.length());
        }
        catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}