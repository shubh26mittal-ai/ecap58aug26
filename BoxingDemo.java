package wrapperclasses;

public class BoxingDemo {

	public static void main(String[] args) {
		

		        // 1. Manual Boxing (before Java 5)
		        int a = 10;
		        Integer obj1 = Integer.valueOf(a);
		        System.out.println("Manual Boxing: " + obj1);

		        // 2. Autoboxing (Java 5+)
		        Integer obj2 = a;          // int -> Integer automatically
		        System.out.println("Autoboxing: " + obj2);

		        // 3. Manual Unboxing
		        int b = obj1.intValue();
		        System.out.println("Manual Unboxing: " + b);

		        // 4. Auto-unboxing
		        int c = obj2;             // Integer -> int automatically
		        System.out.println("Auto-unboxing: " + c);

		        // 5. Autoboxing in expressions
		        Integer x = 5;
		        Integer y = 10;
		        int sum = x + y;          // unboxed, added, result is int
		        System.out.println("Sum: " + sum);
//Manual Boxing: 10,Autoboxing: 10,Manual Unboxing: 10,Auto-unboxing: 10,Sum: 15	        
		    }
		


	}


