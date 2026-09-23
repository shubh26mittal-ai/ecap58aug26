package java8features;

public class MethodReference {
	// static method
	static void simple()
	{
		System.out.println("simple()is referring to abstract method demo()from functional interface");
	}
	//instance method 
	void test()
	{
		System.out.println("test()instance method");
	}
	//constructor reference
	MethodReference()
	{
		System.out.println("constructor as reference to abstract method from functional interface");
	}
	

	public static void main(String[] args) {
		A a1 = ()->{System.out.println("lambda expression");};
		a1.demo();//lambda expression
		
		//static reference
		A a = MethodReference::simple;
        a.demo(); //simple()is referring to abstract method demo()from functional interface

        // 3. instance method reference
        MethodReference m = new MethodReference();
        A a2 = m::test; //constructor as reference to abstract method from functional interface
        a2.demo(); //test()instance method

        // 4. constructor reference
        A a3 = MethodReference::new;
        a3.demo(); //constructor as reference to abstract method from functional interface
		

	}

}
