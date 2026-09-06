package polymorph;

public class RTPDemoClass1 {

	public void simple()
	{
		System.out.println("simple method without formal parameters from parent class");
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	static void m1()
	{
		System.out.println("static method");
	}
	final void finalMethod()
	{
		System.out.println("final method");
	}
	private void privateMethod()
	{
		System.out.println("private method from parent");
	}
	
public static void main(String[]args) {
	
}
}
