package interfaceexamples;

//public interface A {
	//int a = 10;
	//public static final int c = 100;
	//public static void main(String[]args)
	//{
		//System.out.println(a);//10
		//System.out.println(c);//100
	//}

//}

//public interface A
//{
	//public abstract void m1();

    //void m2();

    //static void test() {
      //  System.out.println("static method");
    //}

    //static void test1() {          // <-- was: static void test1  (missing ())
      //  System.out.println("static test 1 method");
        
    //}
    //default void add (int a,int b)
    //{
    	//System.out.println(a+b);
    //}
    //default void mul(int a, int b)
    //{
    	//System.out.println(a*b);
    //}
//}

public interface A
{
	static void m1() {              // <-- was: Static  (capital S)
        System.out.println("m1 static method");
    }

    default void m2() {
        System.out.println("m2() default method");
    }
}
