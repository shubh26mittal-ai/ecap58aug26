package wrapperclasses;
import java.util.ArrayList;
import java.util.HashMap;
public class AutoUnboxingDemo {

	public static void main(String[] args) {
		// 1. Basic Auto-unboxing
        Integer obj1 = Integer.valueOf(25);
        int a = obj1;                // Integer -> int automatically
        System.out.println("Basic Auto-unboxing: " + a);

        // 2. Auto-unboxing with different wrappers
        Double dObj = 3.14;
        double d = dObj;             // Double -> double
        System.out.println("Double Unboxing: " + d);

        Boolean bObj = true;
        boolean flag = bObj;         // Boolean -> boolean
        System.out.println("Boolean Unboxing: " + flag);

        Character cObj = 'A';
        char ch = cObj;              // Character -> char
        System.out.println("Character Unboxing: " + ch);

        // 3. Auto-unboxing in arithmetic expressions
        Integer x = 30;
        Integer y = 12;
        int sum = x + y;            // both unboxed, then added
        int product = x * y;        // both unboxed, then multiplied
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // 4. Auto-unboxing in method arguments
        showValue(50);              // autoboxing: int -> Integer
        printInt(obj1);             // auto-unboxing: Integer -> int

        // 5. Auto-unboxing with Collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);               // autoboxing
        list.add(20);
        list.add(30);
        int total = 0;
        for (Integer num : list) {
            total += num;           // auto-unboxing in each iteration
        }
        System.out.println("List Total: " + total);

        // 6. Auto-unboxing with HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Banana", 30);
        int price = map.get("Apple");  // auto-unboxing Integer -> int
        System.out.println("Apple Price: " + price);

        // 7. Auto-unboxing in conditions
        Boolean isActive = true;
        if (isActive) {                // Boolean -> boolean
            System.out.println("System is Active");
        }

        // 8. Auto-unboxing in ternary
        Integer score = 85;
        String result = (score >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }

    public static void printInt(int n) {
        System.out.println("Method Unboxing: " + n);
    }

    public static void showValue(Integer n) {
        System.out.println("Method Autoboxing: " + n);
//Basic Auto-unboxing: 25,Double Unboxing: 3.14,Boolean Unboxing: true,Character Unboxing: A
//Sum: 42,Product: 360,Method Autoboxing: 50,Method Unboxing: 25,List Total: 60,Apple Price: 40
//System is Active,Result: Pass

	}

}
