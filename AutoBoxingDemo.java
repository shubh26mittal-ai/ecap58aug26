package wrapperclasses;
import java.util.ArrayList;
public class AutoBoxingDemo {

	public static void main(String[] args) {
		// 1. Basic Autoboxing
        int a = 10;
        Integer obj1 = a;            // int -> Integer automatically
        System.out.println("Basic Autoboxing: " + obj1);

        // 2. Autoboxing with different primitives
        char c = 'X';
        Character charObj = c;        // char -> Character
        System.out.println("Char Autoboxing: " + charObj);

        double d = 99.99;
        Double doubleObj = d;        // double -> Double
        System.out.println("Double Autoboxing: " + doubleObj);

        // 3. Autoboxing in method arguments
        Integer result = square(5);  // 5 (int) autoboxed to Integer
        System.out.println("Method Autoboxing: " + result);

        // 4. Autoboxing with Collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);               // int autoboxed to Integer
        list.add(200);
        System.out.println("List Autoboxing: " + list);

        // 5. Autoboxing in expressions (mixing primitive & wrapper)
        Integer x = 50;              // autoboxing
        Integer y = 50;
        Integer sum = x + y;         // unboxed, added, re-boxed
        System.out.println("Sum: " + sum);

        // 6. Autoboxing with Conditional (Ternary)
        boolean flag = true;
        Integer val = flag ? 1 : 0;  // primitive int autoboxed to Integer
        System.out.println("Ternary Autoboxing: " + val);
    }

    // Method that accepts an Integer wrapper
    public static Integer square(Integer n) {
        return n * n;
//Basic Autoboxing: 10,Char Autoboxing: X,Double Autoboxing: 99.99,Method Autoboxing: 25,       
//List Autoboxing: [100, 200],Sum: 100,Ternary Autoboxing: 1      

	}

}
