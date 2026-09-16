package wrapperclasses;

public class UnboxingDemo {

	public static void main(String[] args) {
		// 1. Manual Unboxing (before Java 5)
        Integer obj1 = Integer.valueOf(20);
        int a = obj1.intValue();
        System.out.println("Manual Unboxing: " + a);

        // 2. Auto-unboxing (Java 5+)
        Integer obj2 = 50;
        int b = obj2;              // Integer -> int automatically
        System.out.println("Auto-unboxing: " + b);

        // 3. Auto-unboxing in expressions
        Integer x = 100;
        Integer y = 200;
        int diff = y - x;          // both unboxed, then subtracted
        System.out.println("Difference: " + diff);

        // 4. Auto-unboxing with method call
        Double dObj = 3.14;
        double pi = dObj;          // Double -> double
        System.out.println("Pi: " + pi);

        // 5. Auto-unboxing with Collections
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);              // autoboxed int -> Integer
        list.add(20);
        int val = list.get(0);     // auto-unboxed Integer -> int
        System.out.println("From list: " + val);

        // 6. Auto-unboxing in conditions
        Boolean flag = true;
        if (flag) {                 // Boolean -> boolean automatically
            System.out.println("Flag is true");
//Manual Unboxing: 20,Auto-unboxing: 50,Difference: 100,Pi: 3.14,From list: 10,Flag is true
        }
	}
}