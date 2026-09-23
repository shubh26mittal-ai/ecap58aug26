package java8features;

//public class Demo {
//public void m1(a,b)
//{
	
//}
//	public static void main(String[] args) {
		

//	}

//}
//@Functional Interface
//interface Demo
//{
//	void m1()
//	void m2()
//	public abstract void m3()
//	void m4()
//}

//@functionalInterface
//interface Demo
//{
	//void simple();
//	int add(int a,int b);
//}
//@functionalInterface
interface Demo
{
	void makeACall();
	static void settings()
	{
		System.out.println("Settings from a phone");
	}
	static void garbageClean()
	{
		System.out.println("unwanted memory cleaning");
	}
	default  void youtube()
	{
		System.out.println("Youtube Playing");
	}
	default void whatsapp()
	{
		System.out.println("chat with friends");
	}
	
	
	
}